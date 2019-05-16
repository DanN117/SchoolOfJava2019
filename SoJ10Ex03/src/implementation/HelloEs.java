package implementation;

import api.Hello;

public class HelloEs implements Hello {

    @Override
    public String hello(String name) {
        return "Hola, " + name + "!";
    }
}
