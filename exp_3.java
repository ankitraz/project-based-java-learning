import java.util.Scanner;

// create an application to calculate interest for fds, rds based on certain conditions.

public class exp_3 {
    public static void main(String[] args) {
        System.out.println("Enter Your age: ");
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();
        System.out.println("Enter maturity period: ");
        double maturity_period = input.nextInt();
        fdAccount a1 = new fdAccount(age, maturity_period);
        a1.calculateFD();
        input.close();
    }
}


 class fdAccount{
    public int age;
    public double interest_rate = 0;
    public double amount = 23000;
    public double maturity_period;
    fdAccount(int age, double maturity_period){
            if (age < 65){
                if( maturity_period > 7 && maturity_period <14){
                    interest_rate = 4.50;
                }
                if( maturity_period > 15 && maturity_period < 29){
                    interest_rate = 4.75;
                }
                if( maturity_period > 30 && maturity_period <45){
                    interest_rate = 5.50;
                }
                if( maturity_period > 45 && maturity_period <60){
                    interest_rate = 7.00;
                }
                if( maturity_period > 61 && maturity_period <184){
                    interest_rate = 7.50;
                }
                if( maturity_period > 185 && maturity_period <365){
                    interest_rate = 8.00;
                }
            else if (age >= 65 ){
                if( maturity_period > 7 && maturity_period <14){
                    interest_rate = 5.00;
                }
                if( maturity_period > 15 && maturity_period < 29){
                    interest_rate = 5.25;
                }
                if( maturity_period > 30 && maturity_period <45){
                    interest_rate = 6.00;
                }
                if( maturity_period > 45 && maturity_period <60){
                    interest_rate = 7.50;
                }
                if( maturity_period > 61 && maturity_period <184){
                    interest_rate = 8.00;
                }
                if( maturity_period > 185 && maturity_period <365){
                    interest_rate = 8.50;
                }
            }
        }
    }

    public void calculateFD(){
        double interest = (amount * interest_rate)/100;
        System.out.println("Interest: " + interest);
    }
}



// class FDaccount extends Account{
//     double interest_rate;
//     double amount;
//     int no_of_days;
//     int age_of_ac_holder;
    
//     double calculate_interest(int amount, int no_of_days, double interest_rate, int age){
//         if (age > 60){

//         }
//     }
// }