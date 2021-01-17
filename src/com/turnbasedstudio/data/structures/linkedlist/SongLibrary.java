package com.turnbasedstudio.data.structures.linkedlist;


import java.util.HashMap;
import java.util.Map;

public class SongLibrary implements Library{

    private Map<String, Album> albums;

    public SongLibrary() {
        this.albums = new HashMap<>();
    }

    public Map<String, Album> getAlbums() {
        return albums;
    }

    public void setAlbums(Map<String, Album> albums) {
        this.albums = albums;
    }



    @Override
    public void addAlbum(Album album) {
        albums.put(album.getTitle(),album);
    }

    @Override
    public Album getAlbum(String title) {
        if(albums.containsKey(title)){
            return albums.get(title);
        }

        throw new RuntimeException("Album not in library");
    }

    @Override
    public int getNumOfAlbums() {
        return albums.size();
    }

    @Override
    public void removeAlbum(String title) {
        albums.remove(title);
    }


}
