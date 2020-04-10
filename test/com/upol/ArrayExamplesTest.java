package com.upol;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ArrayExamplesTest {

    @Test
    void sortIntArr() {

        int[] intArr = {5, 6, 1, 8, 3, 4};
        ArrayExamples arrayExamples = new ArrayExamples(intArr);
        intArr = arrayExamples.sortIntArr();

        //Arrays.asList(intArr).stream().map(e->Integer.valueOf(e) ).forEach(e->System.out.println(e));

        for(int elem: intArr){
            System.out.println(elem);
        }
    }
}