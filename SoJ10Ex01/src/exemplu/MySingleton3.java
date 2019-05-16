package exemplu;

public class MySingleton3 {
    private MySingleton3() {}

    private static class SingletonHolder {
        private static final MySingleton3 singleton = new MySingleton3();
    }

    public static MySingleton3 getInstance() {
        return SingletonHolder.singleton;
    }
}
