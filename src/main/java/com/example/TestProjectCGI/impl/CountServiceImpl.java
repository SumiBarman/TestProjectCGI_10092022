package com.example.TestProjectCGI.impl;

import com.example.TestProjectCGI.service.CountService;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
Service Implementation Class
 */

@Service
public class CountServiceImpl implements CountService {
    @Override
    public Map<String, Long> freqCalculator() throws IOException {

        //Calling method getMyFile to read the file
        String wordFile = getMyFile();

        //Eliminating spaces, special characters, new lines and having stream in uniform lower case to avoid duplicate
        Stream<String> stream = Stream.of(wordFile.toLowerCase().split("\\W+")).parallel();

        //Finding frequency of words in the Stream
        Map<String, Long> freq = stream.
                collect(Collectors.groupingBy(x -> x, Collectors.counting()));

        //Sorting Map for response in descending order to get top ten most frequent words
        return freq.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).limit(10)
              .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
    }

    //Reading the file to process which we are keeping in the resource folder
    public String getMyFile() throws IOException {
        File file = ResourceUtils.getFile("classpath:myFile.txt");
        return new String(Files.readAllBytes(file.toPath()));

    }
}

