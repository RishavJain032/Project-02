import java.util.*;
public class Main {
    public static void main(String[] args) {
        AtmOperationInterf op=new AtmOperationImpl();
        int atmnumber = 11111;
        int atmpin = 0000;
        Scanner scn = new Scanner(System.in);
        System.out.println("Welcome to ATM Machine !");
        System.out.print("Enter Atm Number : ");
        int atmNumber = scn.nextInt();
        System.out.print("Enter Pin: ");
        int pin = scn.nextInt();
        if((atmnumber == atmNumber) && (atmpin == pin)){
            while(true){
                System.out.println("1.View Available Balance\n2.Withdraw Amount\n3.Deposite Amount\n4.View Ministatement\n5.Exit");
            // view balance
            // Withdrawn balance
            // Deposite balance
            // view avalable balance

                System.out.println("Enter Choice : ");
                int ch = scn.nextInt();
                if(ch == 1){
                    op.viewBalance();

                }
                else if(ch == 2){
                    System.out.println("Enter amount to withdraw ");
                    double withdrawAmount = scn.nextDouble();
                    op.withdrawAmount(withdrawAmount);

                }
                else if(ch == 3){
                    System.out.println("Enter Amount to Deposite :");
                    double depositAmount = scn.nextDouble();
                    // Suppose deposited 5000;
                    op.depositeAmount(depositAmount);


                }
                else if(ch == 4){
                    op.viewMiniStatement();

                }
                else if(ch==5){
                    System.out.println("Collect your Card\n Thank you visit us again!!");
                    System.exit(0);
                }
                else
                {
                    System.out.println("Please enter correct choice");
                }
            }
        }
        else{
            System.out.println("Incorrect Atm Number or pin");
            System.exit(0);
        }


    }
}