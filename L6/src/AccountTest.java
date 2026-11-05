public class AccountTest {
    public static void main(String[] args) {
        Account account1 = new Account("1", "Florin Salam", 71297);
        Account account2 = new Account("2", "Costel Biju", 37168);

        System.out.println(account1.getBalance());
        System.out.println(account2.getBalance());

        account1.processDeposit(2000);
        account2.processCheck(1500);

        System.out.println(account1.getBalance());
        System.out.println(account2.getBalance());
    }
}
