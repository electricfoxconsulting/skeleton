package com.electricfox.skeleton.controller;

import com.electricfox.skeleton.repository.BasicRepository;
import com.electricfox.skeleton.service.BasicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {

    BasicService basicService;

    @Autowired
    public BasicController(BasicService basicService) {
        this.basicService = basicService;
    }

    @GetMapping("/basic-greeting")
    public String getBasicGreeting(){
        return basicService.basicServiceFunction();
    }

}
