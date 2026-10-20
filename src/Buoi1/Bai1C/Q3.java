package Bai1C;

public class Q3 {
    public static void main(String[] args) {
        int level = 2;
        int bonus = 0;
        switch (level) {
            case 1: bonus += 100;
            case 2: bonus += 200;
            case 3: bonus += 300;
            break;
            default: bonus += 1000;
        }
        System.out.println(bonus);
    }
}
