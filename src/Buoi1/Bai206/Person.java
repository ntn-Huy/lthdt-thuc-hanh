package Bai206;

public class Person {
    private String secret = "private";
    String packageInfo = "default";
    protected String familyInfo = "protected";
    public String publicInfo = "public";

    public void selfTest() {
        System.out.println(secret + " " + packageInfo + " " + familyInfo + " " + publicInfo);
    }
}
