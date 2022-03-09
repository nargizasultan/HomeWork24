package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(2);


        }

        System.out.println("Sorted array: ");
        sortedArray(array);
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


    public static void sortedArray(ArrayList<Integer> arrayList) {

        Collections.sort(arrayList);


        System.out.println(arrayList);
    }
    public static void sortedArray(LinkedList<Integer> linkedList) {

        Collections.sort(linkedList);


        System.out.println(linkedList);
    }
    public static void sortedArray(int[]array) {

        Arrays.sort(array);
        for (int a : array) {
            System.out.print(a + " ");

        }



    }


}

