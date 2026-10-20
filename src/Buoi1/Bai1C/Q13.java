package Bai1C;

import java.util.ArrayList;
import java.util.List;

public class Q13 {
    record Team(String name, List<String> members) {}

    public static void main(String[] args) {
        List<String> m = new ArrayList<>(List.of("An"));
        Team t1 = new Team("Alpha", m);
        Team t2 = new Team("Alpha", new ArrayList<>(List.of("An")));

        System.out.println(t1.equals(t2));

        m.add("Binh");
        System.out.println(t1.members().size() + " " + t1.equals(t2));
    }
}
