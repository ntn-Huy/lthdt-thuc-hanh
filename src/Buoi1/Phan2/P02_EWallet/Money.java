package Buoi1.Phan2.P02_EWallet;

public final class Money {
    private final long amount;

    public Money(long amount) {
        if (amount < 0) throw new IllegalArgumentException("So tien khong duoc am");
        this.amount = amount;
    }

    public Money plus(Money other) { return new Money(this.amount + other.amount); }
    public Money minus(Money other) { return new Money(this.amount - other.amount); }
    public long getAmount() { return amount; }

    @Override
    public String toString() { return String.format("%,d VND", amount); }
}
