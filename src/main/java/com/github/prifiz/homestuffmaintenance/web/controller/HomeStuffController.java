package com.github.prifiz.homestuffmaintenance.web.controller;

import com.github.prifiz.homestuffmaintenance.web.request.CreateHomeStuffRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/homeStuff")
public interface HomeStuffController {

    @PostMapping(path = "/create")
    @ResponseBody
    ResponseEntity<?> create(@RequestBody CreateHomeStuffRequest request);
}
