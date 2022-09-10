package com.example.TestProjectCGI.controller;

import com.example.TestProjectCGI.service.CountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.io.IOException;
import java.util.*;
/*
The CountController is the RestController class that initiate the service
localhost:8080/count
 */

@RestController
public class CountController {
    @Autowired
    private CountService service;

    @RequestMapping(path = "/count", method = RequestMethod.POST, produces = "application/JSON")
    public Map<String, Long> freqCalculator() throws IOException {
        return this.service.freqCalculator();
    }
}




