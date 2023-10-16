public class Laptop extends Electronics{

    private String processor;
    private String Ram;
    private String screenDimensions;

    public Laptop(String name, int quantity, double tax, int id, double consumption, String warranty, String processor, String ram, String screenDimensions) {
        super(name, quantity, tax, id, consumption, warranty);
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
        return "Laptop{" +
                "processor='" + processor + '\'' +
                ", Ram='" + Ram + '\'' +
                ", screenDimensions='" + screenDimensions + '\'' +
                '}';
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
