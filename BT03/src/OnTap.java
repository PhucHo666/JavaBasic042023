import java.util.Scanner;

import static java.util.Scanner.*;

public class OnTap{

    static int number = 100;
    public static void sosanh()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input value n:");
        double n = sc.nextDouble();

        if (n == number)
            System.out.println("This value is equal to 100.");
        else if ( n > number) {
            System.out.println("This value is larger than 100.");
        }
        else if (n < number) {
            System.out.println("This value is smaller than 100.");
        }
        else
            System.out.println("This value is not valid.");
    }


    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        String expectedText = "Selenium Java";
        String actualText = "Selenium Java";

        System.out.println(expectedText == actualText);
        System.out.println(actualText != expectedText);
        System.out.println((expectedText == actualText) && (a < b));
        System.out.println((expectedText != actualText) || (a < b));

        sosanh();

    }

}
