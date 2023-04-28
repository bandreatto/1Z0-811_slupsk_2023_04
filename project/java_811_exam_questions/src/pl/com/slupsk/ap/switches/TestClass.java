package pl.com.slupsk.ap.switches;

public class TestClass {

    public static int switchTest(int k) {
        int j = 1;
//        final int firstCase = (int) Math.random();
        final int firstCase = 1;
        switch (k) {
            case firstCase: {
                j++;
                System.out.println("In 1");
            }
            case 2: {
                j++;
                System.out.println("In 2");
            }
            case 3: {
                j++;
                System.out.println("In 3");
            }
            case 4: {
                j++;
                System.out.println("In 4");
                break;
            }
            case 5: {
                j++;
                System.out.println("In 5");
            }
            default: {
                j++;
                System.out.println("In default");
            }
        }
        return j + k;
    }

    public static void main(String[] args) {
//        System.out.println(switchTest(4));
//        System.out.println(args[args.length]);
    }
}
