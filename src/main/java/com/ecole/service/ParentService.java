package com.ecole.service;

import com.ecole.dao.ParentRepository;
import com.ecole.model.Parent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParentService {

    private ParentRepository parentRepository;

    @Autowired
    public ParentService(ParentRepository parentRepository){
        this.parentRepository = parentRepository;
    }

    public List<Parent> getAllParents() {
        return parentRepository.findAll();
    }
    
    public Parent getParent(Long id) {
    	return  parentRepository.findById(id).get();
    }
}
