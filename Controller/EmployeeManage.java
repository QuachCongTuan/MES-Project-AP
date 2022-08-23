package Controller;

import Interface.ActionEmp;
import Model.*;
import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeManage implements ActionEmp<Employee, Department, Position> {

    @Override
    public Object add(ArrayList<Employee> list) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean edit(ArrayList<Employee> list) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void sort(ArrayList<Employee> list) {
        System.out.println("Sorting:");
        System.out.println("1.Sort by Employee ID");
        System.out.println("2.Sort by Employee Name");
        System.out.println("======================================================");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                for (int i = 0; i < list.size(); i++) {
                    for (int j = i + 1; j < list.size(); j++) {
                        if (list.get(i).getEmpID().compareTo(list.get(j).getEmpID()) > 0) {
                            Employee temp = list.get(i);
                            list.set(i, list.get(j));
                            list.set(j, temp);
                        }
                    }
                }
                break;
            case 2:
                for (int i = 0; i < list.size(); i++) {
                    for (int j = i + 1; j < list.size(); j++) {
                        if (list.get(i).getEmpName().compareTo(list.get(j).getEmpName()) > 0) {
                            Employee temp = list.get(i);
                            list.set(i, list.get(j));
                            list.set(j, temp);
                        }
                    }
                }
                break;
        }

    }

    @Override
    public Employee add(ArrayList<Employee> list, ArrayList<Department> list2, ArrayList<Position> list3) {
        Employee emp = new Employee();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee ID: ");
        String empID = sc.nextLine();
        while (checkID(list, empID)) {
            System.out.println("Employee ID is Invalid!");
            empID = sc.nextLine();
        }
        emp.setEmpID(empID);
        System.out.println("Enter Employee Name: ");
        String empName = sc.nextLine();
        emp.setEmpName(empName);
        System.out.println("Enter Employee Email: ");
        String empEmail = sc.nextLine();
        emp.setEmpEmail(empEmail);
        System.out.println("Enter Working Hours: ");
        double workingHours = sc.nextDouble();
        emp.setWorkingHours(workingHours);
        System.out.println("Enter Department ID: ");
        sc = new Scanner(System.in);
        String depID = sc.nextLine();
        int countdep = 0;
        for (int i = 0; i < list2.size(); i++) {
            if (list2.get(i).getDepID().equals(depID)) {
                emp.setDep(list2.get(i));

            } else {
                countdep++;
            }
        }
        if (countdep == list2.size()) {
            System.out.println("Not found!");
        }

        System.out.println("Enter Position ID: ");
        String posID = sc.nextLine();
        int countpos = 0;
        for (int i = 0; i < list3.size(); i++) {
            if (list3.get(i).getPosID().equals(posID)) {
                emp.setPos(list3.get(i));

            } else {
                countpos++;
            }
        }
        if (countpos == list3.size()) {
            System.out.println("Not found!");
        }
        return emp;
    }

    @Override
    public boolean edit(ArrayList<Employee> list, ArrayList<Department> list2, ArrayList<Position> list3) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee ID: ");
        String empID = sc.nextLine();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getEmpID().equals(empID)) {
                System.out.println("Enter Employee Name: ");
                String empName = sc.nextLine();
                System.out.println("Enter Employee Email: ");
                String empEmail = sc.nextLine();
                System.out.println("Enter Working Hours: ");
                double workingHours = sc.nextDouble();
                System.out.println("Enter Department ID: ");
                sc = new Scanner(System.in);
                String depID = sc.nextLine();
                int countdep = 0;
                for (int j = 0; j < list2.size(); j++) {
                    if (list2.get(j).getDepID().equals(depID)) {
                        list.get(i).setDep(list2.get(j));

                    } else {
                        countdep++;
                    }
                }
                if (countdep == list2.size()) {
                    System.out.println("Not found!");
                }
                System.out.println("Enter Position ID: ");
                String posID = sc.nextLine();
                int countpos = 0;
                for (int j = 0; j < list3.size(); j++) {
                    if (list3.get(j).getPosID().equals(posID)) {
                        list.get(i).setPos(list3.get(j));

                    } else {
                        countpos++;
                    }
                }
                if (countpos == list3.size()) {
                    System.out.println("Not found!");
                }
                return true;
            }
        }
        System.out.println("Not found!");
        return true;
    }

    @Override
    public boolean delete(ArrayList<Employee> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee ID: ");
        String empID = sc.nextLine();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getEmpID().equals(empID)) {
                list.remove(i);
                return true;
            }
        }
        System.out.println("Not found!");
        return true;
    }

    @Override
    public void show(ArrayList<Employee> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.printf("|%-20s|%-20s|%-20s|%-20s|%-30s|%-30s|%n", "ID", "Name", "Email", "Working Hours",
                    "Department", "Position");
            System.out.printf("|%-20s|%-20s|%-20s|%-20s|%-30s|%-30s|%n", list.get(i).getEmpID(),
                    list.get(i).getEmpName(), list.get(i).getEmpEmail(), list.get(i).getWorkingHours(),
                    list.get(i).getDep().getDepName(), list.get(i).getPos().getPosName());
        }
    }

    @Override
    public void search(ArrayList<Employee> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee ID: ");
        String empID = sc.nextLine();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getEmpID().equals(empID)) {
                System.out.printf("|%-10s|%-20s|%-20s|%-10s|%-10s|%-10s|%n", "ID", "Name", "Email", "Working Hours",
                        "Department", "Position");
                System.out.printf("|%-10s|%-20s|%-20s|%-10s|%-10s|%-10s|%n", list.get(i).getEmpID(),
                        list.get(i).getEmpName(), list.get(i).getEmpEmail(), list.get(i).getWorkingHours(),
                        list.get(i).getDep().getDepName(), list.get(i).getPos().getPosName());
            }
        }
    }

    @Override
    public boolean checkID(ArrayList<Employee> list, String id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getEmpID().equals(id)) {
                return true;
            }
        }
        return false;
    }

}
