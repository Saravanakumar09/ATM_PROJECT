import java.util.*;


public class Project {

    public static void main(String[] a) {
        int pin = 5005;
        int balance = 50000;

        int AddAmount = 0;
        int TakenAmount = 0;
        String name;
        Scanner scan = new Scanner(System.in);
        // We have taken by the user
        System.out.println("Enter Your Pin Number");
        int password = scan.nextInt();
        if (password == pin) {
            System.out.println("Enter Your Name");
            name = scan.next();
            System.out.println("Welcome " + name);
            while (true) {
                System.out.println("Press 1 to check Your Balance");
                System.out.println("Press 2 to Deposit the Amount");
                System.out.println("Press 3 to Withdraw the amount");
                System.out.println("Press 4 to Print the recipt");
                System.out.println("Press 5 to Exit");

                int opt = scan.nextInt();
                switch (opt) {
                    case 1:
                        System.out.println("Your Balance is" + balance);
                        break;
                    case 2:
                        System.out.println("How much amount will deposit your Account");
                        AddAmount= scan.nextInt();
                        System.out.println("your Amount will be Deposit in your account");
                        balance = balance+AddAmount;
                        break;
                    case 3:
                        System.out.println("Enter the amount to withdraw");
                        TakenAmount = scan.nextInt();
                        if(TakenAmount>balance){
                        System.out.println("Insufficient Bakance");
                        System.out.println("Try lessthan current you balance amount");
                        }
                        else{
                            System.out.println("Sucessfully withdraw");
                            balance = balance - TakenAmount;


                        }
                        break;
                    case 4:
                    System.out.println("Welcome to our ATM");    
                    System.out.println("Available balance is"+balance);
                    System.out.println("Amount deposited is "+TakenAmount);
                    System.out.println("Amount deposited is "+AddAmount);
                    System.out.println("Thank you");
                     break;
                     
                

                   
                }
                if(opt == 5){
                    System.out.println("Thank You");
                    break;
                }

            }
        }
        else{
            System.out.println("Wrong Pin number");
            System.out.println("Plese Enter the valid Pin Number");
        }

    }
}
