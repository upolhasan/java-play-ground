package upol.corejava;

/*

- Determine if collection of integers are reflections of each other:
	- [1,2,3,4] -> [3,4,1,2]  -> true
	- [1,1,3,4] -> [1,3,4,1] -> true
	- [1,1,3,4] -> [3,4,1,1] -> true
	- [1,2,3,4,5,6] -> [5,6,1,2,3,4] -> true
	- [1,2,3,4,5,6] -> [6,1,2,3,4,5] -> true
 */

// time complexity: O(n)
// space complexity: O(n) -> using an extra array to copy one of the given array
public class ReflectionCheck {
    public static boolean isReflection(int[] arr1, int[] arr2) {

        if (arr1.length != arr2.length ) return false;
        if (arr1.length ==0 && arr2.length == 0) return true;
        if ( arr1.length == 1 && arr2.length == 1 && arr1[0] == arr2[0])  return true;

        // create a new arary to copy content of 2nd array twice
        int copyCounter = 1;
        int targetCopy = 2;
        int[] arr3 = new int[arr2.length*targetCopy];

        for (int i = 0, sourceArrayIndex = 0; i < arr3.length; i++, sourceArrayIndex++) {
            arr3[i] = arr2[sourceArrayIndex];
            if( sourceArrayIndex == arr1.length - 1 && copyCounter < targetCopy ){
                sourceArrayIndex = -1;
                copyCounter++;
            }
        }
        // check if each consecutive elements of arr1 can be found on arr3
        // starting with the 1st element of arr1
        int startVal = arr1[0];
        int arr1Index = 0;
        boolean startMatched = false;

        for ( int i = 0; i < arr3.length; i++ ){
            if (arr3[i] == startVal && startMatched != true ){
                startMatched = true;
                continue;
            }
            if ( startMatched && i < arr3.length - 1 ){
                if (startMatched){
                    if ( arr3[i] == arr1[++arr1Index]){
                        if (arr1Index == arr1.length - 1){
                            // All the elements in sequence are matched
                            return true;
                        }
                    } else {
                        return false;
                    }
                }
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        int[] a =  {1, 2, 3, 4};
        int[] b =  {3, 4, 1, 2};
        System.out.println(isReflection(a, b)); // true

        int[] c =  {1, 2, 3, 4};
        int[] d =  {3, 4, 2, 2};
        System.out.println(isReflection(c, d)); // false

        int[] e =  {1, 2, 3, 4, 5, 6};
        int[] f =  {6, 1, 2, 3, 4, 5};
        System.out.println(isReflection(a, b)); // true

        int[] g =  {1, 2, 3, 4};
        int[] h =  {3, 4, 2};
        System.out.println(isReflection(g, h)); // false

        int[] i =  {};
        int[] j =  {};
        System.out.println(isReflection(i, j)); // true

        int[] k = {1,2};
        int[] l = {2,1};
        System.out.println(isReflection(k, l)); // true

        int[] m = {2};
        int[] n = {2};
        System.out.println(isReflection(m, n)); // true

        int[] o = {2};
        int[] p = {3};
        System.out.println(isReflection(o, p)); // false

    }
}
