package ru.myspringapp1;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music {
    public List<RockMusic> listOfRockMusic = new ArrayList<>();
    private String songName;

    public RockMusic(String songName) {
        this.songName = songName;
    }

    public RockMusic() {}

    public List<RockMusic> addSongs(List<RockMusic> listOfRockMusic) {
        RockMusic theWall = new RockMusic("The Wall");
        RockMusic weAreTheChampions = new RockMusic("We Are The Champions");
        RockMusic duHast = new RockMusic("Du Hast");
        listOfRockMusic.add(theWall);
        listOfRockMusic.add(weAreTheChampions);
        listOfRockMusic.add(duHast);
        return listOfRockMusic;
    }

    @Override
    public String getSong(int x) {
        return addSongs(listOfRockMusic).get(x).toString();
    }

    @Override
    public String toString() {
        return "Rock song " + songName;
    }
}
