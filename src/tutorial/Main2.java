package tutorial;

import java.util.Scanner;

public class Main2 {

    private static Scanner scanner = new Scanner(System.in);
    private static int x;


    public static void main(String[] args) {
        while(true) {
            try {
                x = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid input, please try again");
                scanner.nextLine();
                continue;
            }
            break;
        }

        System.out.println(x);
    }

}
