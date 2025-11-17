package practice;

public class TestFinal {
    public static void main(String[] args) {

        // contoh final variable seperti pada modul
        final int x = 10;
        System.out.println(x);

        Parent p = new Parent();
        p.method1();
        p.method2();

        Child c = new Child();
        c.method2();

        FinalClass fc = new FinalClass();
        fc.display();
    }
}
