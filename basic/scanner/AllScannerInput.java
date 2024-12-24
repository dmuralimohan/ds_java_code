//AllScannerInput

import java.util.Scanner;

class AllScannerInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //getall datatype inputs from user

        //byte
        System.out.println("Enter byte value");
        byte byteInput = input.nextByte();

        //short
        System.out.println("Enter short value from 0 to 128");
        short shortInput = input.nextShort();

        //int
        System.out.println("Enter the integer value");
        int integerInput = input.nextInt();

        //long
        System.out.println("Enter long value");
        long longInput = input.nextLong();

        //float
        System.out.println("Enter float value");
        float floatInput = input.nextFloat();

        //double
        System.out.println("Enter double value");
        double doubleInput = input.nextDouble();

        //char
        System.out.println("Enter a single character");
        char charInput = input.next().charAt(0);
        input.nextLine();

        //string(non-primitive datatype)
        System.out.println("Enter your name(String)");
        String stringInput = input.nextLine();

        //boolean
        System.out.println("Enter the boolean value");
        boolean booleanInput = input.nextBoolean();
        
        String result = "byte:"+ byteInput +"\nshort:"+ shortInput +"\ninteger:"+ integerInput +"\nlong:"+ longInput +"\nfloat:"+ floatInput +"\ndoubleInput:"+ doubleInput +"\nchar:"+ charInput +"\nstring:"+ stringInput +"\nboolean:"+ booleanInput;
        System.out.println(result);
    }
}
