package com.zipcodewilmington.assessment1.part4;

public class Jumper {

    /*
     * Complete the function below.
     */
    public int jumps(int k, int j) {
        int numOfJumps = 0;
        if(j>k){
            return k;
        } else{
            numOfJumps = k/j+k%j;
        }
        return numOfJumps;
    }
}
