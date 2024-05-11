package day5;

public class ShortHand {
    public static void main(String[] args) {
        double orderTotal = 150.0;
        double discountThreshold = 100.0;
        double shippingCost = (orderTotal > discountThreshold) ? 0.0 : 10.0;
        System.out.println("Shipping cost $"+shippingCost);
    }
}
