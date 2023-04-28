package pl.com.slupsk.ap.threads;

class HelloWorldThread extends Thread {

    @Override
    public void run() {
        System.out.println("Hello world from another Thread!");
        System.out.println("In run method: " + Thread.currentThread().getId());
    }
}
