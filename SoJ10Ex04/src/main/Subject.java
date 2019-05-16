package main;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    private List<MyListener> list = new ArrayList<>();

    public void addMyListener(MyListener listener) {
        list.add(listener);
    }

    public void event() {
        list.forEach(MyListener::somethingHappened);
    }
}
