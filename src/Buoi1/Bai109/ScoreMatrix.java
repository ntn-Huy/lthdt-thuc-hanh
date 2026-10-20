package Bai109;
public class ScoreMatrix {
    public static void main(String[] args) {
    String[] names = {"An", "Bình", "Chi"};
    double[][] scores = {
    {8.0, 7.5, 9.0, 6.5},
    {5.5, 6.0, 7.0, 8.0},
    {9.5, 9.0, 8.5, 9.0}
    };
    int bestIndex = 0;
    double bestAvg = -1;
    for (int r = 0; r < scores.length; r++) {
    double sum = 0;
    System.out.printf("%-6s", names[r]);
    for (int c = 0; c < scores[r].length; c++) {
    System.out.printf("%6.1f", scores[r][c]);
    sum += scores[r][c];
    }
    double avg = sum / scores[r].length;
    System.out.printf(" | TB = %.2f%n", avg);
    if (avg > bestAvg) { bestAvg = avg; bestIndex = r; }
    }
    System.out.print("TB môn");
    for (int c = 0; c < scores[0].length; c++) {
    double sum = 0;
    for (int r = 0; r < scores.length; r++) sum += scores[r][c];
    System.out.printf("%6.2f", sum / scores.length);
    }
    System.out.println();
    System.out.println("Cao nhất: " + names[bestIndex] + " (" + bestAvg + ")");
    // Mảng răng cưa: mỗi hàng có độ dài khác nhau
    int[][] jagged = new int[3][];
    for (int i = 0; i < jagged.length; i++) {
    jagged[i] = new int[i + 2];
    }
    for (int[] row : jagged) System.out.println("Số môn: " + row.length);
    }
    }