public class Table implements Furniture {
    private double weight;
    private double length;

    public Table(double weight, double length) {
        this.weight = weight;
        this.length = length;
    }

    public double getWeight() {
        return weight;
    }

    public double getLength() {
        return length;
    }

    @Override
    public double accept(ShippingCostVisitor visitor) {
        return visitor.calculateShippingCost(this);
    }
}
