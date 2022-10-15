import java.util.*;

public class AtmOperationImpl implements AtmOperationInterf{
    ATM atm = new ATM();
    HashMap<Double,String> ministmt=new HashMap<>();
    @Override
    public void viewBalance() {
        System.out.println("Available Balance is : "+ atm.getBalance());

    }

    @Override
    public void withdrawAmount(double withdrawAmount) {
        if(withdrawAmount % 500 == 0) {
            if (withdrawAmount <= atm.getBalance()) {
                ministmt.put(withdrawAmount, " Amount Withdrawn");
                System.out.println("Collect your Cash " + withdrawAmount);
                atm.setBalance(atm.getBalance() - withdrawAmount);
                viewBalance();
            } else {
                System.out.println("Insufficient Balance !!");
            }
        }
        else {
            System.out.println("Amount Should be Multiple of 500");
        }

    }

    @Override
    public void depositeAmount(double depositeAmount) {
        ministmt.put(depositeAmount," Amount Deposited");
        System.out.println(depositeAmount +" Creadited Successfully !!");
        atm.setBalance(atm.getBalance()+depositeAmount);
        viewBalance();

    }

    @Override
    public void viewMiniStatement() {
        for(Map.Entry<Double,String> m:ministmt.entrySet()){
            System.out.println(m.getKey()+""+m.getValue());
        }

    }
}