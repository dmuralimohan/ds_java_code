//BooleanInput

import java.util.Scanner;

class BooleanInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //getting boolean input from user
        System.out.println("enter your boolean");
        boolean booleanInput = input.nextBoolean();
        System.out.printf("your boolean input is: %b\n", booleanInput);
    }
}
