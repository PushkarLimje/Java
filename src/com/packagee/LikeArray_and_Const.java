package com.packagee;
import java.util.Arrays;
public class LikeArray_and_Const {
    public static void main(String [] args){
        final double PI = 3.14 ; // final variable, cannot be changed
        // instead of const in java we use final

        // Single Dimensional Array
        int [] arr = {1, 8, 3, 10, 5};
        int [] arr2 = new int[5];
        arr2[0] = 9;
        arr2[1] = 8;
        arr2[2] = 37;
        arr2[3] = 46;


        Arrays.sort(arr);
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));

        // Multi Dimensional Array

        int [][] arr3 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println(Arrays.deepToString(arr3));
        // it will shows error in  .tostring() if you use Arrays.toString(arr3) because it is a multi-dimensional array

        int [][][] arr4 = new  int[2][3][4];
        arr4[1][0][0] = 1;
        arr4[0][1][0] = 2;
        arr4[0][0][1] = 3;
        System.out.println(Arrays.deepToString(arr4));

    }
}
