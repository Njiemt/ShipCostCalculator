import java.util.Scanner;
public class ShipCostCalculator {
    public static void main() {
        double itemPrice;
        double shipCost;
        double finalCost;
        Scanner input = new Scanner(System.in);
        IO.println("How much Does it Cost?");
        itemPrice = input.nextDouble();

        if (itemPrice >= 100) {
            IO.println("Shipping is free for orders over $100");
        } else {
            finalCost = itemPrice * 1.02;
            shipCost = itemPrice * 0.02;
            IO.println("your Shipping cost is " + shipCost);
            IO.println("Your Total Cost After Shipping Is " + finalCost);
        }

    }
}