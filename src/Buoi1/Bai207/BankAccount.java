package Bai207;

import java.util.Arrays;

public class BankAccount {
    private static final int MAX_HISTORY = 100;
    private final String accountNumber;
    private final String ownerName;
    private long balance;
    private final String[] history = new String[MAX_HISTORY];
    private int historyCount = 0;

    public BankAccount(String accountNumber, String ownerName) {
        if (accountNumber == null || accountNumber.isBlank()) {
            throw new IllegalArgumentException("So tai khoan khong hop le");
        }
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = 0;
    }

    public void deposit(long amount) {
        if (amount <= 0) throw new IllegalArgumentException("So tien nap phai > 0");
        balance += amount;
        log("NAP +" + amount);
    }

    public boolean withdraw(long amount) {
        if (amount <= 0 || amount > balance) {
            log("RUT THAT BAI " + amount);
            return false;
        }
        balance -= amount;
        log("RUT -" + amount);
        return true;
    }

    public boolean transferTo(BankAccount target, long amount) {
        if (target == null || target == this) {
            throw new IllegalArgumentException("Tai khoan nhan khong hop le");
        }
        if (!withdraw(amount)) return false;
        target.deposit(amount);
        log("CHUYEN -> " + target.accountNumber + " " + amount);
        return true;
    }

    private void log(String entry) {
        if (historyCount < MAX_HISTORY) {
            history[historyCount++] = entry;
        }
    }

    public long getBalance() { return balance; }
    public String[] getHistory() { return Arrays.copyOf(history, historyCount); }
}
