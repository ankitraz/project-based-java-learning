import java.util.Scanner;

// create an application to calculate interest for fds, rds based on certain conditions.

public class exp_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your age: ");
        int age = input.nextInt();
        System.out.println("Enter no.of months: ");
        double maturity_period = input.nextInt();
        System.out.println("Enter amount: ");
        double amount = input.nextInt();
        // fdAccount a1 = new fdAccount(age, maturity_period);
        // a1.calculateFD();
        RDaccount(age, maturity_period, amount);
        input.close();
        


    }

    static void RDaccount(int age, double no_of_months, double amount){
         double interest_rate = 0;
         double time = no_of_months;
        
            
            if (age < 60){
                if (no_of_months == 6){
                    interest_rate = 7.5;
                }
                else if (no_of_months == 9){
                    interest_rate = 7.75;
                }
                else if (no_of_months == 12){
                    interest_rate = 8.00;
                }
                else if (no_of_months == 15){
                    interest_rate = 8.25;
                }
                else if (no_of_months == 18){
                    interest_rate = 8.50;
                }
                else if (no_of_months == 21){
                    interest_rate = 8.75;
                }
            else if(age >= 60){
                if (no_of_months == 6){
                    interest_rate = 8.0;
                }
                else if (no_of_months == 9){
                    interest_rate = 8.25;
                }
                else if (no_of_months == 12){
                    interest_rate = 8.50;
                }
                else if (no_of_months == 15){
                    interest_rate = 8.75;
                }
                else if (no_of_months == 18){
                    interest_rate = 9.00;
                }
                else if (no_of_months == 21){
                    interest_rate = 9.25;
                    }
                }
            }
            double interest = ((amount * (time*(time+1)/2)* (1/12) * interest_rate)/100);
            System.out.println("Interest: " + interest);
    }
}

 class fdAccount{
    public int age;
     double interest_rate = 0;
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
