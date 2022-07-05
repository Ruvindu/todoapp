package com.dfn.todoapp.controllers;

import com.dfn.todoapp.entity.Category;
import com.dfn.todoapp.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1")
public class CategoryController {

    @Autowired
    private final CategoryService catService;

    public CategoryController(CategoryService catService) {
        this.catService = catService;
    }

    @PostMapping(path = "/createcate")
    public ResponseEntity create_category(@RequestBody Category category){
        try{
            this.catService.create_category(category);
            return ResponseEntity.ok().build();
        }catch (Exception e){
            return ResponseEntity.badRequest().build();
        }
    }

    @GetMapping(path = "/getcates")
    public ResponseEntity<List<Category>> get_categories(){
        return ResponseEntity.ok().body(catService.get_all_categories());
    }

}
