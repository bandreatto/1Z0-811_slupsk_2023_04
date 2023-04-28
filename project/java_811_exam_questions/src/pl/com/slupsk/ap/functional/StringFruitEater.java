package pl.com.slupsk.ap.functional;

class StringFruitEater implements FruitEater<String> {

    @Override
    public void consume(String s) {
        System.out.println("Consumed element: " + s
                + " in class StringFruitEater...");
    }
}
