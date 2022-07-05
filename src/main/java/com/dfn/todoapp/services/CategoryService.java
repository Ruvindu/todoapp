package com.dfn.todoapp.services;

import com.dfn.todoapp.entity.Category;
import com.dfn.todoapp.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
//@Transactional
public class CategoryService {

    @Autowired
    private final CategoryRepository catRepo;

    public CategoryService(CategoryRepository catRepo) {
        this.catRepo = catRepo;
    }

    public void create_category(Category category) throws RuntimeException{
        this.catRepo.save(category);
    }

    public List<Category> get_all_categories() throws RuntimeException{
        return this.catRepo.findAll();
    }



}
