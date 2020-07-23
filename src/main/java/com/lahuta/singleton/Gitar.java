package main.java.com.lahuta.singleton;

public class Gitar {
    private static Gitar instance;
    private static String name;

    public static String getName() {
        return name;
    }

    private Gitar(String name) {
        this.name = name;
    }

    public static Gitar getInstance(String name) {
        if (instance == null) {
            instance = new Gitar(name);
        }
        return instance;
    }
}