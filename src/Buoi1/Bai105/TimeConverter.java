package Bai105;
public class TimeConverter {
    static final int SECONDS_PER_MINUTE = 60;
    static final int SECONDS_PER_HOUR = 3600;
    static final int SECONDS_PER_DAY = 86400;
    public static void main(String[] args) {
    int total = 93725;
    int days = total / SECONDS_PER_DAY;
    int rest = total % SECONDS_PER_DAY;
    int hours = rest / SECONDS_PER_HOUR;
    rest %= SECONDS_PER_HOUR;
    int minutes = rest / SECONDS_PER_MINUTE;
    int seconds = rest % SECONDS_PER_MINUTE;
    if (days > 0) {
    System.out.printf("%d ngày ", days);
    }
    System.out.printf("%02d:%02d:%02d%n", hours, minutes, seconds);
    }
}