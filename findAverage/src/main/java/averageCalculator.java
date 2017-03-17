/**
 * Created by chike on 16/03/2017.
 * With objects like, Scanner and DecimalFormat, if you open a new 'instance' perhaps, of that object,
 * you can reuse them anywhere in your code, just by using the object with its own specific 'method' perhaps.
 *
 * A double is similar to a float.
 *
 * By using print instead of println, you can make things stay on one line, which in this case is better than
 * everything being on their respective own lines.
 */
import java.util.InputMismatchException;
import java.util.Scanner;
import java.text.DecimalFormat;

class averageCalculator {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat twoDP = new DecimalFormat(".##");
        try {
            System.out.print("Please enter your first number: ");
            double a = scan.nextDouble();
            System.out.print("Please enter your second number: ");
            double b = scan.nextDouble();
            System.out.print("Please enter your third number: ");
            double c = scan.nextDouble();
            System.out.print("Please enter your fourth number: ");
            double d = scan.nextDouble();
            System.out.print("Please enter your fifth number: ");
            double e = scan.nextDouble();
            System.out.print("Please enter your sixth number: ");
            double f = scan.nextDouble();

            double sum = a + b + c + d + e + f;
            double average = sum / 6;

            System.out.println("\nThe average of all of your numbers is: " + twoDP.format(average));
        }
        catch(InputMismatchException e){
            System.out.println("Please only enter numerical values.");
        }

    }

}