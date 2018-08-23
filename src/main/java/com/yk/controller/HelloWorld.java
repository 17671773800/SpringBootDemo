package com.yk.controller;

import com.yk.service.GarageService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
public class HelloWorld {

    @Resource(name = "garageService")
    GarageService garageService;

    @PostMapping(value = "/helloWorld", consumes = "application/json")
    public List<Map> helloWorld(){
        List<Map> garageList = new ArrayList();
        try {
            garageList = garageService.getGarageList();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return garageList;
    }

}
