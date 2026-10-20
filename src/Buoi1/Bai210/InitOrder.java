package Bai210;

public class InitOrder {
    static int counter = log("1. static field");
    int id = log("3. instance field");

    static { log("2. static block"); }
    { log("4. instance block"); }

    InitOrder() { log("5. constructor"); }

    static int log(String msg) {
        System.out.println(msg);
        return 0;
    }

    public static void main(String[] args) {
        System.out.println("--- main bat dau ---");
        new InitOrder();
        System.out.println("--- doi tuong thu hai ---");
        new InitOrder();
    }
}
