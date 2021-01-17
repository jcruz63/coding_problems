package com.turnbasedstudio.data.structures.linkedlist;

import java.time.Duration;

public class LinkedListChallenge {

    public static void main(String[] args) {
        Playable song = new Song("Inner Sandman", Duration.ofSeconds(300));
        Playable song2 = new Song("Out", Duration.ofSeconds(200));
        Album album = new SongAlbum("My Album");
        album.addSong(song);
        album.addSong(song2);
        Library library = new SongLibrary();
        library.addAlbum(album);
        Playlist playlist = new Playlist(library);
        playlist.addToQueue("Inner Sandman");
        playlist.play();

    }
}
