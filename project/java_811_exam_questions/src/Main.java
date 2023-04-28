public class Main {
    //    public static void main(String[] args) {
    public static void main(String... args) {
//        boolean flag = true;
//        if (flag = false) {
//            System.out.println("1");
//        } else if (flag) {
//            System.out.println("2");
//        } else if (!flag) {
//            System.out.println("3");
//        } else {
//            System.out.println("4");
//        }

//        String[] strings = {"Bartosz", "Marcin", "Katarzyna"};
//        printContent(strings);
//        printContent("Bartosz", "Marcin", "Katarzyna");
    }

//        static void printContent(String[] parameters) {
    static void printContent(String last, String... parameters) {
        for (String parameter : parameters) {
            System.out.println("Param: " + parameter);
        }
    }
}