package basic;

import java.util.Scanner;

public class multiplicationTable {

    private static void multiply()
    {
        int i = 1;
        Scanner number = new Scanner(System.in);
        System.out.println("Enter the number x : ");
        int x = number.nextInt();
        while (i<10)
        {
            System.out.println(x+"*"+i+"="+x*i);
            i++;
        }
    }

    public static void main(String[] args) {
        multiply();
        System.out.println("   J    a   v     v  a ");
        System.out.println("   J   a a   v   v  a a");
        System.out.println("J  J  aaaaa   V V  aaaaa");
        System.out.println(" JJ  a     a   V  a     a");
    }
}
