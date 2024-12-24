//StringInput

import java.util.Scanner;

class StringInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //getting string input from the user
        System.out.println("Hi!!! Kindly Share your name");
        String stringInput = input.nextLine();
        System.out.printf("your name is: %s\n", stringInput);
    }
}
