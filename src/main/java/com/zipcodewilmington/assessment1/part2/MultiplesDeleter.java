package com.zipcodewilmington.assessment1.part2;

/**
 * Created by leon on 2/16/18.
 */
public class MultiplesDeleter {
    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 2
     * given an array of integers, named `ints` return an identical array with evens removed
     */
    public Integer[] deleteEvens(Integer[] ints) {
        Integer[] newArray = new Integer[ints.length/2];
        int newArrayBuilder = 0;
        for(int i = 0 ; i<ints.length; i++){

            if (ints[i]%2 != 0){
                newArray[newArrayBuilder]=ints[i];
                newArrayBuilder++;
            }
        }
        System.out.println(newArray.toString());
        return newArray;
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are divisible by 2
     * given an array of integers, named `ints` return an identical array with odds removed
     */
    public Integer[] deleteOdds(Integer[] ints) {
        Integer[] newArray = new Integer[ints.length/2];
        int newArrayBuilder = 0;
        for(int i = 0 ; i<ints.length; i++){

            if (ints[i]%2 == 0){
                newArray[newArrayBuilder]=ints[i];
                newArrayBuilder++;
            }
        }
        System.out.println(newArray.toString());
        return newArray;
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 3
     * given an array of integers, named `ints` return an identical array with numbers indivisible by 3 removed
     */
    public Integer[] deleteMultiplesOf3(Integer[] ints) {
        int newArrayLength = 0;

        for(int i = 0 ; i < ints.length; i++){
            if((ints[i]/3)%2 == 0){
                newArrayLength++;

            }
        }  if (!ints[ints.length-1].equals(ints[ints.length-2])){
            newArrayLength++;
        }
        Integer[] newArray = new Integer[newArrayLength];
        int newArrayBuilder = 0;
        for(int i = 0 ; i<ints.length; i++){

            if ((ints[i]%3) != 0){
                newArray[newArrayBuilder]=ints[i];
                newArrayBuilder++;
            }
        }
        System.out.println(newArray.toString());
        return newArray;
    }

    /**
     * @param ints array of Integer objects
     * @param multiple the multiple to evaluate divisibility against
     * @return all ints which are not divisible by the `multiple` specified
     * given an array of integers, named `ints` return an identical array with numbers indivisible by `multiple` removed
     */
    public Integer[] deleteMultiplesOfN(Integer[] ints, int multiple) {
        int newArrayLength = -1;

        for(int i = 0 ; i < ints.length; i++){
            if(ints[i]%multiple != 0){
                newArrayLength++;

            }
        }  if (!ints[ints.length-1].equals(ints[ints.length-2])){
            newArrayLength++;
        }
        Integer[] newArray = new Integer[newArrayLength];
        int newArrayBuilder = 0;
        for(int i = 0 ; i<ints.length; i++){

            if (ints[i]%multiple != 0){
                newArray[newArrayBuilder]=ints[i];
                newArrayBuilder++;
            }
        }
        System.out.println(newArray.toString());
        return newArray;
    }
}
