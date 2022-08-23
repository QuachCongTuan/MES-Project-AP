package Model;

public class Employee {
    public String empID;
    public String empName;
    public String empEmail;
    private double workingHours;
    private Department dep;
    private Position pos;

    // public Employee() {
    //     super();
    // }

    // public Employee(String empID, String empName, String empEmail, double workingHours, Department dep, Position pos) {
    //     this.empID = empID;
    //     this.empName = empName;
    //     this.empEmail = empEmail;
    //     this.workingHours = workingHours;
    //     this.dep = dep;
    //     this.pos = pos;
    // }

    public String getEmpID() {
        return empID;
    }

    public void setEmpID(String empID) {
        this.empID = empID;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpEmail() {
        return empEmail;
    }

    public void setEmpEmail(String empEmail) {
        this.empEmail = empEmail;
    }

    public double getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(double workingHours) {
        this.workingHours = workingHours;
    }

    public Department getDep() {
        return dep;
    }

    public void setDep(Department dep) {
        this.dep = dep;
    }

    public Position getPos() {
        return pos;
    }

    public void setPos(Position pos) {
        this.pos = pos;
    }

}
