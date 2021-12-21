package com.careerdevs;

public class Main {

    public static void main(String[] args) {
        System.out.println(getFirstValue(new int[]{1, 2, 3, 4}));
        System.out.println(addition(2));
        System.out.println(search(new int[]{1, 2, 3, 4}, 3));
        System.out.println(convert(6));
        System.out.println(giveMeSomething("a"));
        System.out.println(reverse(false));
        System.out.println(countWords("It's high noon"));
        System.out.println(existsHigher(new int[] {5, 3, 15, 22, 4}, 10));
        System.out.println(getCount("Celebration"));
    }

    //Alg 1
    public static int getFirstValue(int[] arr) {
        return arr[0];
    }

    //Alg 2
    public static int addition(int num) {
    return ++num;
    }

    //Alg 3
    public static int search(int arr[], int item) {
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i]==item)
                return i;
        }
        return -1;
    }

    //Alg 4

    public static int convert(int minutes) {
        return minutes * 60;
    }

    //Alg 5
    public static String giveMeSomething(String a) {
        return "something " + a;
    }

    //Alg 6
    public static boolean reverse(boolean b) {
        return !b;
    }
    //Alg 7
    public static int countWords(String s) {
        return s.split(" ").length;
    }

    //Alg 8
    public static boolean existsHigher(int[] arr, int n) {
     if (arr.length == 0) return false;
        for (int i : arr) {
            if (i >= n) return true;
        }
        return false;
    }
    //Alg 9
    public static int getCount(String str) {
        int vowelsCount = 0;
        // Your code here

        return vowelsCount;
    }
}




