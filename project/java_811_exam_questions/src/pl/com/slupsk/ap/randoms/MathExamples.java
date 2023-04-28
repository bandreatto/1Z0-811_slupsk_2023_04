package pl.com.slupsk.ap.randoms;

class MathExamples {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            double randomDoubleValue = 1 + Math.random() * 9;
            System.out.println(randomDoubleValue);
        }
    }
}
