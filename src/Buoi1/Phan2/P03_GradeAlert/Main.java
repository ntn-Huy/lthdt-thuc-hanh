package Phan2.P03_GradeAlert;

record CourseResult(String studentId, String courseCode, int credits, double qt, double gk, double ck) {
    public CourseResult {
        if (qt < 0 || qt > 10 || gk < 0 || gk > 10 || ck < 0 || ck > 10) {
            throw new IllegalArgumentException("Diem phai trong khoang [0, 10]");
        }
    }

    public double calculateFinalScore() {
        return Math.round((qt * 0.3 + gk * 0.2 + ck * 0.5) * 10.0) / 10.0;
    }

    public double getGpa4() {
        double score = calculateFinalScore();
        if (score >= 8.5) return 4.0;
        if (score >= 7.0) return 3.0;
        if (score >= 5.5) return 2.0;
        if (score >= 4.0) return 1.0;
        return 0.0;
    }
}

public class Main {
    public static void main(String[] args) {
        CourseResult r1 = new CourseResult("23001", "OOP101", 3, 8.0, 7.0, 6.6);
        System.out.println("Diem tong kết: " + r1.calculateFinalScore() + " | He 4: " + r1.getGpa4());
    }
}
