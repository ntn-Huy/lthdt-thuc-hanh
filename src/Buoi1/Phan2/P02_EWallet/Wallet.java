package Buoi1.Phan2.P02_EWallet;

public class Wallet {
    private final String phone;
    private Money balance;
    private int failedPinAttempts = 0;
    private boolean locked = false;

    public Wallet(String phone) {
        if (phone == null || !phone.matches("0\\d{9}")) {
            throw new IllegalArgumentException("So dien thoai khong hop le");
        }
        this.phone = phone;
        this.balance = new Money(0);
    }

    public void deposit(Money amount) {
        if (locked) throw new IllegalStateException("Vi dang bi khoa");
        this.balance = this.balance.plus(amount);
    }

    public boolean withdraw(Money amount) {
        if (locked || balance.getAmount() < amount.getAmount()) return false;
        this.balance = this.balance.minus(amount);
        return true;
    }

    public Money getBalance() { return balance; }
}
