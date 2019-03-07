package pers.wang.test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class test_01 {

    public static void bubblesort(int[] args) {

        for (int i = 0; i < args.length - 1; i++) {
            for (int j = 0; j < args.length - 1 - i; j++) {
                if (args[j] > args[j + 1]) {
                    swap(args, j + 1, j);
                }

            }
        }

    }

    public static void selectsort(int[] args) {
        int max;
        int v;
        for (int i = 0; i < args.length - 1; i++) {
            v = 0;
            max = args[0];
            for (int j = 0; j < args.length - i; j++) {
                v = (max < args[j]) ? j : v;
                max = (max < args[j]) ? args[j] : max;

            }
            swap(args, args.length - 1 - i, v);
        }
    }

    public static void insertionsort(int[] args) {
        for (int i = 0; i < args.length; i++) {
            for (int j = i; j > 0; j--) {
                if (args[j] < args[j - 1]) {
                    swap(args, j, j - 1);
                } else {
                    break;
                }
            }

        }
    }

    public static void swap(int[] args, int i, int j) {
        int temp = args[i];
        args[i] = args[j];
        args[j] = temp;
    }

    public static String replaceSpace(StringBuffer str) {
        if (str == null) {
            return null;
        }
        for(int i = str.length()-1;i>=0;i--){
            if(str.charAt(i)==' '){
                str.replace(i,i+1,"%20");
            }
        }
        return str.toString();

    }

    public static void main(String[] args) {
        System.out.println("hello world");
        int[] a = {9, 6, 3, 7, 2, 4, 3, 3, 2, 8, 6, 3, 1, 7};
        //bubblesort(a);
        //selectsort(a);
        insertionsort(a);
        System.out.println(Arrays.toString(a));

        Queue<String> que = new LinkedList<>();
        System.out.println(replaceSpace(new StringBuffer("hello ni hao a")));
    }

}
