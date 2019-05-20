package udemy;

public class BankAccount {

    public static void main(String[] args) {
        BankAccount account = new BankAccount(123456, 100, "Shilpa", "shilpa@bosetechnologies.co.uk", "7720089955");
      //  account.setBalance(100);
        account.deposit(200);
        account.withdraw(100);
        account.deposit(500);
        account.withdraw(1000);
    }
    public BankAccount( int number, int balance, String name,String email, String phoneNumber){
        this.number = number;
        this.customerEmailAddress = email;
        this.customerName = name;
        this.balance = balance;
        this.customerPhoneNumber = phoneNumber;
        System.out.println("Account constructor with Parameters called");
    }
    private int number;
    private double balance;
    private String customerName;
    private String customerEmailAddress;
    private String customerPhoneNumber;

    public void setNumber(int number) {
        this.number = number;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public void deposit(double depositAmount){
        System.out.println("Balance before deposit = "+this.balance);
       this.balance +=depositAmount;
        System.out.println("Balance after deposit = "+this.balance);
    }

    public void withdraw(double withdrawalAmount){
        System.out.println("Withdrawal requested for = "+withdrawalAmount);
        System.out.println("Current Balance = "+this.balance);
        if(this.balance-withdrawalAmount<0){
            System.out.println("Only "+this.balance+" available. Withdrawal not processed");
        }else{
            this.balance -= withdrawalAmount;
            System.out.println("Withdrawal of "+withdrawalAmount+" is processed. Remaining balance = "+this.balance);

        }
    }
}
