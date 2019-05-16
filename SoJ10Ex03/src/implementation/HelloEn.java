package implementation;

import api.Hello;

public class HelloEn implements Hello {

    @Override
    public String hello(String name) {
        return "Hi, " + name + "!";
    }
}
