class TestClass {

    public static int switchTest(int k) {
        int j = 1;
        switch (k) {
            case 1: {
                System.out.println("Inside 1");
                j++;
            }
            case 2: {
                System.out.println("Inside 2");
                j++;
            }
            case 3: {
                System.out.println("Inside 3");
                j++;
            }
            case 4: {
                System.out.println("Inside 4");
                j++;
                break;
            }
            case 5: {
                System.out.println("Inside 5");
                j++;
            }
            default: {
                System.out.println("Inside default");
                j++;
            }
        }

        return j + k;
    }

    public static void main(String[] args) {
        System.out.println(switchTest(4));
    }
}
