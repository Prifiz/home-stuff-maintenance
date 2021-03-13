package com.github.prifiz.homestuffmaintenance.service;

import java.io.IOException;

public class CategoryNotFoundException extends IOException {

    public CategoryNotFoundException(String message) {
        super(message);
    }
}
