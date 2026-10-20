package Bai1C;

import java.util.Arrays;

public class Q4 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        for (int v : arr) {
            v = v * 10;
        }
        System.out.println(Arrays.toString(arr));

        StringBuilder[] names = {new StringBuilder("an"), new StringBuilder("binh")};
        for (StringBuilder sb : names) {
            sb.append("!");
        }
        System.out.println(Arrays.toString(names));
    }
}
