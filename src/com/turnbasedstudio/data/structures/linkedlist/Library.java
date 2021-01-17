package com.turnbasedstudio.data.structures.linkedlist;

public interface Library {

    void addAlbum(Album album);
    Album getAlbum(String title);
    int getNumOfAlbums();
    void removeAlbum(String title);



}
