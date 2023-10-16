public class tables extends furniture {
    private String shape;

    @Override
    public String toString() {
        return "tables{" +
                "shape='" + shape + '\'' +
                '}';
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public tables(String name, int quantity, double tax, int id, String material, String dimensions, String shape) {
        super(name, quantity, tax, id, material, dimensions);
        this.shape = shape;
    }
}
