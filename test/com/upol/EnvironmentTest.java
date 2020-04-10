package com.upol;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class EnvironmentTest {
    @Test
    void createMapFromEnvEnum() {

        Map<String, String> envMap = new HashMap<String, String>();

        for (Environment env: Environment.values()){
            envMap.put(env.name(), env.getUrl());
        }
      System.out.println(envMap);
    }

    // Sort a numeric array

    @Test
    void sortArray(){

    }
}