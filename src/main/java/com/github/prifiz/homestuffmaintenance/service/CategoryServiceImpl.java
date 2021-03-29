package com.github.prifiz.homestuffmaintenance.service;

import com.github.prifiz.homestuffmaintenance.model.Category;
import com.github.prifiz.homestuffmaintenance.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;
import java.util.UUID;

@RequiredArgsConstructor
@Service
@Transactional
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;

    @Override
    public Category create(Category category) {
        return categoryRepository.save(category);
    }

    @Override
    public Category find(UUID id) throws CategoryNotFoundException {
        Optional<Category> stuff = categoryRepository.findById(id);
        if (stuff.isPresent()) {
            return stuff.get();
        } else {
            throw new CategoryNotFoundException(String.format("Category with id '%s' not found", id));
        }
    }
}
