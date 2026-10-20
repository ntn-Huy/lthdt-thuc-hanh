package Bai1C;

import java.util.Arrays;

public class Q12 {
    static class Box {
        int value;
        Box(int value) { this.value = value; }
        public String toString() { return "Box(" + value + ")"; }
    }

    public static void main(String[] args) {
        Box[] original = {new Box(1), new Box(2)};
        Box[] copy = Arrays.copyOf(original, original.length);

        copy[0].value = 99;
        copy[1] = new Box(50);

        System.out.println(Arrays.toString(original));
        System.out.println(original == copy);
    }
}
