package pl.com.slupsk.ap.randoms;

import java.util.Random;

class RandomExamples {

    public static void main(String[] args) {
        double d = .5;

        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            int randomInt = random.nextInt(10);
            System.out.println(randomInt);
        }
    }
}
