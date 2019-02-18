package com.zipcodewilmington.assessment1.part5;

import java.util.Arrays;

import static jdk.nashorn.internal.objects.NativeArray.reverse;

public class Palindrome {

    public static String reverse(String valueToBeReversed) {
        StringBuilder input1 = new StringBuilder();
        input1.append(valueToBeReversed);
        input1 = input1.reverse();

        return input1.toString();
    }

    public static boolean isPalindromic(String str) {
        boolean pal = false;
        if (reverse(str).equals(str)){
            pal = true;
        }
        return pal;
    }

    public Integer countPalindromes(String input){

        int numOfPals = 0;
        int inputLength = input.length();
        int maxSubDiv = input.length()/2;
//        if(isPalindromic(input)){
//            numOfPals++;
//        }
        for(int i = 0 ; i < inputLength ; i++){
            for(int j = inputLength; i < j ; j--){
                if(isPalindromic(input.substring(i,j))){
                numOfPals++;
            }


        }}


        return numOfPals;
    }
}
