import java.util.Scanner;
public class ShipCostCalculator {
    public static void main() {
        double itemPrice;
        double shipCost;
        Scanner input = new Scanner(System.in);
        IO.println("How much Does it Cost?");
        itemPrice = input.nextDouble();

        if (itemPrice >= 100) {
            IO.println("Shipping is free for orders over $100");
        } else {
            shipCost = itemPrice * 1.02;
            IO.println("Your Total Cost After Shipping Is " + shipCost);
        }

    }
}