package basic;

import java.util.Scanner;

public class basicPart1 {

    public static int twoNumbers() {
        Scanner number = new Scanner(System.in);
        System.out.println("Enter the number x : ");
         int x = number.nextInt();
        System.out.println("Enter the number y : ");
        int y = number.nextInt();
        int z = x * y;
        return z;
    }
    public static void main (String[] args) {
        System.out.println("The product of 2 numbers:" + basicPart1.twoNumbers());

    }

}
