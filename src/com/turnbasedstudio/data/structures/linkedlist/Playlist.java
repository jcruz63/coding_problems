package com.turnbasedstudio.data.structures.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class Playlist implements Menu{

    private Playlist playlist;
    private LinkedList<Song> songs;
    private Song currentSong;

    private Playlist(){
        playlist = new Playlist();
        songs = new LinkedList<>();
    }

    public Playlist getPlaylist() {
        return playlist;
    }




    @Override
    public void quit() {

    }

    @Override
    public void next() {

    }

    @Override
    public void previous() {

    }

    @Override
    public void replay() {

    }
}
