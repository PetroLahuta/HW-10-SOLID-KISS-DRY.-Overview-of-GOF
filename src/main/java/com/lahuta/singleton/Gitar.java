package main.java.com.lahuta.singleton;

public class Gitar {
    private static Gitar instance;
    public static String name;

    private Gitar(String name) {
        this.name = name;
    }

    public static Gitar getInstance(String name){
        if (instance == null) {
            instance = new Gitar(name);
        }
        return instance;
    }
}