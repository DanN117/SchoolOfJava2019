package api;

import implementation.HelloEs;

public interface Hello {

    public String hello(String name);   // contract

    public static Hello build() {
        return new HelloEs();
    }




}
