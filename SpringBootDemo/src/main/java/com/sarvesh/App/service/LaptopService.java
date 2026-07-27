package com.sarvesh.App.service;

import com.sarvesh.App.model.Laptop;
import com.sarvesh.App.repo.LaptopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service


public class LaptopService {

    // autowired laptop repository in service
    @Autowired
    private LaptopRepository repo;

    public void addLaptop(Laptop lap){
        repo.save(lap);  // saved in database.
    }

    public void isGoodForWork(Laptop lap){

    }
}
