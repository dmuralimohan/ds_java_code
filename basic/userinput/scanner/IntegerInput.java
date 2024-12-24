//IntegerInput

import java.util.Scanner;

class IntegerInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your number as int based");
        int number = input.nextInt();
        
        System.out.printf("your number is: %d\n", number);
    }
}
