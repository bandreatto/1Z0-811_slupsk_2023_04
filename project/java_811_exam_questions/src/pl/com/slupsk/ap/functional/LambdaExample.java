package pl.com.slupsk.ap.functional;

public class LambdaExample {

    public static void main(String[] args) {
//        Thread thread = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Implementacja interfejsu Runnable...");
//            }
//        });

        // wykorzystanie wyrażenia lambda
        Thread thread = new Thread(() -> {
            System.out.println("Implementacja interfejsu Runnable...");
        });

        thread.start();
    }
}
