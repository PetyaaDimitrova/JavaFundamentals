package TextProcessing;

import java.util.Scanner;

public class Ex_02 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        StringBuilder sb = new StringBuilder(scan.nextLine());
        int strength = 0;

        for (int i = 0; i < sb.length(); i++) {
            if (strength > 0 && sb.charAt(i) != '>') {
                sb.deleteCharAt(i);
                strength--;
                i--;
            } else if (sb.charAt(i) == '>') {
                strength += Integer.parseInt(String.valueOf(sb.charAt(i + 1)));
            }
        }
        System.out.println(sb);
    }
}
