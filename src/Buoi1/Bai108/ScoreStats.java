package Bai108;
import java.util.Arrays;
public class ScoreStats {
static final double PASS_SCORE = 5.0;
public static void main(String[] args) {

double[] scores = {7.5, 8.0, 4.5, 9.25, 6.0, 3.5, 8.75};
double sum = 0, max = scores[0], min = scores[0];
int passed = 0;
for (double s : scores) {
sum += s;
if (s > max) max = s;
if (s < min) min = s;
if (s >= PASS_SCORE) passed++;
}
System.out.printf("TB = %.2f, Max = %.2f, Min = %.2f, Đạt = %d/%d%n",
sum / scores.length, max, min, passed, scores.length);
// Đảo ngược tại chỗ
for (int i = 0; i < scores.length / 2; i++) {
double tmp = scores[i];
scores[i] = scores[scores.length - 1 - i];
scores[scores.length - 1 - i] = tmp;
}
System.out.println("Đảo ngược: " + Arrays.toString(scores));
double[] sorted = Arrays.copyOf(scores, scores.length); // giữ mảng gốc
Arrays.sort(sorted);
System.out.println("Tăng dần : " + Arrays.toString(sorted));
}
}