public class Lab {

    private String labID;
    private Computer[] computers;
//    Labstatus status;

    private Employee labAttendant;

    public Computer[] getComputers() {
        return computers;
    }

    public void setComputers(Computer[] computers) {
        this.computers = computers;
    }

    public Employee getLabAttendant() {
        return labAttendant;
    }

    public void setLabAttendant(Employee labAttendant) {
        this.labAttendant = labAttendant;
    }

    Lab(String labID, Computer[] computers, Employee labAttendant ){

        this.labID = labID;
        this.computers = computers;
        this.labAttendant = labAttendant;

    }


    public String getLabID() {
        return labID;
    }

    public void setLabID(String labID) {
        this.labID = labID;
    }

    private int count = 0;
    public void addComputer(Computer computer)
    {
        computers[count++] = new Computer(computer.getComputerNumber(), computer.getIcdModel(), computer.getRamSize(), computer.getHddSize(), computer.isHasGPU());
    }

    public boolean removeComputer (String computerNumber){

        for(int i = 0; i < computers.length; i++)
        {
            if(computers[i].getComputerNumber() == computerNumber){
                computers[i] = null;

            }

        }

        return false;
    }

    public Computer getComputer(String computerNumber){
        for(int i = 0; i < computers.length; i++)
        {
            if(computers[i].getComputerNumber() == computerNumber){
                return computers[i];

            }

        }
    }



}
