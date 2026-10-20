package Buoi1.Phan2.P06_Parking;

import java.time.Duration;
import java.time.LocalDateTime;

public class FeeCalculator {
    public static long calculateCarFee(LocalDateTime in, LocalDateTime out) {
        long minutes = Duration.between(in, out).toMinutes();
        long hours = (minutes + 59) / 60;
        if (hours <= 2) return 25000;
        long fee = 25000 + (hours - 2) * 10000;
        return Math.min(fee, 200000); // Tran 200k/ngay
    }

    public static void main(String[] args) {
        LocalDateTime t1 = LocalDateTime.of(2026, 10, 20, 8, 0);
        LocalDateTime t2 = LocalDateTime.of(2026, 10, 20, 11, 30); // 3.5h -> 4h
        System.out.println("Phi giu xe o to: " + calculateCarFee(t1, t2) + " VND");
    }
}
