package Bai111;
import java.util.Arrays;
public class PassByValue {
static void addOne(int x) {
x = x + 1;
}
static void addOneToAll(int[] arr) {
for (int i = 0; i < arr.length; i++) arr[i]++;
}
static void replace(int[] arr) {
arr = new int[]{0, 0, 0}; // chỉ đổi bản sao địa chỉ
arr[0] = 99;
}
public static void main(String[] args) {
int n = 5;
addOne(n);
System.out.println(n);
int[] data = {1, 2, 3};
addOneToAll(data);
System.out.println(Arrays.toString(data));
replace(data);
System.out.println(Arrays.toString(data));
}
}