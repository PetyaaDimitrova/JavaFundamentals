package Methods;

import java.util.Scanner;

public class Ex_02 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = Integer.parseInt(scan.nextLine());
        int b = Integer.parseInt(scan.nextLine());
        int c = Integer.parseInt(scan.nextLine());
        if (a < 0 && b > 0 && c > 0) {
            System.out.println("negative");
            return;
        }
        if (a > 0 && b < 0 && c > 0) {
            System.out.println("negative");
            return;
        }
        if (a > 0 && b > 0 && c < 0) {
            System.out.println("negative");
            return;
        }

        boolean isZero = check(a, b, c);
        if (isZero) {
            System.out.println("zero");
            return;
        }
        boolean result1 = isPositive(a);
        boolean result2 = isPositive(b);
        boolean result3 = isPositive(c);

        int negativeSum = findSumOfNegative(result1, result2, result3);

        if (negativeSum == 1 || negativeSum == 3) {
            System.out.println("negative");
        } else {
            System.out.println("positive");
        }

    }

    private static int findSumOfNegative(boolean result1, boolean result2, boolean result3) {
        int negative = 0;
        if (!result1) {
            negative++;
        }
        if (!result2) {
            negative++;
        }
        if (!result3) {
            negative++;
        }
        return negative;
    }


    private static boolean isPositive(int a) {
        if (a > 0) {
            return true;
        }
        return false;
    }

    private static boolean check(int a, int b, int c) {

        if (a == 0 || b == 0 || c == 0) {
            return true;
        }
        return false;
    }
}
