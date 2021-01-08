package ru.myspringapp1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;



public class MusicPlayer {


    private String name;

    private int volume;

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    private Music music1;
    private Music music2;

    public MusicPlayer(@Qualifier("rockMusic") Music music1,
                       @Qualifier("classicalMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    public String playMusic(TypeOfMusic typeOfMusic) {
       switch (typeOfMusic) {
           case ROCK:
               return music1.getSong((int) (Math.random()* 3));
           case CLASSICAL:
               return music2.getSong((int) (Math.random()* 3));
       }
       return null;
    }

}
