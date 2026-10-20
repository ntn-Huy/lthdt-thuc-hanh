package Phan2.P05_Cinema;

record SeatCode(char row, int col) {
    public SeatCode {
        row = Character.toUpperCase(row);
        if (row < 'A' || row > 'H' || col < 1 || col > 12) {
            throw new IllegalArgumentException("Ma ghe khong hop le: " + row + col);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        SeatCode seat = new SeatCode('c', 5);
        System.out.println("Ma ghe chuan hoa: " + seat.row() + seat.col());
    }
}
