/**
 * Created by chike on 16/03/2017.
 */

import java.util.InputMismatchException;
import java.util.Scanner;
import java.text.DecimalFormat;

class TaxationCalculator {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat twoDP = new DecimalFormat(".##");

        try {
            System.out.print("What item are you trying to buy? ");
            String itemName = scan.next();

            System.out.print("How much does this cost? ");
            float itemCost = scan.nextFloat();

            System.out.print("How many of these do you wish to buy? ");
            int itemQuantity = scan.nextInt();

            double untaxedTotal = itemCost * itemQuantity;
            double VAT = 0.2 * untaxedTotal;
            double totalSum = untaxedTotal + VAT;

            System.out.println("\nVAT: " + twoDP.format(VAT));
            System.out.println("You bought an '" + itemName + "', the grand total plus VAT is: " + twoDP.format(totalSum));
        }
        catch(InputMismatchException e){
            System.out.println("\nPlease enter solely a string value for the item, and a numerical value for the cost and quantity");
        }
    }
}
