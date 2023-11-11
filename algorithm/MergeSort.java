package com.algorithm;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] a = new int[]{89, 34, 24, 2, 4, 2, 54, 2, 3, 22};
        mergeSort(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));
        System.out.println(56);
    }

    public static void mergeSort(int[] a, int left, int right) {
        if (left == right) {
            return;
        }
        int mid = (left + right) / 2;
        mergeSort(a, left, mid);
        mergeSort(a, mid + 1, right);
        merge(a, left, mid, right);
        System.out.println(Arrays.toString(a));
    }

    public static void merge(int[] a, int left, int mid, int right) {
        int s1 = left;
        int s2 = mid + 1;
        int[] temp = new int[right - left + 1];
        int i = 0;
        while (a[s1] < a[mid]) {
            temp[i++] = a[s1++];
        }
        while (a[s2] < a[right]) {
            temp[i++] = a[s2++];
        }
        for (int j = 0; j < temp.length; j++) {
            a[j + left] = temp[j];
        }
    }
}
