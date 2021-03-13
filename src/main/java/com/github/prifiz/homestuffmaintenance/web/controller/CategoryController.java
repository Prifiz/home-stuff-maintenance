package com.github.prifiz.homestuffmaintenance.web.controller;

import com.github.prifiz.homestuffmaintenance.web.request.CreateCategoryRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RequestMapping("/category")
public interface CategoryController {

    @PostMapping(path = "/create")
    @ResponseBody
    ResponseEntity<?> createCategory(@RequestBody CreateCategoryRequest request);

    @GetMapping(path = "/{id}")
    @ResponseBody
    ResponseEntity<?> getCategoryById(@RequestParam UUID id);

}
