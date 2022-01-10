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
        //System.out.println(rev(int reversed));
        //System.out.println(minutesToSeconds("2:00"));
        System.out.println(makesTen(10,4));
        System.out.println(match("apple","APPLE"));
        System.out.println(numberSyllables("chocolate"));
        System.out.println(hackerSpeak("hello friend"));

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

//    //Set Bonus 2; Reverse Number by using a loop in Java
//    public static String rev(int n) {
//        int n = 3445, reversed = 0;
//                while (n != 0) {
//                    int digit  = n % 10;
//                   reversed = reversed * 10 + digit;
//                    n /= 10;
//                }
//                return reversed;
      //}
//    //Set Bonus 3; Video length
//    public static int minutesToSeconds(String tm) {
//        String minutes = tm * 60;
//
//    }

    //Alg 15                || - acts as a "or" operator
    public static boolean makesTen(int a, int b) {
        if (a == 10 || b == 10) {
            return true;
        } else if (a + b == 10) {
            return true;
        }
        return false;
    }

    //Alg 16
    public static int numberSyllables(String word) {
            String[] syl = word.split("-");
            return syl.length;
        }

    //Alg 17
    public static boolean match(String str1, String str2) {
       return str1.equalsIgnoreCase(str2);
    }

    //Alg 18
    public static String hackerSpeak(String str) {
        return str.replace('a','4')
                .replace('e','3')
                .replace('i','1')
                .replace('o','0')
                .replace('s','5');
    }

}








