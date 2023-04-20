public class Account {
    private Double balance;
    private int accountNumber;

    public Account(Double balance, int accountNumber) {
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public static void replenishmentBalance(Account account, double depositAmount) {
            double  thisBalance = account.getBalance() + depositAmount;
            account.setBalance(thisBalance);
            System.out.println( "Счет " + account.getAccountNumber() + " пополнен на сумму : " + depositAmount
            +"\nВаш баланс :"+account.getBalance());
    }

    public static void withdrawalFromAccount(Account account, double withdrawalAmount) {
            if (account.getBalance() > withdrawalAmount) {
                double thisBalance = account.getBalance() - withdrawalAmount;
                account.setBalance(thisBalance);
                System.out.println( "Со счета " +account.getAccountNumber() + " снята сумма : " + withdrawalAmount
                +"\nВаш баланс : "+ account.getBalance());
            }else {
                System.out.println("Не достаточно средств !!");
            }
    }
}
