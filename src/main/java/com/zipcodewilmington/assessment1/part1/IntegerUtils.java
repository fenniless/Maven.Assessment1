package com.zipcodewilmington.assessment1.part1;

import static com.zipcodewilmington.assessment1.part1.BasicStringUtils.reverse;

/**
 * Created by leon on 2/16/18.
 */
public class IntegerUtils {


    /**
     * @param n integer value input by client
     * @return the sum of all integers between 0 and not including `n`
     */
    public static Integer getSumOfN(Integer n) {
        int j = 0;
        for(int i = 0 ; i <= n ; i++){
            j +=i;
        }
        return j;
    }

    /**
     * @param n integer value input by client
     * @return the product of all integers between 0 and not including `n`
     */
    public static Integer getProductOfN(Integer n) {
        int j = 1;
        for(int i = 1 ; i <= n ; i++){
            j *=i;
        }
        return j;
    }

    /**
     * @param val integer value input by client
     * @return integer with identical digits in the reverse order
     */
    public static Integer reverseDigits(Integer val) {
        String rev = reverse(val.toString());

        return Integer.valueOf(rev);
    }
}
