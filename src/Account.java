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

    public  void replenishmentBalance(double depositAmount) {
            double  thisBalance = this.balance + depositAmount;
           this.balance = thisBalance;
        System.out.printf("Счет %d пополнен на сумму: %.2f\nВаш баланс: %.2f\n",this.accountNumber,depositAmount,this.balance);
        System.out.println("__________________________________________");
    }

    public void withdrawalFromAccount(double withdrawalAmount) {
            if (this.balance > withdrawalAmount) {
                double thisBalance = this.balance - withdrawalAmount;
               this.balance = thisBalance;
                System.out.printf("Со счета %d снята сумма: %.2f\nВаш баланс: %.2f\n",this.accountNumber,withdrawalAmount,this.balance);
                System.out.println("__________________________________________");
            }else {
                System.out.println("Не достаточно средств !!");
                System.out.println("__________________________________________");
            }
    }
}
