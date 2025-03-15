public class Main {
    public static void main(String[] args) {
        ShippingCostVisitor shippingCostVisitor = new ShippingCostCalculator();

        Furniture chair = new Chair(5);
        Furniture table = new Table(20, 1.5);
        Furniture sofa = new Sofa(3, 100);

        System.out.println("Shipping cost for Chair: $" + chair.accept(shippingCostVisitor));
        System.out.println("Shipping cost for Table: $" + table.accept(shippingCostVisitor));
        System.out.println("Shipping cost for Sofa: $" + sofa.accept(shippingCostVisitor));
    }
}