package upol.leetcode.medium;

import java.util.Arrays;

public class ThreeSum {

    public boolean isThreeSumNaive( int[] num, int target ){

        int len = num.length;
        int i, j, k;

        for ( i = 0; i < len; i ++ ){
            for ( j = i + 1; j < len; j ++ ){
                for (k = j + 1; k < len; k ++ ){
                    if ( num [i] + num[j] + num[k] == target ){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean isThreeSumOptimized ( int[] num, int target ){

        int len = num.length;
        int left, right;

        Arrays.sort(num);
        /*
        *
        * 3,7,1,2,8,4,5 => 1,2,3,4,5,7,8
        *
        * */
        for ( int cur = 0; cur < len; cur ++ ){
            left = cur + 1;
            right = len -1;

            while ( left < right ){
                int sum = num[cur] + num[left] + num[right];

                if ( sum == target ){
                    return true;
                }
                if ( sum < target )
                    left++;
                else
                    right--;
            }
        }

        return false;
    }



}
