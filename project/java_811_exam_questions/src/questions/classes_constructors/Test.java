package questions.classes_constructors;

class Test {

    int[] ia = new int[1];
    Object[] oa = new Object[1];
    boolean bool;

    public static void main(String[] args) {
        Test test = new Test();
        System.out.println(test.ia[0] + " " + test.oa[0]
                + " " + test.bool);
    }
}

