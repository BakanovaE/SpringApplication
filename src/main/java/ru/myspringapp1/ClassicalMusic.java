package ru.myspringapp1;

public class ClassicalMusic implements Music {

    private ClassicalMusic() {}

    public static ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
    public void doMyInit() {
        System.out.println("Initialisation");
    }

    public void doMyDestroy() {
        System.out.println("Destraction");
    }
}
