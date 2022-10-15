
public class ATM {
    private double balance;
    private double depositeAmount;
    private double withdrawAmount;

    //default constructor
//    no parameter

    public ATM(){

    }

    //getter setter
    // use to access the private class

public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getDepositeAmount() {
        return depositeAmount;
    }

    public void setDepositAmount(double depositAmount) {
        this.depositeAmount = depositAmount;
    }

    public double getWithdrawAmount() {
        return withdrawAmount;
    }

    public void setWithdrawAmount(double withdrawAmount) {
        this.withdrawAmount = withdrawAmount;
    }
}