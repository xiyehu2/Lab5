import java.util.Random;

/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 8.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/8/">Lab 8 Description</a>
 */
public class BankAccount {

    /*
     * You may want to use this to distinguish between different kinds of accounts.
     */

    /***
     *
     */
    public enum BankAccountType {
        /**
         *
         */
        CHECKINGS,
        /**
         *
         */
        SAVINGS,
        /**
         *
         */
        STUDENT,
        /**
         *
         */
        WORKPLACE
    }

    /**
     * accountNumber.
     */
    private static int accountNumber;
    /**
     * comment.
     */
    private BankAccountType accountType;
    /**
     * comment.
     */
    private double accountBalance;
    /**
     * comment.
     */
    private String ownerName;
    /**
     * comment.
     */
    private double interestRate;
    /**
     * comment.
     */
    private double interestEarned;

    /***
     * comment.
     * @param name name of the account holder.
     * @param accountCategory type of the account.
     */
    public BankAccount(final String name, final BankAccountType accountCategory) {
        this.ownerName = name;
        this.accountType = accountCategory;
        accountNumber++;
    }

    /*
     * Implement getters and setters as appropriate for private variables.
     */

    /***
     * set account balance.
     * @param setBalance set the balance of the account.
     */
    public void setAccountBalance(final double setBalance) {
        this.accountBalance = setBalance;
    }
    /***
     * getter account balance.
     * @return return the balance of the account.
     */
    public double getAccountBalance() {
        return this.accountBalance;
    }

    /***
     * deposit money into the account.
     * @param depositAmmount amount deposit
     */
    public void deposit(final double depositAmmount) {
        this.accountBalance += depositAmmount;
    }

    /***
     * withdraw money from the account.
     * @param withdrawAmmount withdraw ammount
     */
    public void withdraw(final double withdrawAmmount) {
        this.accountBalance -= withdrawAmmount;
    }
    /***
     * set account type.
     * @param accountCategory the type of the account
     */
    public void setAccountType(final BankAccountType accountCategory) {
        this.accountType = accountCategory;
    }

    /***
     * get account type.
     * @return return the type of the account
     */
    public BankAccountType getAccountType() {
        return accountType;
    }

    /***
     * set the account number.
     * @param setAccountNumber account number
     */
    public void setAccountNumber(final int setAccountNumber) {
        this.accountNumber = setAccountNumber;
    }
    /***
     * get the account Number.
     * @return return the account number
     */
    public int getAccountNumber() {
        return this.accountNumber;
    }

    /***
     * set the name of the owner.
     * @param setName name of the owner
     */
    public void setOwnerName(final String setName) {
        this.ownerName = setName;
    }

    /***
     * get the name of the owner.
     * @return return the name of the owner.
     */
    public String getOwnerName() {
        return this.ownerName;
    }

    /***
     * set the interest rate.
     * @param setInterestRate the interest rate of the bank account.
     */
    public void setInterestRate(final double setInterestRate) {
        this.interestRate = setInterestRate;
    }

    /***
     * get the interest rate.
     * @return return the interest rate
     */
    public double getInterestRate() {
        return this.interestRate;
    }

    /***
     * set the interest earned for this bank account.
     * @param setInterestEarned the interest earned.
     */
    public void setInterestEarned(final double setInterestEarned) {
        this.interestEarned = interestEarned;
    }

    /***
     * get the interest earned.
     * @return return the interest earned.
     */
    public double getInterestEarned() {
        return this.interestEarned;
    }

    /***
     * get the amount of accounts.
     * @return return the amount of accounts.
     */
    public static int getTotalAccountNumber() {
        return accountNumber;
    }
}