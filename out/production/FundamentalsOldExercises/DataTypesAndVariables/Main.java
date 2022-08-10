package com.company;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Long.parseLong;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        ;

        for (int i = 0; i < n; i++) {

            String[] numbers = scan.nextLine().split(" ");

            String firstNumber = numbers[0];
            String secondNumber = numbers[1];

            int sumOfDigits = 0;
            if (parseLong(numbers[0]) > parseLong(numbers[1])) {
                sumOfDigits = findSumOfDigits(firstNumber);
            } else {
                sumOfDigits = findSumOfDigits(secondNumber);
            }

            System.out.println(sumOfDigits);


        }


    }

    private static int findSumOfDigits(String number) {
        int[] numbers;
        int sum = 0;
        if(number.charAt(0) == '-'){
            numbers = new int[number.length() - 1];

            for (int i = 0; i < number.length() - 1; i++) {
                numbers[i] = number.charAt(i + 1) - '0';
            }
            for (int i = 0; i < numbers.length; i++) {
                sum += numbers[i];
            }

        } else {
            numbers = new int[number.length()];

            for (int i = 0; i < number.length(); i++) {
                numbers[i] = number.charAt(i) - '0';
            }
            for (int i = 0; i < numbers.length; i++) {
                sum += numbers[i];
            }

        }
        return sum;

    }
}
