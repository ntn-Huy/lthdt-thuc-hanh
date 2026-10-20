package Buoi1.Phan2.P02_EWallet;

public class Main {
    public static void main(String[] args) {
        Wallet wallet = new Wallet("0912345678");
        wallet.deposit(new Money(1000000));
        System.out.println("So du ban dau: " + wallet.getBalance());

        boolean ok = wallet.withdraw(new Money(300000));
        System.out.println("Rut 300k: " + ok + " | So du con: " + wallet.getBalance());
    }
}
