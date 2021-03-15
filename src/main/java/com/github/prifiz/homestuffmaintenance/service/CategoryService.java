package com.github.prifiz.homestuffmaintenance.service;

import com.github.prifiz.homestuffmaintenance.model.Category;

import java.util.UUID;

public interface CategoryService {

    Category create(Category maintenance);

    Category find(UUID id) throws CategoryNotFoundException;
}
