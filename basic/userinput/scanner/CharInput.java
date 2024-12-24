//CharInput

import java.util.Scanner;

class CharInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //getting char input from the user
        System.out.println("enter your char input");
        char charInput = input.next().charAt(0);
        System.out.printf("your char input is: %c\n", charInput);
    }
}
