package main;

public class Main {

    public static void main(String args[]) {
        Subject s = new Subject();

        s.addMyListener(()-> System.out.println("BAU"));
        s.addMyListener(()-> System.out.println("BAU AGAIN"));
        s.addMyListener(()-> System.out.println("BAU AGAIN 2"));


        s.event();
    }
}
