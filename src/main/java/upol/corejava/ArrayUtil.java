package upol.corejava;

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

    public int binarySearch(int searchTerm, int[] intArr){

        //return binarySearchIterative(searchTerm, intArr, 0, intArr.length-1);
        return binarySearchRecursive(searchTerm, intArr, 0, intArr.length-1);

    }

    private int binarySearchIterative(int searchTerm, int[] intArr, int low, int high) {

        int mid;

        while(low < high){

            mid = (low + high) / 2;

            if( searchTerm == intArr[mid])
                return mid;

            if( searchTerm > intArr[mid]){
                low = mid + 1;
            }else
                high = mid - 1;
        }

        return  -1;
    }

    private int binarySearchRecursive(int searchTerm, int[] intArr, int low, int high ){

        int mid = ( low + high ) / 2;

        if ( searchTerm == intArr[mid])
            return mid;

        if( low > high)
            return -1;

        if ( searchTerm > intArr[mid])
            return binarySearchRecursive(searchTerm, intArr, mid + 1, high);
        else
            return binarySearchRecursive(searchTerm, intArr, low, mid - 1);
    }
}

