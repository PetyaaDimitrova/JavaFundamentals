package Lists;

import java.util.Arrays;
import java.util.Scanner;

public class Ex_01 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] numbersToSplit = scan.nextLine().split(" ");

        String text = scan.nextLine();


        for (int i = 0; i < numbersToSplit.length; i++) {
            int[] number = Arrays.stream(numbersToSplit[i].split(""))
                    .mapToInt(Integer::parseInt).toArray();
            int index = Arrays.stream(number).sum();

            for (int j = 0; j < text.length(); j++) {
                if (j == index) {
                    System.out.print(text.charAt(j));
                    StringBuilder sb = new StringBuilder(text);
                    sb.deleteCharAt(j);
                    text = sb.toString();
                    break;
                }
                if (j == text.length() - 1) {
                    j = -1;
                    index = index - text.length();
                }
            }

        }
    }
}
