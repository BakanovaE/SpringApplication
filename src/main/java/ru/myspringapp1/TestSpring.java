package ru.myspringapp1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");

        Music music = context.getBean("rockMusic", Music.class);
        MusicPlayer musicPlayer = new MusicPlayer(music);
        musicPlayer.playMusic();

        Music music2 = context.getBean("classicalMusic", Music.class);
        MusicPlayer musicPlayer1 = new MusicPlayer(music2);
        musicPlayer1.playMusic();

        context.close();
    }
}
