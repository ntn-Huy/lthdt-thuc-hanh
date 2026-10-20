package Phan2.P10_Capstone;

record TimeSlot(int dayOfWeek, int startPeriod, int numPeriods) {
    public boolean overlaps(TimeSlot other) {
        if (this.dayOfWeek != other.dayOfWeek) return false;
        int end1 = this.startPeriod + this.numPeriods;
        int end2 = other.startPeriod + other.numPeriods;
        return this.startPeriod < end2 && other.startPeriod < end1;
    }
}

public class Main {
    public static void main(String[] args) {
        TimeSlot t1 = new TimeSlot(3, 1, 3); // Thu 3, tiet 1-3
        TimeSlot t2 = new TimeSlot(3, 3, 3); // Thu 3, tiet 3-5 (Trung tiet 3)
        TimeSlot t3 = new TimeSlot(3, 4, 3); // Thu 3, tiet 4-6 (Lien ke)

        System.out.println("t1 trung t2? " + t1.overlaps(t2)); // true
        System.out.println("t1 trung t3? " + t1.overlaps(t3)); // false
    }
}
