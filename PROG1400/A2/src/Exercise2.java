public class BankAccount {
    private String accountNumber;
    private String firstName;
    private String lastName;
    private String address;
    private double balance;

    public BankAccount() {
        this.accountNumber = "empty";
        this.firstName = "empty";
        this.lastName = "empty";
        this.address = "empty";
        this.balance = 2;
    }

    public BankAccount(String accountNumber, String firstName, String lastName, String address, double balance) {
        this.accountNumber = accountNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.balance = balance;
    }

    public BankAccount(String firstName, String lastName, String address) {
        this();
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    // Getters and Setters
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Deposit and Withdraw methods
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $")
        }
    }