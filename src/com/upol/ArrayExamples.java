package com.upol;

public class ArrayExamples {

    private int[] intArr;

    public ArrayExamples(int[] intArr){
        this.intArr = intArr;
    }

    public int[] sortIntArr(){

        int temp = 0;

        for (int i = 0; i < intArr.length-1; i ++)
            for (int j=i+1; j < intArr.length; j ++){
                if( intArr[i] > intArr[j]){
                    temp = intArr[j];
                    intArr[j]=intArr[i];
                    intArr[i]=temp;
                }
            }

        return intArr;
    }
}
