package Buoi1.Bai128;

import java.util.Scanner;

public class StudentListApp {
    static final int CAPACITY = 100;
    static final double PASS_SCORE = 5.0;

    static String[] ids = new String[CAPACITY];
    static String[] names = new String[CAPACITY];
    static double[] scores = new double[CAPACITY];
    static int count = 0;

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            printMenu();
            choice = readInt("Chon: ");
            switch (choice) {
                case 1 -> addStudent();
                case 2 -> displayAll();
                case 3 -> findById();
                case 4 -> sortByScoreDesc();
                case 5 -> showStatistics();
                case 0 -> System.out.println("Tam biet!");
                default -> System.out.println("Lua chon khong hop le");
            }
        } while (choice != 0);
    }

    static void printMenu() {
        System.out.println("\n===== QUAN LY SINH VIEN =====");
        System.out.println("1. Them 2. Hien thi 3. Tim 4. Sap xep 5. Thong ke 0. Thoat");
    }

    static int readInt(String prompt) {
        System.out.print(prompt);
        while (true) {
            String line = sc.nextLine().trim();
            try {
                return Integer.parseInt(line);
            } catch (NumberFormatException e) {
                System.out.print("Nhap so nguyen: ");
            }
        }
    }

    static int indexOf(String id) {
        for (int i = 0; i < count; i++) {
            if (ids[i].equalsIgnoreCase(id)) return i;
        }
        return -1;
    }

    static void addStudent() {
        if (count == CAPACITY) {
            System.out.println("Danh sach da day!");
            return;
        }

        System.out.print("Ma SV: ");
        String id = sc.nextLine().trim();
        if (id.isEmpty() || indexOf(id) >= 0) {
            System.out.println("Ma rong hoac da ton tai!");
            return;
        }

        System.out.print("Ho ten: ");
        String name = sc.nextLine().trim();

        System.out.print("Diem: ");
        double score;
        try {
            score = Double.parseDouble(sc.nextLine().trim());
        } catch (NumberFormatException e) {
            System.out.println("Diem khong phai so!");
            return;
        }

        if (score < 0 || score > 10) {
            System.out.println("Diem phai trong [0, 10]!");
            return;
        }

        ids[count] = id;
        names[count] = name;
        scores[count] = score;
        count++;
        System.out.println("Da them.");
    }

    static void displayAll() {
        if (count == 0) {
            System.out.println("(Danh sach trong)");
            return;
        }
        System.out.printf("%-4s %-10s %-25s %6s%n", "STT", "Ma", "Ho ten", "Diem");
        for (int i = 0; i < count; i++) {
            System.out.printf("%-4d %-10s %-25s %6.2f%n", i + 1, ids[i], names[i], scores[i]);
        }
    }

    static void findById() {
        System.out.print("Ma can tim: ");
        int idx = indexOf(sc.nextLine().trim());
        if (idx < 0) System.out.println("Khong tim thay");
        else System.out.println(names[idx] + " " + scores[idx]);
    }

    static void sortByScoreDesc() {
        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - 1 - i; j++) {
                if (scores[j] < scores[j + 1]) {
                    swap(j, j + 1);
                }
            }
        }
        System.out.println("Da sap xep.");
        displayAll();
    }

    static void swap(int a, int b) {
        String tmpId = ids[a]; ids[a] = ids[b]; ids[b] = tmpId;
        String tmpName = names[a]; names[a] = names[b]; names[b] = tmpName;
        double tmpScore = scores[a]; scores[a] = scores[b]; scores[b] = tmpScore;
    }

    static void showStatistics() {
        if (count == 0) {
            System.out.println("(Chua co du lieu)");
            return;
        }
        double sum = 0;
        int passed = 0;
        for (int i = 0; i < count; i++) {
            sum += scores[i];
            if (scores[i] >= PASS_SCORE) passed++;
        }
        System.out.printf("Diem TB: %.2f | Dat: %d/%d%n", sum / count, passed, count);
    }
}
