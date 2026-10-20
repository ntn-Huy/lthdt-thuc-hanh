package Bai1C;

public class Q9 {
    public static void main(String[] args) {
        final int[] scores = {7, 8};
        scores[0] = 10;
        // scores = new int[]{1, 2}; // LOI BIEN DICH

        final StringBuilder sb = new StringBuilder("a");
        sb.append("b");
        
        System.out.println(scores[0] + " | " + sb);
    }
}
