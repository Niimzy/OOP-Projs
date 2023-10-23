public class Laptop extends Electronics{

    private String processor;
    private String Ram;
    private String screenDimensions;

    public Laptop(String name,double price, int quantity, double tax, int id, String consumption, String warranty, String processor, String ram, String screenDimensions) {
        super(name,price,quantity, tax, id, consumption, warranty);
        this.processor = processor;
        Ram = ram;
        this.screenDimensions = screenDimensions;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getRam() {
        return Ram;
    }

    @Override
    public String toString() {
        return   super.toString() +
                ", processor= " + processor +
                ", Ram= " + Ram +
                ", screenDimensions= " + screenDimensions;
    }

    public void setRam(String ram) {
        Ram = ram;
    }

    public String getScreenDimensions() {
        return screenDimensions;
    }

    public void setScreenDimensions(String screenDimensions) {
        this.screenDimensions = screenDimensions;
    }

}
