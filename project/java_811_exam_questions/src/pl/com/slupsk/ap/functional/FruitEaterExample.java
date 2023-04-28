package pl.com.slupsk.ap.functional;

class FruitEaterExample {

    public static void main(String[] args) {
        // 1. Wykorzystanie istniejącej klasy
//        StringFruitEater stringFruitEater = new StringFruitEater();
//        process(stringFruitEater, "Sample value");

        // 2. Wykorzystanie klasy anonimowej (bez nazwy)
//        FruitEater<String> stringFruitEater = new FruitEater<>() {
//            @Override
//            public void consume(String s) {
//                System.out.println("Consumed element: " + s
//                        + " in class anonymous...");
//            }
//        };
//        process(stringFruitEater, "Sample value");

        // 3. Wyrażenie lambda
        process((String s) -> System.out.println("Consumed element: " + s + "in lambda"),
                "Sample value");
        // Zapis równoważny
        process(s -> System.out.println("Consumed element: " + s + "in lambda"),
                "Sample value");
    }

    static <T> void process(FruitEater<T> fruitEater, T consumedObject) {
        fruitEater.consume(consumedObject);
    }
}
