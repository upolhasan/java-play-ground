package com.upol.functional;

import java.util.HashMap;
import java.util.Map;
import org.junit.Test;
import upol.functional.Environment;

class EnvironmentTest {
  @Test
  public void createMapFromEnvEnum() {

    Map<String, String> envMap = new HashMap<>();

    for (Environment env: Environment.values()){
      envMap.put(env.name(), env.getUrl());
    }
    System.out.println(envMap);
  }

  // Sort a numeric array

  @Test
  public void sortArray(){

  }
}