public class BankAccount{

    private double checkingBalance;
    private double savingsBalance;

    public static int totalAccounts = 0;
    public static double totalBankMoney = 0;


    public BankAccount(double checkingBalance, double savingsBalance){
        this.checkingBalance = checkingBalance;
        this.savingsBalance = savingsBalance;
        totalAccounts++;
        totalBankMoney += (this.checkingBalance + this.savingsBalance);
    }








    public double getChecking(){
        return this.checkingBalance;
    }

    public void setchecking(double cash){
        this.checkingBalance += cash;
        totalBankMoney += cash;
    }


    public double getSavings(){
        return this.savingsBalance;
    }

    public void setSavings(double cash){
        this.savingsBalance += cash;
        totalBankMoney += cash;
    }


    public void display(){
        System.out.println("Checkings : $" + getChecking());
        System.out.println("Savings : $" + getSavings());
    }


    public void withdraw(double amount){
        if (this.checkingBalance > amount){
            System.out.println("Withdrew $" + amount);
            this.checkingBalance -= amount;
        }
        else {
            System.out.println("Insufficient funds");
        }
    }


}