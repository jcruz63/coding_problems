package com.turnbasedstudio.data.structures.linkedlist;

import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class SongAlbumTest {

    private final Playable song = new Song("Inner Sandman", Duration.ofSeconds(100));

    @Test
    void getSongs() {
        SongAlbum songAlbum = new SongAlbum("My title");
        songAlbum.addSong(song);
        assertEquals(song,songAlbum.getSong("Inner Sandman"));
    }

    @Test
    void setSongs() {
    }

    @Test
    void addSong() {
    }

    @Test
    void getSong() {
    }

    @Test
    void getTitle() {
    }

    @Test
    void setTitle() {
    }

    @Test
    void getNumOfSongs() {
    }
}