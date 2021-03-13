package com.github.prifiz.homestuffmaintenance.repository;

import com.github.prifiz.homestuffmaintenance.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CategoryRepository extends JpaRepository<Category, UUID> {

}
