public class smartphones extends Electronics{

    private String OS;
    private String storage;
    private String cameraRes;

    @Override
    public String toString() {

        return "smartphones{" + super.toString() +
                "OS='" + OS + '\'' +
                ", storage='" + storage + '\'' +
                ", cameraRes='" + cameraRes + '\'' +
                '}';
    }

    public smartphones(String name, int quantity, double tax, int id, double consumption, String warranty, String OS, String storage, String cameraRes) {
        super(name, quantity, tax, id, consumption, warranty);
        this.OS = OS;
        this.storage = storage;
        this.cameraRes = cameraRes;
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public String getCameraRes() {
        return cameraRes;
    }

    public void setCameraRes(String cameraRes) {
        this.cameraRes = cameraRes;
    }
}
