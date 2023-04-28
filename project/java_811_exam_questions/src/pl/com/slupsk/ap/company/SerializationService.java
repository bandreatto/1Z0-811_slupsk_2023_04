package pl.com.slupsk.ap.company;

class SerializationService {

    public static void main(String[] args) {
        JsonSerializationStrategy strategy1 = null;
        JsonSerializationStrategy strategy2 = JsonSerializationStrategy.CAMEL_CASE;

        assert strategy1 == null;

        System.out.println(strategy1 == strategy2);
        System.out.println(strategy1 != null && strategy1.equals(strategy2));
    }
}
