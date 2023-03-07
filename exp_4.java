import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


public class exp_4 {

    static List<Employee> employeeList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("------------------------------------");
        System.out.println("Enter a selection: ");
        System.out.println("1. Add an Employee: ");
        System.out.println("2. Display All: ");
        System.out.println("3. Display an employee details by its E-ID: ");
        System.out.println("4. Exit!");
        System.out.println("-------------------------------------");
        System.out.println();
        int user_input = sc.nextInt();

        switch (user_input) {
            case 1:
                addEmployee();
                break;
            case 2:
                displayDetails();
                break;
            case 3: 
                displayDetailsbyID();
            default:
                System.out.println("Thanks for using ! Exiting... ");
                break;
        }
        sc.close();
    }

    static void addEmployee() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of employee: ");
        String empName = sc.next();
        System.out.println("Enter Employee ID: ");
        int empID = sc.nextInt();
        System.out.println("Enter Designation: ");
        String empDesign = sc.next();
        System.out.println("Enter Salary of Employee: ");
        String empSalary = sc.next();
        sc.close();

        Employee employee = new Employee(empID, empName, empDesign, empSalary);
        employeeList.add(employee);

        // sort the employeeList by employee ID
        Collections.sort(employeeList, Comparator.comparing(Employee::getEmpID));

        // write the employee details to file
        try {
            FileWriter myWriter = new FileWriter("details.txt");
            for (Employee e : employeeList) {
                myWriter.write(e.toString() + "\n");
            }
            myWriter.close();
            System.out.println("Details saved successfully!!!");
        } catch (IOException e) {
            System.out.println("An error occurred!!");
            e.printStackTrace();
        }
    }

    static void displayDetails() {
        try {
            File myObj = new File("details.txt");
            Scanner myReader = new Scanner(myObj);

            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred!");
            e.printStackTrace();
        }
    }

    static void displayDetailsbyID() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Employee ID: ");
        int id = sc.nextInt();
        sc.close();
    
        try {
            File myObj = new File("details.txt");
            Scanner myReader = new Scanner(myObj);
    
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String[] values = data.split(",");
                int empID = Integer.parseInt(values[0]);
                if (empID == id) {
                    System.out.println("Employee ID: " + empID);
                    System.out.println("Name: " + values[1]);
                    System.out.println("Designation: " + values[2]);
                    System.out.println("Salary: " + values[3]);
                    break;
                }
            }
            myReader.close();
    
        } catch (FileNotFoundException e) {
            System.out.println("An error occured!");
            e.printStackTrace();
        }
    }
    

    static class Employee {
        private int empID;
        private String empName;
        private String empDesign;
        private String empSalary;

        public Employee(int empID, String empName, String empDesign, String empSalary) {
            this.empID = empID;
            this.empName = empName;
            this.empDesign = empDesign;
            this.empSalary = empSalary;
        }

        public int getEmpID() {
            return empID;
        }

        public String getEmpName() {
            return empName;
        }

        public String getEmpDesign() {
            return empDesign;
        }

        public String getEmpSalary() {
            return empSalary;
        }

        public String toString() {
            return empID + "," + empName + "," + empDesign + "," + empSalary;
        }
    }
}


