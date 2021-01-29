package com.ecole.controller;

import com.ecole.model.Parent;
import com.ecole.service.ParentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("parent")
public class ParentController {

    private ParentService parentService;

    @Autowired
    public ParentController(ParentService parentService){

        this.parentService = parentService;
    }

    @GetMapping
    public List<Parent> getParent(){
        return parentService.getParent();
    }
}

