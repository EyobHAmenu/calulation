import java.util.Scanner;

public class calculator {
    public static void main (String[] args)
    {
        int num1;
        int num2;
        int sum;
        int product;
        String str1, str2;
        Scanner scan = new Scanner(System.in); // accept values from user
        System.out.print("Enter a number");  // ask the user to enter number
        num1 = scan.nextInt();                  // save the number entered from user on variable num1
        System.out.print("Enter an other number");  // again ask the user to enter next number
        num2 = scan.nextInt();              // save the second number entered from user on the second variable num2
        sum = num1 + num2;              // save the addition result of num1 and num2 on variable sum
        product = num1 * num2;          // save teh product result of num1 and num 2 on variable product
        System.out.println("Sum: " + sum);  // print the sum of the two numbers for the user
        System.out.println("Product: " + product); // print the product of the two numbers for the user
        System.out.println("Square of : " + num1 + " = " + num1*num1); // calculate and print the square of num1
        System.out.println("Square of : " + num2 + " = " + num2*num2); // calculate and print the square of num2

        scan.nextLine();
        System.out.println("Enter a word.");
        str1 = scan.nextLine();
        System.out.println("Enter another word.");
        str2 = scan.nextLine();
        System.out.println(str1 + str2);
    }
}
