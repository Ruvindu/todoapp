package com.dfn.todoapp.services;

import com.dfn.todoapp.dto.UpdateImportantDTO;
import com.dfn.todoapp.dto.UpdateStatusDTO;
import com.dfn.todoapp.entity.Category;
import com.dfn.todoapp.entity.Todo;
import com.dfn.todoapp.repository.CategoryRepository;
import com.dfn.todoapp.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
//@Transactional
public class TodoService {

    @Autowired
    private final TodoRepository todoRepo;
    @Autowired
    private final CategoryRepository catRepo;

    public TodoService(TodoRepository todoRepo, CategoryRepository catRepo) {
        this.todoRepo = todoRepo;
        this.catRepo = catRepo;
    }

    public void create_todo(Todo todo) throws RuntimeException {

        Category refcat =  this.catRepo.findById(todo.getTodoCategory().getCatId()).get();
        todo.setTodoCategory(refcat);

        this.todoRepo.save(todo);
    }

    public void update_todo(Todo todo) throws RuntimeException {

        if (todoRepo.existsById(todo.getTodoId())){
            Category refcat =  this.catRepo.findById(todo.getTodoCategory().getCatId()).get();
            todo.setTodoCategory(refcat);
            todo.setCreated_at(this.todoRepo.findById(todo.getTodoId()).get().getCreated_at());

            this.todoRepo.save(todo);
        }

    }

    public List<Todo> get_all_todos() throws RuntimeException{
        return this.todoRepo.findAll();
    }

    public List<Todo> get_important_Todos() throws RuntimeException{
        return this.todoRepo.getImportantTodos();
    }

    public List<Todo> get_todos_by_cat(Integer cat_id) throws RuntimeException{
        return this.todoRepo.getTodosByCats(cat_id);
    }

    public void update_important(UpdateImportantDTO updateImportantDTO) throws RuntimeException{
        this.todoRepo.updateImportant(updateImportantDTO.getTodo_id(),updateImportantDTO.getImportant());
    }

    public void update_status(UpdateStatusDTO updateStatustDTO) throws RuntimeException{
        System.out.println(updateStatustDTO.toString());
        this.todoRepo.updateStatus(updateStatustDTO.getTodo_id(),updateStatustDTO.getStatus());
    }

}
