package exemplu;

public class MySingleton2 {
    private static MySingleton2 singleton;

    private MySingleton2() {}

    public static MySingleton2 getInstance() {
        if (singleton == null) {
            synchronized (MySingleton2.class) {
                if (singleton == null) {
                    singleton = new MySingleton2();
                }
            }
        }

        return singleton;
    }
}
