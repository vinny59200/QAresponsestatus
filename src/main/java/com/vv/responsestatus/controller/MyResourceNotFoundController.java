package com.vv.responsestatus.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ResponseStatus(HttpStatus.NOT_FOUND) // Sets 404 Not Found for all methods in this class
public class MyResourceNotFoundController {

    @GetMapping("/resource")
    public String getResource() {
        return "Resource not found";
    }

    @GetMapping("/another-resource")
    public String getAnotherResource() {
        return "Another resource not found";
    }
}
