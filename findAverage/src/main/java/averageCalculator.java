/**
 * Created by chike on 16/03/2017.
 * With objects like, Scanner and DecimalFormat, if you open a new 'instance', of that object,
 * you can reuse them anywhere in your code, just by using the object with its own specific method.
 *
 * A double is similar to a float.
 *
 * By using print instead of println, you can make things stay on one line, which in this case is better than
 * everything being on their respective own lines.
 */
import java.util.InputMismatchException;
import java.util.Scanner;
import java.text.DecimalFormat;

class findTheAverage {
    public static void main(String args[]){
        Scanner scan  = new Scanner(System.in);
        DecimalFormat twoDP = new DecimalFormat(".##");

        double sum = 0;
        double average;
        int i;

        System.out.println("I will ask you to enter six numbers:");
        try {
            for (i = 1; i <= 6; i++) {
                System.out.print(i + ") ");
                sum += scan.nextDouble();
            }

            average = sum / 6;
            System.out.println("\nThe average all these numbers is: " + twoDP.format(average));
        }
        catch (InputMismatchException e){
            System.out.println("Ensure all values are numerical.");
        }
    }
}
