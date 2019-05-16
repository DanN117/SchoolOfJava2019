package exemplu;

public class MySingleton1 {
    private static MySingleton1 singleton;

    private MySingleton1() {}

    public static MySingleton1 getInstance() {
        singleton = new MySingleton1();

        return singleton;
    }
}