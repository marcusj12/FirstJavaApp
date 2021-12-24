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
        System.out.println(existsHigher(new int[]{5, 3, 15, 22, 4}, 10));
        System.out.println(getCount("Celebration"));
        System.out.println(giveMeSomething("a"));
        System.out.println(sum(3, 2));
        System.out.println(isSameNum(2,2));
        System.out.println(calcAge(5));
        System.out.println(helloName("Gerald"));
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
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == item)
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
     //Alg 10
     public static int sum(int a, int b) {
         int sum = a + b;
         return sum;
     }

    //Alg 11
    public static boolean isSameNum(int x, int y) {
        if(x == y)
            return true;
        else
            return false;
    }
    //Alg 12
    public static int calcAge(int age) {
        return age * 365;
    }
    //Alg 13
    public static String helloName(String name) {
        return "Hello " + name + "!";
    }
}

//    // Example of concatenating
//    public static String giveMeSomething2(String a) {
//        String str1 = "Hello";
//        String str2 = " Space World";
//        return str1 + str2;
//    }






