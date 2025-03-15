public class ShippingCostCalculator implements ShippingCostVisitor {

    @Override
    public double calculateShippingCost(Chair chair) {
        return 10.0; // Flat rate for chairs
    }

    @Override
    public double calculateShippingCost(Table table) {
        return 5.0 * table.getWeight() + 2.0 * table.getLength(); // Based on weight and length
    }

    @Override
    public double calculateShippingCost(Sofa sofa) {
        return 20.0 * sofa.getVolume() + 0.5 * sofa.getDistance(); // Based on volume and distance
    }
}
