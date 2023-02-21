import java.util.*;
public class experiment_1 {
    public static void main(String[] args) {


        int[] empNO = {1001, 1002, 1003, 1004, 1005, 1006, 1007};
        String[] empName = {"Ashish", "Sushma", "Rahul", "Chahat", "Ranjan", "Suman", "Tanmay"};
        String[] empDes = {};
        String[]  depName ={"R&D", "PM" ,"Acct", "FrontDesk", "Engg", "Manufacturing", "PM" };
        String[] datejoin = {"01/04/2009", "23/08/2012", "12/11/2008", "29/01/2013", "16/09/2005", "1/1/2000", "12/06/2006"};
        int[] basic = {20000,30000,10000,12000,50000,23000,29000};
        int[] hra = {8000, 12000, 8000, 6000, 20000, 9000, 12000};
        int[] it = {3000, 9000, 1000, 2000, 20000, 4400, 10000};
        char[] DesCodes= {'e', 'c', 'k', 'r', 'm', 'e', 'c'};   
        int[] DA = {1000,2000,1000,4000,3000,1000,2000};

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the emp no:");
        int input_emp_no = input.nextInt();

        for (int i = 0; i < empNO.length; i++) {
            if(input_emp_no == empNO[i]){
                System.out.println("EmpName " + " depName " + " dateJoin "+ " basic " + " hra " + " it " + " Descode " + " Salary ");
                System.out.println(empName[i] + "  " + depName[i] + "  "  + datejoin[i] + "  " + basic[i] + "  " + hra[i] + "  " + it[i]+ "  " + DesCodes[i] + "  " + (basic[i] + hra[i] + DA[i] - it[i]));
                // System.out.print("depName :" + depName[i] + "  ") ;
                // System.out.print("dateJoin :" + datejoin[i] + "  ");
                // System.out.print("basic :" + basic[i] + "  ");
                // System.out.print("hra :" + hra[i] + "  ");
                // System.out.print("it :" + it[i]+ "  ");
                // System.out.print("Descode :" + DesCodes[i] + "  ");
                // System.out.print("Salary:  " + (basic[i] + hra[i] + DA[i] - it[i])+ "  ");
            }
            
        }


        char input_descode;
        System.out.println("Enter the designation code: ");
        input_descode = input.next().charAt(0);

        switch (input_descode) {
            case 'e':
                System.out.println("Designation : Engineer");
                System.out.println("DA : 1000");
                break;
            case 'c':
                System.out.println("Designation : Consultant");
                System.out.println("DA : 2000");  
                break;  
            case 'k' :
                System.out.println("Designation : clerk");
                System.out.println("DA : 1000"); 
                break;
            case 'r' :
                System.out.println("Designation : Receptionist");
                System.out.println("DA : 3000"); 
                break;
            case 'm':
                System.out.println("Designation : Manager");
                System.out.println("DA : 6000"); 
                break;
            default:
                System.out.println("invalid designation code");
                break;
        }
    }
}