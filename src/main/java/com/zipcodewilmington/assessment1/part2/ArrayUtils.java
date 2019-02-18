package com.zipcodewilmington.assessment1.part2;

import java.util.*;

/**
 * Created by leon on 2/16/18.
 */
public class ArrayUtils {
    /**
     * @param objectArray   an array of any type of Object
     * @param objectToCount any non-primitive value
     * @return the number of times the specified `value` occurs in the specified `objectArray`
     * Given an array of objects, named `objectArray`, and an object `objectToCount`, return the number of times the `objectToCount` appears in the `objectArray`
     */
    public static Integer getNumberOfOccurrences(Object[] objectArray, Object objectToCount) {

        int j = 0;
        for(int i = 0 ; i < objectArray.length ; i++){
            if(objectArray[i].equals(objectToCount)){
                j++;
            }
        }
        return j;
    }

    /**
     * @param objectArray    an array of any type of Object
     * @param objectToRemove a value to be removed from the `objectArray`
     * @return an array with identical content excluding the specified `objectToRemove`
     * Given an array of objects, name `objectArray`, and an object `objectToRemove`, return an array of objects with identical contents excluding `objectToRemove`
     */
    public static Object[] removeValue(Object[] objectArray, Object objectToRemove) {
        int arrayLength = objectArray.length - getNumberOfOccurrences(objectArray, objectToRemove);
        Integer[] newArray = new Integer[arrayLength];
        int newArrIndex = 0;
        for(int i = 0 ; i < objectArray.length; i++){
            if(!objectArray[i].equals(objectToRemove)){
                newArray[newArrIndex] = (Integer)objectArray[i];
                newArrIndex++;
            }
        }
        return newArray;
    }

    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */
    public static Object getMostCommon(Object[] objectArray) {
        Map<Integer, Integer> map = new TreeMap<Integer, Integer>();

        for (Object a : objectArray) {
            Integer freq = map.get(a);
            map.put((Integer)a, (freq == null) ? 1 : freq + 1);
        }

        int max = -1;
        int mostFrequent = -1;

        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            if (e.getValue() > max) {
                mostFrequent = e.getKey();
                max = e.getValue();
            }
        }

        return mostFrequent;
    }




    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Object getLeastCommon(Object[] objectArray) {
        Map<Integer, Integer> map = new TreeMap<Integer, Integer>();

        for (Object a : objectArray) {
            Integer freq = map.get(a);
            map.put((Integer)a, (freq == null) ? 1 : freq + 1);
        }

        int min = 2;
        int leastFrequent = -1;

        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            if (e.getValue() < min) {
                leastFrequent = e.getKey();
                min = e.getValue();
            }
        }

        return leastFrequent;
    }

    /**
     * @param objectArray      an array of any type of Object
     * @param objectArrayToAdd an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
     */
    public static Object[] mergeArrays(Object[] objectArray, Object[] objectArrayToAdd) {
        Object[]c = new Integer[objectArray.length+objectArrayToAdd.length];
        int count=0;

        for(int i=0; i<objectArray.length; i++)
        {
            c[i]=objectArray[i];
            count++;
        }

        for(int j=0;j<objectArrayToAdd.length;j++)
        {
            c[count++]=objectArrayToAdd[j];
        }

        for(int i=0;i<c.length;i++)
        return c;
        return c;
    }
}



