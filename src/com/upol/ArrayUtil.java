package com.upol;

import java.util.Arrays;

public class ArrayUtil {

    private int[] intArr;

    public ArrayUtil(int[] intArr){
        this.intArr = intArr;
    }

    public ArrayUtil() {

    }

    public int[] sortIntArr(int[] intArr){

        int temp = 0;

        for (int i = 0; i < this.intArr.length-1; i ++)
            for (int j = i+1; j < this.intArr.length; j ++){
                if( this.intArr[i] > this.intArr[j]){
                    temp = this.intArr[j];
                    this.intArr[j]= this.intArr[i];
                    this.intArr[i]=temp;
                }
            }

        return this.intArr;
    }

    public void printArray(int[] intArr) {

        System.out.println(Arrays.toString(intArr));

        }

    public int[] deleteElementByIndex(int delIndex, int[] intArr) {

        if ( delIndex < 0 || delIndex > intArr.length - 1 )
            throw new ArrayIndexOutOfBoundsException("Please insert a valid index");

        for (int i = delIndex; i < intArr.length-1; i++) {

            intArr[i] = intArr[i+1];
        }

        intArr = Arrays.copyOf(intArr, intArr.length-1);


        return intArr;
    }

    public int[] removeDuplicates(int[] intArr) {

        for (int i = 0; i< intArr.length-1; i++)
            for (int j = i + 1; j < intArr.length; j++)
                if (intArr[i] == intArr[j]){
                    intArr = deleteElementByIndex(j, intArr);
                    j--;
                }
        return intArr;
    }
}

