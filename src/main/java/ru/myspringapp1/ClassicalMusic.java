package ru.myspringapp1;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music {
    public List<ClassicalMusic> listOfClassicalMusic = new ArrayList<>();
    public String songName;

    @PostConstruct
    public void doMyInit() {
        System.out.println("Initialisation method");
    }
    @PreDestroy
    public void doMyDestroy() {
        System.out.println("Destroy method");
    }

    public ClassicalMusic(String songName) {
        this.songName = songName;
    }

    public ClassicalMusic() {}

    public List<ClassicalMusic> addSongs(List<ClassicalMusic> listOfClassicalMusic) {
        ClassicalMusic hungarianRhapsody = new ClassicalMusic("Hungarian Rhapsody");
        ClassicalMusic symphony = new ClassicalMusic("Symphony");
        ClassicalMusic opera = new ClassicalMusic("Opera");
        listOfClassicalMusic.add(hungarianRhapsody);
        listOfClassicalMusic.add(symphony);
        listOfClassicalMusic.add(opera);
        return listOfClassicalMusic;
    }

    @Override
    public String getSong(int x) {
        return addSongs(listOfClassicalMusic).get(x).toString();
    }

    @Override
    public String toString() {
        return "Classical Song" + songName;
    }
}
