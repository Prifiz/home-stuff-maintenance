package com.github.prifiz.homestuffmaintenance.web.controller;

import com.github.prifiz.homestuffmaintenance.model.Category;
import com.github.prifiz.homestuffmaintenance.service.CategoryNotFoundException;
import com.github.prifiz.homestuffmaintenance.service.CategoryService;
import com.github.prifiz.homestuffmaintenance.web.mapper.CategoryMapper;
import com.github.prifiz.homestuffmaintenance.web.request.CreateCategoryRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequiredArgsConstructor
public class CategoryControllerImpl implements CategoryController {

    private final CategoryService categoryService;
    private final CategoryMapper categoryMapper;

    @Override
    public ResponseEntity<?> createCategory(CreateCategoryRequest request) {
        categoryService.create(categoryMapper.toCategory(request));
        return ResponseEntity.ok("Category successfully created");
    }

    @Override
    public ResponseEntity<?> getCategoryById(UUID id) {
        try {
            Category category = categoryService.find(id);
            return ResponseEntity.ok("done");
        } catch (CategoryNotFoundException e) {
            return new ResponseEntity<>("Couldn't find category", HttpStatus.NOT_FOUND);
        }
    }
}
