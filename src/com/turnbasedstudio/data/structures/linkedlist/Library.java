package com.turnbasedstudio.data.structures.linkedlist;


import java.util.Map;

public class Library {

    private Map<String,Album> albums;

    public Library(Map<String, Album> albums) {
        this.albums = albums;
    }

    public Map<String, Album> getAlbums() {
        return albums;
    }

    public void setAlbums(Map<String, Album> albums) {
        this.albums = albums;
    }

    public Album getAlbumByName(String albumName) throws RuntimeException{

        if(albums.containsKey(albumName)){
            return albums.get(albumName);
        }

        throw new RuntimeException("Album not in library");
    }
}
