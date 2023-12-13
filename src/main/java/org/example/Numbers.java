package org.example;

public class Numbers {
    public static void checkIfNumbersPositive (int a, int b, int c){
        if (a >= 0 && b >= 0 && c >= 0){
            System.out.println("All numbers are positive.");
        }
        else {
            System.out.println("There are negative numbers!");
        }
    }
    public static void checkIfNumbersEqual(int a, int b, int c){
        if(a == b){
            if (b == c){
                System.out.printf("Numbers %d, %d and %d are equal.\n", a, b, c);
            }
        }
        else {
            System.out.printf("Numbers %d, %d and %d are not equal.\n", a, b, c);
        }
    }
    public static double averageValue(double a, double b){
        double result = (a + b) / 2;
        System.out.printf("The average value of %.1f and %.1f is: %.1f\n",a, b, result);
        return result;
    }
    public static double sum(double a, double b){
        double result = a + b;
        System.out.printf("The sum of %.1f and %.1f is: %.1f\n",a, b, result);
        return result;
    }
}

