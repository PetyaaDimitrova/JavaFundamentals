package Methods;

import java.util.Scanner;

public class Ex_01 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String dataType = scan.nextLine();
        String input = scan.nextLine();

       String result =  printResult(dataType, input);

       System.out.println(result);


    }

    private static String printResult(String dataType, String input) {
        if(dataType.equals("int")){
            int newNumber = Integer.parseInt(input) * 2;
            return String.valueOf(newNumber);
        } else if(dataType.equals("real")){
            double newNumber = Double.parseDouble(input) * 1.5;
            return String.format("%.2f",newNumber);
        }
            return String.format("$%s$", input);

    }
}
