
import java.util.*;

    abstract class Accounts {
        double interestRate;
        double amount;
        abstract double calculateInterest();
    }
    class SBAccount extends Accounts {
        Scanner sc = new Scanner(System.in);
        double interestRate = 0;
        double amount = 0;

        double calculateInterest() {
            System.out.println("Enter your savings amount: ");
            amount = sc.nextDouble();

            System.out.println("Enter the account type:\n1. Normal\n2. NRI ");
            int n = sc.nextInt();

            if (amount < 0) {
                System.out.println("Enter right amount.");
                return 0;
            }
            if (n == 1) {
                interestRate = amount * 4 / 100;
            } else if (n == 2) {
                interestRate = amount * 6 / 100;
            } else {
                System.out.println("Wrong choice.");
                return 0;
            }

            return interestRate;
        }
    }
    class FDAccount extends Accounts {
        Scanner sc = new Scanner(System.in);
        double interestRate;
        double amount;
        int noOfDays;
        int ageOfACHolder;

        double aboveCore(double amount1, int noOfDays) {
            if (noOfDays >= 7 && noOfDays <= 14) {
                return amount1 * 6.5 / 100;
            } else if (noOfDays >= 15 && noOfDays <= 29) {
                return amount1 * 6.75 / 100;
            } else if (noOfDays >= 30 && noOfDays <= 44) {
                return amount1 * 6.75 / 100;
            } else if (noOfDays >= 45 && noOfDays <= 59) {
                return amount1 * 8 / 100;
            } else if (noOfDays >= 60 && noOfDays <= 184) {
                return amount1 * 8.5 / 100;
            } else if (noOfDays >= 185 && noOfDays <= 365) {
                return amount1 * 10 / 100;
            } else return 0;
        }

        double belowCore(double amount2, int noOfDays, int ageOfACHolder) {
            if (ageOfACHolder <= 60) {
                if (noOfDays >= 7 && noOfDays <= 14) {
                    return amount2 * 4.5 / 100;
                } else if (noOfDays >= 15 && noOfDays <= 29) {
                    return amount2 * 4.75 / 100;
                } else if (noOfDays >= 30 && noOfDays <= 44) {
                    return amount2 * 5.5 / 100;
                } else if (noOfDays >= 45 && noOfDays <= 59) {
                    return amount2 * 7 / 100;
                } else if (noOfDays >= 60 && noOfDays <= 184) {
                    return amount2 * 7.5 / 100;
                } else if (noOfDays >= 185 && noOfDays <= 365) {
                    return amount2 * 8 / 100;
                } else
                    return 0;
            }
            else {
                if (noOfDays >= 7 && noOfDays <= 14) {
                    return amount2 * 5 / 100;
                } else if (noOfDays >= 15 && noOfDays <= 29) {
                    return amount2 * 5.25 / 100;
                } else if (noOfDays >= 30 && noOfDays <= 44) {
                    return amount2 * 6 / 100;
                } else if (noOfDays >= 45 && noOfDays <= 59) {
                    return amount2 * 7.5 / 100;
                } else if (noOfDays >= 60 && noOfDays <= 184) {
                    return amount2 * 8 / 100;
                } else if (noOfDays >= 185 && noOfDays <= 365) {
                    return amount2 * 8.5 / 100;
                } else
                    return 0;
            }
        }

        double calculateInterest() {
            System.out.println("Enter your FD amount: ");
            amount = sc.nextDouble();

            System.out.println("Enter the number of days: ");
            noOfDays = sc.nextInt();

            if (noOfDays < 0) {
                System.out.println("Invalid no. of Days. Please Enter correct details.");
                return 0;
            }
            System.out.println("Enter your Age: ");
            ageOfACHolder = sc.nextInt();

            if (ageOfACHolder < 0) {
                System.out.println("Invalid Age. Please Enter correct details.");
                return 0;
            }

            if (amount >= 0 && amount <= 10000000) {
                interestRate = belowCore(amount, noOfDays, ageOfACHolder);
            } else if (amount > 10000000) {
                interestRate = aboveCore(amount, noOfDays);
            } else {
                System.out.println("Enter right amount.");
                return 0;
            }
            return interestRate;
        }
    }

        class RDAccount extends Accounts {
            Scanner sc = new Scanner(System.in);
            double interestRate;
            double amount;
            int noOfMonths;
            int ageOfACHolder;
            double monthlyAmount;

            double general(double monthlyAmount, double months) {
                if (months > 0 && months <= 6) {
                    return monthlyAmount * months * (months + 1) * 7.5 / 2400;
                } else if (months > 6 && months <= 9) {
                    return monthlyAmount * months * (months + 1) * 7.75 / 2400;
                } else if (months > 9 && months <= 12) {
                    return monthlyAmount * months * (months + 1) * 8 / 2400;
                } else if (months > 12 && months <= 15) {
                    return monthlyAmount * months * (months + 1) * 8.25 / 2400;
                } else if (months > 15 && months <= 18) {
                    return monthlyAmount * months * (months + 1) * 8.5 / 2400;
                } else if (months > 18 && months <= 21) {
                    return monthlyAmount * months * (months + 1) * 8.75 / 2400;
                } else return 0;
            }

            double senior(double monthlyAmount, double months) {
                if (months > 0 && months <= 6) {
                    return monthlyAmount * months * (months + 1) * 8 / 2400;
                } else if (months > 6 && months <= 9) {
                    return monthlyAmount * months * (months + 1) * 8.25 / 2400;
                } else if (months > 9 && months <= 12) {
                    return monthlyAmount * months * (months + 1) * 8.5 / 2400;
                } else if (months > 12 && months <= 15) {
                    return monthlyAmount * months * (months + 1) * 8.75 / 2400;
                } else if (months > 15 && months <= 18) {
                    return monthlyAmount * months * (months + 1) * 9 / 2400;
                } else if (months > 18 && months <= 21) {
                    return monthlyAmount * months * (months + 1) * 9.25 / 2400;
                } else return 0;
            }

            double calculateInterest() {
                System.out.println("Enter the monthly amount: ");
                monthlyAmount = sc.nextDouble();

                if (monthlyAmount < 0) {
                    System.out.println("Invalid Amount. Please Enter correct details.");
                    return 0;
                }

                System.out.println("Enter the number of months: ");
                noOfMonths = sc.nextInt();

                if (noOfMonths <= 0) {
                    System.out.println("Invalid no. of Months. Please Enter correct details.");
                    return 0;
                }

                amount = monthlyAmount * noOfMonths;
                System.out.println("Enter your Age: ");
                ageOfACHolder = sc.nextInt();

                if (ageOfACHolder <= 0) {
                    System.out.println("Invalid Age. Please Enter correct details.");
                    return 0;
                } else if (ageOfACHolder >= 1 && ageOfACHolder <= 60) {
                    interestRate = general(monthlyAmount, noOfMonths);
                } else {
                    interestRate = senior(monthlyAmount, noOfMonths);
                }
                return interestRate;
            }
        }

            class exp_3 {
                public static void main(String[] args) {

                    Scanner sc = new Scanner(System.in);


                    SBAccount sb = new SBAccount();

                    FDAccount fd = new FDAccount();
                    RDAccount rd = new RDAccount();

                    while (true) {
                        System.out.println("\nSelect the option:" +
                                "\n1. Calculate SB - " +
                                "\n2. Calculate FD - " +
                                "\n3. Calculate RD - " +
                                "\n4. Close this menu.\n");
                        int n = sc.nextInt();
                        switch (n) {
                            case 1:
                                double d1 = sb.calculateInterest();
                                System.out.println("Interest -  " + d1);
                                break;
                            case 2:
                                double d2 = fd.calculateInterest();
                                System.out.println("Interest - " + d2);
                                break;
                            case 3:
                                double d3 =  rd.calculateInterest();
                                System.out.println("Interest - " + d3);
                                break;
                            case 4:
                                System.out.println("Exiting...");
                                sc.close();
                        }
                    }
                }
            }