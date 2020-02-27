package com.company;

public class Main {

    public static void main(String[] args) {
        double[] fraction = {0.5, 0.3, -0.7, 0.57, -0.8, -0.73, 0.016, 0.13, 0.8, 0.23, -0.24, 0.35, 0.41, -0.09, 0.1};
        double average = 0;
        boolean a = false;
        int sum = 0;
        for (double tempFration : fraction) {
            if (a = true) {
                average += tempFration;
                sum++;
            }
            if (tempFration < 0) {
                a = true;
            }
        }
        double result = average / sum;
        System.out.println("Среднее арифметическое: " + result);
    }
}


