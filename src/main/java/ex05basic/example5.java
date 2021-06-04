package ex05basic;
import java.util.Scanner;

public class example5 {
    public static void main(String[] args)
    {
        System.out.print("What is the first number? ");
        Scanner input = new Scanner(System.in);
        String str_num1 = input.nextLine();
        System.out.print("What is the second number? ");
        String str_num2 = input.nextLine();
        int num_1 = Integer.parseInt(str_num1);
        int num_2 = Integer.parseInt(str_num2);
        int add = num_1 + num_2;
        int subtract = num_1 - num_2;
        int multiply = num_1 * num_2;
        int divide = num_1 / num_2;
        System.out.printf(str_num1 + " + " + str_num2 + " = " + add + "%n" +
                          str_num1 + " - " + str_num2 + " = " + subtract + "%n" +
                          str_num1 + " * " + str_num2 + " = " + multiply + "%n" +
                          str_num1 + " / " + str_num2 + " = " + divide);
    }
}
