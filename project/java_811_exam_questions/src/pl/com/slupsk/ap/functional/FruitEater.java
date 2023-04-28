package pl.com.slupsk.ap.functional;

@FunctionalInterface
public interface FruitEater<T> {

    void consume(T t);
}
