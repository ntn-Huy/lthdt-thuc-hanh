package Bai119;
public class ScopeDemo {
    static int objectCount = 0; // biến class (static)
    String name = "default"; // biến instance
    ScopeDemo() {
    objectCount++;
    }
    void setNameBuggy(String name) {
    name = name; // gán tham số cho chính nó!
    }
    void setNameFixed(String name) {
    this.name = name; // this.name là field
    }
    public static void main(String[] args) {
    ScopeDemo a = new ScopeDemo();
    ScopeDemo b = new ScopeDemo();
    a.setNameBuggy("A");
    b.setNameFixed("B");
    System.out.println(a.name + " " + b.name);
    System.out.println(ScopeDemo.objectCount);
    for (int i = 0; i < 3; i++) {
    int square = i * i;
    }
    // System.out.println(i); // LỖI: i hết phạm vi
    // System.out.println(square); // LỖI: square hết phạm vi
    {
    int temp = 10;
    System.out.println(temp);
    }
    }
    }