import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class exp_4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("------------------------------------");
        System.out.println("Enter a selection: ");
        System.out.println("1. Add an Employee: ");
        System.out.println("2. Display All: ");
        System.out.println("3. Exit!");
        System.out.println("----------------------------------------");
        int user_input = sc.nextInt();

        switch (user_input) {
            case 1:
                addEmployee();
                break;
            case 2:
                displayDetails();
                break;
            default:
                System.out.println("Thanks for using ! Exiting... ");
                break;
        }
        sc.close();
    }

    static void addEmployee(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of employee: ");
        String EmpName = sc.next();
        System.out.println("Enter Employee ID: ");
        int EmpID = sc.nextInt();
        System.out.println("Enter Designation: ");
        String EmpDesign = sc.next();
        System.out.println("Enter Salary of Employee: ");
        String EmpSalary = sc.next();
        sc.close();


        // Creating new file to store all the above data

        File myobj = new File("details.txt");
        System.out.println("File created sucesfully.");
        System.out.println("Writing to file....");

        try{
            FileWriter myWriter = new FileWriter("details.txt", true);

            if (myobj.createNewFile()) {
                System.out.println("File created" + myobj.getName());
            }
            else {
                System.out.println("File already exists!");
            }


            myWriter.write(EmpID);
            myWriter.write(EmpName);
            myWriter.write(EmpDesign);
            myWriter.write(EmpSalary);
            myWriter.close();
            
            System.out.println("Details saved sucessfully!!!");
        } catch (IOException e) {
            System.out.println("An error occured!!");
            e.printStackTrace();
        }
    }


    static void displayDetails(){
        try {
            File myObj = new File("details.txt");
            Scanner myReader = new Scanner(myObj);

            while (myReader.hasNextLine()){
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();

        } catch (FileNotFoundException e) {
            System.out.println("An error occured!");
            e.printStackTrace();
        }
    }
}