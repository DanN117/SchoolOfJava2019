package main;

import api.Hello;
import implementation.HelloEn;

public class Person {

    private Hello hello;

    public Person() {
        this.hello = Hello.build();
    }

    public void sayHello(String name) {
        String s = hello.hello(name);
        System.out.println(s);
    }

}
