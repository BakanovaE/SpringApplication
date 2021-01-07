package ru.myspringapp1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");

        // Music music = context.getBean("musicBean", Music.class);

        //MusicPlayer musicPlayer = new MusicPlayer(music);

        //MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        //MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        //boolean comp = firstMusicPlayer==secondMusicPlayer;

        //System.out.println(comp);
        //System.out.println(firstMusicPlayer);
        //System.out.println(secondMusicPlayer);

        //firstMusicPlayer.setVolume(10);
        //System.out.println(firstMusicPlayer.getVolume());
        //System.out.println(secondMusicPlayer.getVolume());

        ClassicalMusic classicalMusic = context.getBean("musicBean", ClassicalMusic.class);
        System.out.println(classicalMusic.getSong());


        context.close();
    }
}
