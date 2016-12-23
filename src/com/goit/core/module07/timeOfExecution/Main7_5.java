package com.goit.core.module07.timeOfExecution;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Mala on 12/23/2016.
 */
public class Main7_5 {
    public static void main(String[] args) {
        List<Integer> intListArray = new ArrayList<>();
        List<Integer> intListLinked = new LinkedList<>();

        System.out.println("INTEGER 1000");
        System.out.println("ADD ArrayList: " + timeAddInt(intListArray, 1000));
        System.out.println("ADD LinkedList: " + timeAddInt(intListLinked, 1000));

        System.out.println("SET ArrayList: " + timeSetInt(intListArray, 1000));
        System.out.println("SET LiknedList: " + timeSetInt(intListLinked, 1000));

        System.out.println("GET ArrayList: " + timeGetInt(intListArray, 1000));
        System.out.println("GET LinkedList: " + timeGetInt(intListLinked, 1000));

        System.out.println("REMOVE ArrayList: " + timeRemoveInt(intListArray, 1000));
        System.out.println("REMOVE LinkedList: " + timeRemoveInt(intListLinked, 1000));

        System.out.println("========================================================");
        List<String> strListArray = new ArrayList<>();
        List<String> strListLinked = new LinkedList<>();

        System.out.println("STRING 1000");
        System.out.println("ADD ArrayList: " + timeAddStr(strListArray, 1000));
        System.out.println("ADD LinkedList: " + timeAddStr(strListLinked, 1000));

        System.out.println("SET ArrayList: " + timeSetStr(strListArray, 1000));
        System.out.println("SET LiknedList: " + timeSetStr(strListLinked, 1000));

        System.out.println("GET ArrayList: " + timeGetStr(strListArray, 1000));
        System.out.println("GET LinkedList: " + timeGetStr(strListLinked, 1000));

        System.out.println("REMOVE ArrayList: " + timeRemoveStr(strListArray, 1000));
        System.out.println("REMOVE LinkedList: " + timeRemoveStr(strListLinked, 1000));

        System.out.println("---------------------------------------------------------");
        List<Integer> intListArray2 = new ArrayList<>();
        List<Integer> intListLinked2 = new LinkedList<>();

        System.out.println("INTEGER 10000");
        System.out.println("ADD ArrayList: " + timeAddInt(intListArray2, 10000));
        System.out.println("ADD LinkedList: " + timeAddInt(intListLinked2, 10000));

        System.out.println("SET ArrayList: " + timeSetInt(intListArray2, 10000));
        System.out.println("SET LiknedList: " + timeSetInt(intListLinked2, 10000));

        System.out.println("GET ArrayList: " + timeGetInt(intListArray2, 10000));
        System.out.println("GET LinkedList: " + timeGetInt(intListLinked2, 10000));

        System.out.println("REMOVE ArrayList: " + timeRemoveInt(intListArray2, 10000));
        System.out.println("REMOVE LinkedList: " + timeRemoveInt(intListLinked2, 10000));

        System.out.println("=======================================================");
        List<String> strListArray2 = new ArrayList<>();
        List<String> strListLinked2 = new LinkedList<>();

        System.out.println("STRING 10000");
        System.out.println("ADD ArrayList: " + timeAddStr(strListArray2, 1000));
        System.out.println("ADD LinkedList: " + timeAddStr(strListLinked2, 1000));

        System.out.println("SET ArrayList: " + timeSetStr(strListArray2, 1000));
        System.out.println("SET LiknedList: " + timeSetStr(strListLinked2, 1000));

        System.out.println("GET ArrayList: " + timeGetStr(strListArray2, 1000));
        System.out.println("GET LinkedList: " + timeGetStr(strListLinked2, 1000));

        System.out.println("REMOVE ArrayList: " + timeRemoveStr(strListArray2, 1000));
        System.out.println("REMOVE LinkedList: " + timeRemoveStr(strListLinked2, 1000));
    }

    public static void addInt(List<Integer> list, int n) {
        for (int i = 0; i < n; i++)
            list.add(i);
    }

    public static void addStr(List<String> list, int n) {
        for (int i = 0; i < n; i++)
            list.add(i + " ");
    }

    public static void setInt(List<Integer> list, int n) {
        for (int i = 0; i < n; i++)
            list.set(i, i + 1);
    }

    public static void setStr(List<String> list, int n) {
        for (int i = 0; i < n; i++)
            list.set(i, " ");
    }

    public static void getInt(List<Integer> list, int n) {
        for (int i = 0; i < n; i++)
            list.get(i);
    }

    public static void getStr(List<String> list, int n) {
        for (int i = 0; i < n; i++)
            list.get(i);
    }

    public static void removeInt(List<Integer> list, int n) {
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer element = iterator.next();
            iterator.remove();
        }
    }

    public static void removeStr(List<String> list, int n) {
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            iterator.remove();
        }
    }


    public static long timeAddInt(List<Integer> list, int n) {
        long startTime = System.nanoTime();
        addInt(list, n);
        long endTime = System.nanoTime();
        return (endTime - startTime);
    }

    public static long timeAddStr(List<String> list, int n) {
        long startTime = System.nanoTime();
        addStr(list, n);
        long endTime = System.nanoTime();
        return (endTime - startTime);
    }

    public static long timeSetInt(List<Integer> list, int n) {
        long startTime = System.nanoTime();
        setInt(list, n);
        long endTime = System.nanoTime();
        return (endTime - startTime);
    }


    public static long timeSetStr(List<String> list, int n) {
        long startTime = System.nanoTime();
        setStr(list, n);
        long endTime = System.nanoTime();
        return (endTime - startTime);
    }

    public static long timeGetInt(List<Integer> list, int n) {
        long startTime = System.nanoTime();
        getInt(list, n);
        long endTime = System.nanoTime();
        return (endTime - startTime);
    }

    public static long timeGetStr(List<String> list, int n) {
        long startTime = System.nanoTime();
        getStr(list, n);
        long endTime = System.nanoTime();
        return (endTime - startTime);
    }

    public static long timeRemoveInt(List<Integer> list, int n) {
        long startTime = System.nanoTime();
        removeInt(list, n);
        long endTime = System.nanoTime();
        return (endTime - startTime);
    }

    public static long timeRemoveStr(List<String> list, int n) {
        long startTime = System.nanoTime();
        removeStr(list, n);
        long endTime = System.nanoTime();
        return (endTime - startTime);
    }
}




