public class furniture extends Product{

    private String material;
    private String dimensions;

    @Override
    public String toString() {
        return  super.toString() +
                ", material= " + material +
                ", dimensions= " + dimensions;
    }

    public furniture(String name,double price, int quantity, double tax, int id, String material, String dimensions) {
        super(name,price, quantity, tax, id);
        this.material = material;
        this.dimensions = dimensions;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getDimensions() {
        return dimensions;
    }

    public void setDimensions(String dimensions) {
        this.dimensions = dimensions;
    }
}
