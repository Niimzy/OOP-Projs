public class Computer {

    private String computerNumber;
    private String IcdModel;
    private int ramSize;
    private int hddSize;
    private boolean hasGPU;

    Computer(String computerNumber,String IcdModel,int ramSize,int hddSize,boolean hasGPU){
        this.computerNumber = computerNumber;
        this.IcdModel = IcdModel;
        this.ramSize = ramSize;
        this.hddSize = hddSize;
        this.hasGPU = hasGPU;
    }

    public String getIcdModel() {
        return IcdModel;
    }

    public void setIcdModel(String icdModel) {
        IcdModel = icdModel;
    }

    public String getComputerNumber() {
        return computerNumber;
    }

    public void setComputerNumber(String computerNumber) {
        this.computerNumber = computerNumber;
    }

    public int getRamSize() {
        return ramSize;
    }

    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }

    public int getHddSize() {
        return hddSize;
    }

    public void setHddSize(int hddSize) {
        this.hddSize = hddSize;
    }

    public boolean isHasGPU() {
        return hasGPU;
    }

    public void setHasGPU(boolean hasGPU) {
        this.hasGPU = hasGPU;
    }

    public boolean equals(Object o){
        Computer Computer_obj = (Computer)o;
        return this.getComputerNumber().equals(Computer_obj.getComputerNumber());
    }

    public Computer clone(){
        return new Computer(this.computerNumber, this.IcdModel, this.ramSize, this.hddSize, this.hasGPU);
    }


}
