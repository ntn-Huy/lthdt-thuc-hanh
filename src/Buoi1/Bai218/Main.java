package Bai218;

public class Main {
    public static void main(String[] args) {
        System.out.println("main bat dau");
        System.out.println(ValidationUtils.isValidEmail("an.nv@st.example.edu.vn"));
        System.out.println(ValidationUtils.isValidPhoneVN("0912345678"));

        System.out.println(AppConfig.get("app.name"));
        System.out.println(AppConfig.getInt("app.maxStudents", 30));
    }
}
