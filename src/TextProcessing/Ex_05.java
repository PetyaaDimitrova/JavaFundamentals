package TextProcessing;

import java.util.Scanner;

public class Ex_05 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String title = scan.nextLine();
        String article = scan.nextLine();

        String input = scan.nextLine();

        System.out.printf("<h1>\n" +
                "    %s\n" +
                "</h1>\n" +
                "<article>\n" +
                "    %s\n" +
                "</article>\n", title, article);

        while (!input.equals("end of comments")) {

            System.out.printf("<div>\n" +
                    "    %s\n" +
                    "</div>\n", input);

            input = scan.nextLine();
        }
    }
}
