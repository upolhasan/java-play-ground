package upol.collections;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class MapRunnerTest {

    MapRunner mapRunner;
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        mapRunner = new MapRunner();
    }

    @org.junit.jupiter.api.Test
    void getCharCount() {
        Map<Character, Integer> actualMap, actualMap2, expectedMap, expectedMap2;
        expectedMap = new HashMap<>(Map.of('a', 1, 'b', 1, 'c', 1));
        expectedMap2 = new HashMap<>(Map.ofEntries(
                Map.entry(' ', 4),
                Map.entry('a', 2),
                Map.entry('r', 1),
                Map.entry('s', 2),
                Map.entry('T', 1),
                Map.entry('t', 2),
                Map.entry('e', 1),
                Map.entry('g', 2),
                Map.entry('h', 2),
                Map.entry('i', 3),
                Map.entry('n', 1)
        ));

        actualMap = mapRunner.getCharCountMap("abc");
        actualMap2 = mapRunner.getCharCountMap("This is a great thing"); // MapRunner{charMap={ =4, a=2, r=1, s=2, T=1, t=2, e=1, g=2, h=2, i=3, n=1}}
        assertEquals(expectedMap, actualMap);
        assertEquals(expectedMap2, actualMap2);
    }
    @Test
    void testGetStrCountMap(){
        Map<String, Integer> actualMap, expectedMap = new HashMap<>(Map.of("This", 1, "is", 1, "a", 1, "great", 2, "thing", 1));
        actualMap = mapRunner.getStrCountMap("This is a great great thing");
        assertEquals(expectedMap, actualMap);
    }

    @org.junit.jupiter.api.Test
    void testToString() {
    }
}