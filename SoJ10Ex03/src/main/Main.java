package main;

        import java.nio.file.Path;
        import java.nio.file.Paths;
        import java.util.List;
        import java.util.Locale;

public class Main {

    public static void main (String args[]) {
        Person p = new Person();
        p.sayHello(name:"Bill");

        Runtime.getRuntime().availableProcessors();

        Locale loc = new Locale.Builder()
                .setLanguage("en")
                .setRegion("US")
                .build();

        List<Integer> list = List.of(1,2,3,4,5);
        Path path = Paths.get(first:"C:/A");
    }
}
