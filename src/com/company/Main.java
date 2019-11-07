package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] inputArray = new int[20];

        for (int i=0;i<20;i++){
            inputArray[i] = i+1;
        }

        System.out.println("Given Array List");
        System.out.println(Arrays.toString(inputArray));
        System.out.println("Found: "+SearchPortion(inputArray,13,1,20));
    }
    public static boolean SearchPortion(int[] array,int search, int left , int right ){
        if(left > right) return false;
        if (right==left){
            if (search==array[left-1]){
                return true;
            }
        }
        int middlePoint = (left + right) / 2;

        if (search==array[middlePoint-1]){
            return true;
        }
        else if (search == array[right-1]){
            return true;
        }

        if (search<array[middlePoint-1]){
            right = middlePoint-1;
            return SearchPortion(array,search,left,right);
        }
        else {
            left = middlePoint+1;
            return SearchPortion(array,search,left,right);
        }


    }
}
