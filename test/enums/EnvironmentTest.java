package enums;

import static org.junit.jupiter.api.Assertions.*;
import java.util.HashMap;
import java.util.Map;
import org.testng.annotations.Test;

public class EnvironmentTest {
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