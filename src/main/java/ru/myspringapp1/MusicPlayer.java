package ru.myspringapp1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class MusicPlayer {
    private Music music1;
    private Music music2;

    @Autowired
    public MusicPlayer(@Qualifier("rockMusic") Music music1,
                       @Qualifier("classicalMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    public String playMusic(TypeOfMusic typeOfMusic) {
       switch (typeOfMusic) {
           case ROCK:
               return music2.getSong((int) (Math.random()* 3));
           case CLASSICAL:
               return music1.getSong((int) (Math.random()* 3));
       }
       return null;
    }

}
