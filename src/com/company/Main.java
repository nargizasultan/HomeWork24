package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(2);

        }
        Arrays.sort(array);
        System.out.println("Sorted array: ");
        for (int a : array) {
            System.out.print(a + " ");

        }
        System.out.println();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            arrayList.add(random.nextInt(2));
        }

        System.out.println("Sorted arrayList: ");
        sortedArray(arrayList);
        System.out.println();
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 20; i++) {
            linkedList.add(random.nextInt(2));


        }
        System.out.println("Sorted linkedList: ");
        sortedArray(linkedList);


    }

    public static void printElementsOfArray(List<Integer> a) {
        for (Integer i : a) {
            System.out.print(i + " ");

        }
    }

    public static List<Integer> sortedArray(List<Integer> list) {

        Collections.sort(list);

        printElementsOfArray(list);
        return list;
    }

}

