package com.turnbasedstudio.data.structures.linkedlist;

public interface Album {


    void addSong(Playable playable);
    Playable getSong(String title);
    String getTitle();
    void setTitle(String title);
    int getNumOfSongs();


}
