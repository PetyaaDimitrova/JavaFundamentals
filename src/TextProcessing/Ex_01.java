package TextProcessing;

import java.util.Scanner;

public class Ex_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String [] arr = scan.nextLine().split("\\\\");

        String[] word = arr[arr.length-1].split("\\.");

        String name = word[0];
        String folder = word[1];

        System.out.printf("File name: %s%nFile extension: %s", name,folder);


    }
}
