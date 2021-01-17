package com.turnbasedstudio.data.structures.linkedlist;


import java.util.HashMap;
import java.util.Map;


public class SongAlbum implements Album {
    private String title;
    private Map<String, Playable> songs;

    public SongAlbum(String title) {
        this.title=title;
        this.songs = new HashMap<>();
    }

    public Map<String,Playable> getSongs() {
        return songs;
    }

    public void setSongs(Map<String, Playable> songs) {
        this.songs = songs;
    }

    @Override
    public void addSong(Playable playable) {
        songs.put(playable.getTitle(), playable);
    }

    @Override
    public Playable getSong(String title){

        if(songs.containsKey(title)) {
            return songs.get(title);
        }
        throw new RuntimeException("Song not in Album");
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void setTitle(String title) {
        this.title=title;
    }

    @Override
    public int getNumOfSongs() {
        return songs.size();
    }




}
