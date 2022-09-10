package com.example.TestProjectCGI.service;

import java.io.IOException;
import java.util.Map;
/*
Service Interface
 */
public interface CountService {

    public Map<String,Long> freqCalculator() throws IOException;

}
