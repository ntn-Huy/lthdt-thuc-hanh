package Buoi1.Phan2.P04_CartInvoice;

import java.util.ArrayList;
import java.util.List;

record InvoiceLine(String productCode, String productName, long unitPrice, int quantity) {
    public long getTotal() { return unitPrice * quantity; }
}

public class Main {
    public static void main(String[] args) {
        List<InvoiceLine> lines = new ArrayList<>();
        lines.add(new InvoiceLine("P01", "Chuot khong dau", 150000, 2));
        lines.add(new InvoiceLine("P02", "Ban phim co", 800000, 1));

        long subtotal = 0;
        for (InvoiceLine line : lines) {
            subtotal += line.getTotal();
        }
        long vat = Math.round(subtotal * 0.08);

        System.out.println("Tam tinh: " + subtotal + " VND");
        System.out.println("Thue VAT (8%): " + vat + " VND");
        System.out.println("Tong thanh toan: " + (subtotal + vat) + " VND");
    }
}
