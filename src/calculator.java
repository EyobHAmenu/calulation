import java.util.Scanner;

public class calculator {
    public static void main (String[] args)
    {
        int num1;
        int num2;
        int sum;
        int product;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        num1 = scan.nextInt();
        System.out.println("Enter an other number");
        num2 = scan.nextInt();
        sum = num1 + num2;
        product = num1 * num2;
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
        System.out.println("Square of : " + num1 + " = " + num1*num1);
        System.out.println("Square of : " + num2 + " = " + num2*num2);
    }
}
