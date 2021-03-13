package com.github.prifiz.homestuffmaintenance.web.mapper;

import com.github.prifiz.homestuffmaintenance.model.Category;
import com.github.prifiz.homestuffmaintenance.web.request.CreateCategoryRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CategoryMapper {

    @Mapping(target = "id", ignore = true)
    Category toCategory(CreateCategoryRequest request);
}
