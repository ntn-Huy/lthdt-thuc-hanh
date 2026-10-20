package Bai1C;

public class Q8 {
    static class Ticket {
        static int sold = 0;
        int number;

        Ticket() {
            this.sold++;
            number = sold;
        }
    }

    public static void main(String[] args) {
        Ticket a = new Ticket();
        Ticket b = new Ticket();
        Ticket c = new Ticket();
        System.out.println(a.number + " " + b.number + " " + c.number + " " + Ticket.sold);
    }
}
