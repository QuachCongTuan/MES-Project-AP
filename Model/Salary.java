package Model;
import java.util.Date;

public class Salary {
    public String salaryID;
    public Employee emp;
    public Date salaryDate;


    public void setSalaryID(String salaryID) {
        this.salaryID = salaryID;
    }

    public String getSalaryID() {
        return salaryID;
    }

    public Employee getEmp() {
        return emp;
    }

    public void setEmp(Employee emp) {
        this.emp = emp;
    }

    public Date getSalaryDate() {
        return salaryDate;
    }
    
    public void setSalaryDate(Date salaryDate) {
        this.salaryDate = salaryDate;
    }

    
}
