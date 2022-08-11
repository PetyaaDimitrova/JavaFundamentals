package TextProcessing;

import java.util.Scanner;

public class Ex_04 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());


        for (int i = 0; i < n; i++) {
            String text = scan.nextLine();

            String name = "";
            int age = 0;

            for (int j = 0; j < text.length(); j++) {
                if (text.charAt(j) == '@') {
                    name = startToAppendName(text.substring(j + 1, text.length()));
                }
                if (text.charAt(j) == '#') {
                    age = startToAppendAge(text.substring(j + 1, text.length()));
                }
            }
            System.out.printf("%s is %d years old.%n", name, age);
        }

    }

    private static int startToAppendAge(String substring) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < substring.length(); i++) {
            String ch = Character.toString(substring.charAt(i));
            if (!ch.equals("*")) {
                sb.append(ch);
            } else {
                return Integer.parseInt(sb.toString());
            }
        }
        return 0;
    }

    private static String startToAppendName(String substring) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < substring.length(); i++) {

            String ch = Character.toString(substring.charAt(i));
            if (!ch.equals("|")) {
                sb.append(ch);
            } else {
                return sb.toString();
            }
        }
        return "";
    }
}
