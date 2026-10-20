package Bai207;

public class Main {
    public static void main(String[] args) {
        BankAccount an = new BankAccount("0011", "An");
        BankAccount binh = new BankAccount("0022", "Binh");

        an.deposit(1000000);
        System.out.println("Rut 2 trieu: " + an.withdraw(2000000));
        System.out.println("Chuyen 300k: " + an.transferTo(binh, 300000));
        System.out.println("So du An: " + an.getBalance() + " | Binh: " + binh.getBalance());

        System.out.println("Lich su: " + String.join("; ", an.getHistory()));
    }
}
