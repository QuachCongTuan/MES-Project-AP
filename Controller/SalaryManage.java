package Controller;

import Interface.Action;
import Interface.ActionSalary;
import Model.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Date;

public class SalaryManage implements ActionSalary<Salary, Employee> {

    @Override
    public Object add(ArrayList<Salary> list) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean edit(ArrayList<Salary> list) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void sort(ArrayList<Salary> list) {
        // TODO Auto-generated method stub

    }

    @Override
    public Salary add(ArrayList<Salary> list, ArrayList<Employee> list2) {
        Salary sal = new Salary();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Salary ID: ");
        String salaryID = sc.nextLine();
        while (salaryID.length() != 6) {
            System.out.println("Enter Salary ID: ");
            salaryID = sc.nextLine();
        }
        sal.setSalaryID(salaryID);
        System.out.println("Enter Employee ID: ");
        String empID = sc.nextLine();
        int countemp = 0;
        for (int i = 0; i < list2.size(); i++) {
            if (list2.get(i).getEmpID().equals(empID)) {
                sal.setEmp(list2.get(i));

            } else {
                countemp++;
            }
        }
        if (countemp == list2.size()) {
            System.out.println("Employee not found");
        }
        System.out.println("Enter Date: dd-MM-yyyy");
        String date = sc.nextLine();
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        Date time1 = null;
        try {
            time1 = format.parse(date);
        } catch (ParseException ex) {

        }
        sal.setSalaryDate(time1);
        return sal;
    }

    @Override
    public boolean edit(ArrayList<Salary> list, ArrayList<Employee> list2) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Salary ID: ");
        String salaryID = sc.nextLine();
        int countsal = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getSalaryID().equals(salaryID)) {
                System.out.println("Enter Employee ID: ");
                String empID = sc.nextLine();
                int countemp = 0;
                for (int j = 0; j < list2.size(); j++) {
                    if (list2.get(j).getEmpID().equals(empID)) {
                        list.get(i).setEmp(list2.get(j));

                    } else {
                        countemp++;
                    }
                }
                if (countemp == list2.size()) {
                    System.out.println("Employee not found");
                }
                System.out.println("Enter Date: dd-MM-yyyy");
                String date = sc.nextLine();
                SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
                Date time1 = null;
                try {
                    time1 = format.parse(date);
                } catch (ParseException ex) {

                }
                list.get(i).setSalaryDate(time1);
                countsal++;
            }
        }
        return false;
    }

    @Override
    public boolean delete(ArrayList<Salary> list) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void show(ArrayList<Salary> list) {
        for (int i = 0; i < list.size(); i++) {
            Double getTotal = list.get(i).getEmp().getWorkingHours() * list.get(i).getEmp().getDep().getDepSalary()
                    + list.get(i).getEmp().getPos().getPosBonus();
            System.out.printf("|%-10s|%-20s|%-20s|%-10s|%-10s|%-10s|%n", "Date", "Name", "Working Hours", "Salary",
                    "Bonus", "Total");
            System.out.printf("|%-10s|%-20s|%-20s|%-10s|%-10s|%-10s|%n", list.get(i).getSalaryDate(),
                    list.get(i).getEmp().getEmpName(), list.get(i).getEmp().getWorkingHours(),
                    list.get(i).getEmp().getDep().getDepSalary(), list.get(i).getEmp().getPos().getPosBonus(),
                    getTotal);
        }

    }

    @Override
    public void search(ArrayList<Salary> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee ID: ");
        String empID = sc.nextLine();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getEmp().getEmpID().equals(empID)) {
                Double getTotal = list.get(i).getEmp().getWorkingHours() * list.get(i).getEmp().getDep().getDepSalary()
                        + list.get(i).getEmp().getPos().getPosBonus();
                System.out.println("=======================");
                System.out.println("|| Salary Information ||");
                System.out.println("=======================");
                System.out.println("||Date: " + list.get(i).getSalaryDate() + "||");
                System.out.println("||Employee ID: " + list.get(i).getEmp().getEmpID() + "||");
                System.out.println("||Employee Name: " + list.get(i).getEmp().getEmpName() + "||");
                System.out.println("||Working Hours: " + list.get(i).getEmp().getWorkingHours() + "||");
                System.out.println("||Salary: " + list.get(i).getEmp().getDep().getDepSalary() + "||");
                System.out.println("||Bonus: " + list.get(i).getEmp().getPos().getPosBonus() + "||");
                System.out.println("||Total: " + getTotal + "||");

                System.out.printf("|| |%-30s|%-40s|%n ||", "Date", list.get(i).getSalaryDate());
                System.out.printf("|| |%-30s|%-40s|%n ||", "Employee ID", list.get(i).getEmp().getEmpID());
                System.out.printf("|| |%-30s|%-40s|%n ||", "Employee Name", list.get(i).getEmp().getEmpName());
                System.out.printf("|| |%-30s|%-40s|%n ||", "Working Hours", list.get(i).getEmp().getWorkingHours());
                System.out.printf("|| |%-30s|%-40s|%n ||", "Salary", list.get(i).getEmp().getDep().getDepSalary());
                System.out.printf("|| |%-30s|%-40s|%n ||", "Bonus", list.get(i).getEmp().getPos().getPosBonus());
                System.out.printf("====================");
                System.out.printf("|| |%-30s|%-40s|%n ||", "Total", getTotal);
                System.out.printf("====================");
            }
        }

    }

    @Override
    public boolean checkID(ArrayList<Salary> list, String id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getSalaryID().equals(id)) {
                return true;
            }
        }
        return false;
    }

}
