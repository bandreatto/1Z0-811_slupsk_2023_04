package pl.com.slupsk.ap.threads;

class ThreadsExample {

    public static void main(String[] args) {
        new HelloWorldThread().run();
        System.out.println("In main: " + Thread.currentThread().getId());
    }
}
