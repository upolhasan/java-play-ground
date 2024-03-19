package upol.collections;

import java.util.HashMap;
import java.util.Map;

public class MapRunner {

    Map<Character, Integer> charMap;
    public Map<Character, Integer> getCharCountMap(String input) {

        charMap = new HashMap<>();

        for (Character c: input.toCharArray()) {
            if (charMap.containsKey(c)){
                charMap.put(c, charMap.get(c) + 1);
            } else {
                charMap.put(c, 1);
            }
        }

        return charMap;
    }

    public Map<String, Integer> getStrCountMap(String input){

        Map<String, Integer> strCountMap = new HashMap<>();

        for( String str: input.split(" ")){

            if ( strCountMap.containsKey(str) ){
                strCountMap.put(str, strCountMap.get(str) + 1 );
            } else {
                strCountMap.put(str, 1);
            }
        }

        return strCountMap;
    }

    @Override
    public String toString() {
        return "MapRunner{" +
                "charMap=" + charMap +
                '}';
    }
}
