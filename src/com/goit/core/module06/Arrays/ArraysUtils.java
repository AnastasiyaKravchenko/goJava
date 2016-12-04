package com.goit.core.module06.Arrays;

/**
 * Created by Mala on 12/4/2016.
 */
public final class ArraysUtils {


    //sum int
    public static int sum(int[] array) {
        int count = 0;
        int sum = 0;

        while (count < array.length) {
            sum += array[count];
            count++;
        }


        return sum;
    }


    //min int
    public static int min(int[] array) {
        int min = array[0];
        int count = 0;
        while (count < array.length) {
            if (array[count] < min)
                min = array[count];

            count++;
        }

        return min;
    }

    //max int
    public static int max(int[] array) {
        int max = array[0];
        int count = 0;
        while (count < array.length) {
            if (array[count] > max)
                max = array[count];

            count++;
        }

        return max;
    }

    //maxPositive
    public static int maxPositive(int[] array) {
        int max = array[0];
        int count = 0;
        while (count < array.length) {
            if ((array[count] > 0) && (array[count] > max))
                max = array[count];

            count++;
        }

        return max;
    }

    //multiplication

    public static int multiplication(int[] array) {
        int count = 1;
        int mult = 1;

        while (count < array.length) {
            mult *= array[count];
            count++;
        }

        return mult;
    }

    //modulus of first and last element
    public static int modulus(int[] array) {
        int mod = array[0] % array[array.length - 1];
        return mod;
    }

    //second largest element
    public static int secondLargest(int[] array) {
        int max1 = array[0];
        int max2 = array[0];
        int count = 0;
        while (count < array.length) {
            if (array[count] > max1)
                max1 = array[count];

            count++;
        }

        while (count < array.length) {
            if ((array[count] > max2) && (array[count] < max1))
                max2 = array[count];

            count++;
        }

        return max2;
    }

    //reverse
    public static int[] reverse(int[] array) {
        int[] new_array = new int[array.length];
        int count = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            new_array[count] = array[i];
            count++;
        }
        return new_array;
    }

    //even elements
    public static int[] findEvenElements(int[] array) {
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0)
                count++;

        }
        int[] newArray = new int[count];
        count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                newArray[count] = array[i];
                count++;
            }
        }
        return newArray;
    }
}




