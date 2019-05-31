package org;

import java.util.Arrays;

public class Generator {
    public int[] gener(int a) {
        //исходный массив
        System.out.println();
        int[] mas = new int[a];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) Math.round(Math.random() * 100);
        }
        System.out.println("Исходный массив: "+Arrays.toString(mas));
        return mas;
    }
}
