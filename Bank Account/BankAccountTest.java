public class BankAccountTest {
    public static void main(String[] args){

        BankAccount user1 = new BankAccount(122, 56);

        user1.display();



        System.out.println(BankAccount.totalAccounts);

        user1.withdraw(500);
        user1.display();

        System.out.println(BankAccount.totalBankMoney);
    }
}