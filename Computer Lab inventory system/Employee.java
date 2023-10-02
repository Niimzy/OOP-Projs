public class Employee {

    private String employeeID;
    private String name;

    private static String designation = "Lab Attendant";

    Employee(String employeeID, String name){

        this.employeeID = employeeID;
        this.name = name;

    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
}
