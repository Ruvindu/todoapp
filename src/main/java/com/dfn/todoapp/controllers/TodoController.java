package com.dfn.todoapp.controllers;

import com.dfn.todoapp.dto.UpdateImportantDTO;
import com.dfn.todoapp.dto.UpdateStatusDTO;
import com.dfn.todoapp.entity.Category;
import com.dfn.todoapp.entity.Todo;
import com.dfn.todoapp.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/")
public class TodoController {

    @Autowired
    private final TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @PostMapping(path = "/createtodo")
    public ResponseEntity create_todo(@RequestBody Todo todo){
        try{
            this.todoService.create_todo(todo);
            return ResponseEntity.ok().build();
        }catch (Exception e){
            return ResponseEntity.badRequest().build();
        }
    }

    @GetMapping(path = "/gettodos")
    public ResponseEntity<List<Todo>> get_todos(){
        return ResponseEntity.ok().body(todoService.get_all_todos());
    }

    @GetMapping(path = "/getimportants")
    public ResponseEntity<List<Todo>> get_important_todos(){
        return ResponseEntity.ok().body(todoService.get_important_Todos());
    }

    @GetMapping(path = "/gettodosbycat/{cat_id}" )
    public ResponseEntity<List<Todo>> get_todos_by_cat(@PathVariable Integer cat_id){
        return ResponseEntity.ok().body(todoService.get_todos_by_cat(cat_id));
    }

    @PutMapping(path = "/updateimportant")
    public ResponseEntity update_important(@RequestBody UpdateImportantDTO updateImportantDTO){
        try{
            this.todoService.update_important(updateImportantDTO);
            return ResponseEntity.ok().build();
        }catch (Exception e){
            return ResponseEntity.badRequest().build();
        }
    }

    @PutMapping(path = "/updatestatus")
    public ResponseEntity update_important(@RequestBody UpdateStatusDTO updateStatusDTO){
        try{
            this.todoService.update_status(updateStatusDTO);
            return ResponseEntity.ok().build();
        }catch (Exception e){
            return ResponseEntity.badRequest().build();
        }
    }

    @PutMapping(path = "/updatetodo")
    public ResponseEntity update_todo(@RequestBody Todo todo){
        try{
            this.todoService.update_todo(todo);
            return ResponseEntity.ok().build();
        }catch (Exception e){
            return ResponseEntity.badRequest().build();
        }
    }

}
