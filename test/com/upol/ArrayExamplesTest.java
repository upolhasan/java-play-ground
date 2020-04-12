package com.upol;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayExamplesTest {

    ArrayUtil arrayUtil = new ArrayUtil();

/*
    @BeforeClass
    void setUp(){
        ArrayExamples arrayExamples = new ArrayExamples();
    }
*/

    @Test
    void sortIntArr() {

        int[] intArr = {5, 6, 1, 8, 3, 4};

        intArr = arrayUtil.sortIntArr(intArr);

        //Arrays.asList(intArr).stream().map(e->Integer.valueOf(e) ).forEach(e->System.out.println(e));
        arrayUtil.printArray(intArr);

    }

    @Test
    void testDeleteElement(){

        int[] intArr = {5, 6, 1, 8, 3, 4};

        int[] arrayAfterDelete = arrayUtil.deleteElementByIndex(2, intArr);
        arrayUtil.printArray(arrayAfterDelete);

    }

    @Test
    void testDeleteElementException(){

        int[] intArr = {5, 6, 1, 8, 3, 4};

        assertThrows(ArrayIndexOutOfBoundsException.class, () ->{
            int[] arrayAfterDelete = arrayUtil.deleteElementByIndex(-9, intArr);
        });
    }

    @Test
    void testRemoveDuplicates(){

        int[] intArr = {5, 6, 4, 4, 3, 4};
        int[] uniqueArray = arrayUtil.removeDuplicates(intArr);
        arrayUtil.printArray(uniqueArray);
    }

    @Test
    void testElementFoundBinarySearch(){

        int[] intArr = {2, 5, 7, 9, 15, 19};
        int searchTerm = 7;
        int indexOfTermFound = arrayUtil.binarySearch(searchTerm,  intArr);

        assertEquals(2, indexOfTermFound);
    }

    @Test
    void testElementNotFoundBinarySearch(){

        int[] intArr = {2, 5, 7, 9, 15, 19};
        int searchTerm = 0;
        int indexOfTermFound = arrayUtil.binarySearch(searchTerm,  intArr);

        assertEquals(-1, indexOfTermFound);
    }

}