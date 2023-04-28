package questions.classes_constructors;

public class TestClass {

    static int someInt = 10;
    public static void changeIt(int a) {
        a = 20;
    }

    public static void main(String[] args) {
        changeIt(someInt);
        System.out.println(someInt);
    }
}
