package Main;

import Interface.Action;
import Model.*;
import java.util.ArrayList;
import java.util.Scanner;
import Controller.*;

public class Main {
    public static void main(String[] args) {
        Department dep1 = new Department("DEV", "Developer", 20.0);
        Department dep2 = new Department("QA", "Quality Assurance", 15.0);
        Department dep3 = new Department("HR", "Human Resource", 10.0);

        Position pos1 = new Position("FRE", "Fresher", 0.5);
        Position pos2 = new Position("JUN", "Junior", 30.0);
        Position pos3 = new Position("SEN", "Senior", 55.5);

        System.out.println("Management Employee System");
        ArrayList<Department> depList = new ArrayList<Department>();

        depList.add(dep1);
        depList.add(dep2);
        depList.add(dep3);

        DepartmentManage depManage = new DepartmentManage();
        ArrayList<Employee> empList = new ArrayList<Employee>();

        EmployeeManage empManage = new EmployeeManage();
        ArrayList<Position> posList = new ArrayList<Position>();
        posList.add(pos1);
        posList.add(pos2);
        posList.add(pos3);

        PositionManage posManage = new PositionManage();
        ArrayList<Salary> salList = new ArrayList<Salary>();
        SalaryManage salManage = new SalaryManage();
        while (true) {
            System.out.println("==========================================================");
            System.out.println("==========================================================");
            System.out.println("||||                                                   ||||");
            System.out.println("||||              Employee Management System           ||||");
            System.out.println("||||        [1]   Department Manage                    ||||");
            System.out.println("||||        [2]   Position Manage                      ||||");
            System.out.println("||||        [3]   Employee Manage                      ||||");
            System.out.println("||||        [4]   Salary Manage                        ||||");
            System.out.println("||||        [5]   Exit                                 ||||");
            System.out.println("||||                                                   ||||");
            System.out.println("==========================================================");
            System.out.println("==========================================================");
            Scanner sc = new Scanner(System.in);
            int choose = sc.nextInt();
            switch (choose) {

                case 1:
                    boolean check = true;
                    int depChoose = 0;
                    while (true) {
                        System.out.println("=====================================================");
                        System.out.println("||                                                 ||");
                        System.out.println("||            Department Management System         ||");
                        System.out.println("||      [1]   Add Department                       ||");
                        System.out.println("||      [2]   Edit Department                      ||");
                        System.out.println("||      [3]   Delete Department                    ||");
                        System.out.println("||      [4]   Show Department                      ||");
                        System.out.println("||      [5]   Search Department                    ||");
                        System.out.println("||      [6]   Sort Department                      ||");
                        System.out.println("||      [7]   Back                                 ||");
                        System.out.println("||                                                 ||");
                        System.out.println("=====================================================");
                        depChoose = sc.nextInt();
                        switch (depChoose) {
                            case 1:
                                depList.add(depManage.add(depList));
                                break;
                            case 2:
                                depManage.edit(depList);
                                break;
                            case 3:
                                depManage.delete(depList);
                                break;
                            case 4:
                                depManage.show(depList);
                                break;
                            case 5:
                                depManage.search(depList);
                                break;
                            case 6:
                                depManage.sort(depList);
                                break;
                            case 7:
                                check = false;
                                break;
                            default:
                                System.out.println("Please choose again!");
                                break;
                        }
                        if (check == false) {
                            break;
                        }
                    }
                    break;
                case 2:
                    boolean check2 = true;
                    int posChoose = 0;
                    while (true) {
                        System.out.println("=====================================================");
                        System.out.println("||                                                 ||");
                        System.out.println("||            Position Management System           ||");
                        System.out.println("||      [1]   Add Position                         ||");
                        System.out.println("||      [2]   Edit Position                        ||");
                        System.out.println("||      [3]   Delete Position                      ||");
                        System.out.println("||      [4]   Show Position                        ||");
                        System.out.println("||      [5]   Search Position                      ||");
                        System.out.println("||      [6]   Sort Position                        ||");
                        System.out.println("||      [7]   Back                                 ||");
                        System.out.println("||                                                 ||");
                        System.out.println("=====================================================");
                        posChoose = sc.nextInt();
                        switch (posChoose) {
                            case 1:
                                posList.add(posManage.add(posList));
                                break;
                            case 2:
                                posManage.edit(posList);
                                break;
                            case 3:
                                posManage.delete(posList);
                                break;
                            case 4:
                                posManage.show(posList);
                                break;
                            case 5:
                                posManage.search(posList);
                                break;
                            case 6:
                                posManage.sort(posList);
                                break;
                            case 7:
                                check2 = false;
                                break;
                            default:
                                System.out.println("Please choose again!");
                                break;
                        }
                        if (check2 == false) {
                            break;
                        }
                    }
                    break;
                case 3:
                    boolean check3 = true;
                    int empChoose = 0;
                    while (true) {
                        System.out.println("=====================================================");
                        System.out.println("||                                                 ||");
                        System.out.println("||            Employee Management System           ||");
                        System.out.println("||      [1]   Add Employee                         ||");
                        System.out.println("||      [2]   Edit Employee                        ||");
                        System.out.println("||      [3]   Delete Employee                      ||");
                        System.out.println("||      [4]   Show Employee                        ||");
                        System.out.println("||      [5]   Search Employee                      ||");
                        System.out.println("||      [6]   Sort Employee                        ||");
                        System.out.println("||      [7]   Back                                 ||");
                        System.out.println("||                                                 ||");
                        System.out.println("=====================================================");
                        empChoose = sc.nextInt();
                        switch (empChoose) {
                            case 1:
                                empList.add(empManage.add(empList, depList, posList));
                                break;
                            case 2:
                                empManage.edit(empList, depList, posList);
                                break;
                            case 3:
                                empManage.delete(empList);
                                break;
                            case 4:
                                empManage.show(empList);
                                break;
                            case 5:
                                empManage.search(empList);
                                break;
                            case 6:
                                empManage.sort(empList);
                                break;
                            case 7:
                                check3 = false;
                                break;
                            default:
                                System.out.println("Please choose again!");
                                break;
                        }
                        if (check3 == false) {
                            break;
                        }
                    }
                    break;
                case 4:
                    boolean check4 = true;
                    int salChoose = 0;
                    while (true) {
                        System.out.println("=====================================================");
                        System.out.println("||                                                 ||");
                        System.out.println("||            Salary Management System             ||");
                        System.out.println("||      [1]   Add Salary                           ||");
                        System.out.println("||      [2]   Edit Salary                          ||");
                        System.out.println("||      [3]   Delete Salary                        ||");
                        System.out.println("||      [4]   Show Salary                          ||");
                        System.out.println("||      [5]   Search Salary                        ||");
                        System.out.println("||      [6]   Sort Salary                          ||");
                        System.out.println("||      [7]   Back                                 ||");
                        System.out.println("||                                                 ||");
                        System.out.println("=====================================================");
                        salChoose = sc.nextInt();
                        switch (salChoose) {
                            case 1:
                                salList.add(salManage.add(salList, empList));
                                break;
                            case 2:
                                salManage.edit(salList, empList);
                                break;
                            case 3:
                                salManage.delete(salList);
                                break;
                            case 4:
                                salManage.show(salList);
                                break;
                            case 5:
                                salManage.search(salList);
                                break;
                            default:
                                System.out.println("Please choose again!");
                                break;
                        }
                        if (check4 == false) {
                            break;
                        }
                    }
                    break;
            }
        }
    }
}
