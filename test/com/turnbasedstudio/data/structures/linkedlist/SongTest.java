package com.turnbasedstudio.data.structures.linkedlist;

import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class SongTest{

    private final Song song = new Song("Inner Sandman", Duration.ofSeconds(100));


    @Test
    void getTitle() {
        assertEquals("Inner Sandman",song.getTitle());
    }


    @Test
    void getDuration() {
        assertEquals(100,song.getDuration().getSeconds());
    }


}