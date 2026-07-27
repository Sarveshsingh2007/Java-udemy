package com.sarvesh.App.repo;

import com.sarvesh.App.model.Laptop;
import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepository {
    public void save(Laptop lap){
        System.out.println("saved in database.");
    }
}
