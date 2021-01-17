package com.turnbasedstudio.data.structures.linkedlist;

import java.time.Duration;
import java.util.LinkedList;

public class Playlist implements Menu{

    private LinkedList<Playable> songs;
    private Playable currentSong;
    private Duration currentSongTime;
    private Library library;
    private boolean state=false;

    public Playlist(Library library){
        songs = new LinkedList<>();
        this.library=library;
    }

    private boolean setState(){
        if(!state && !songs.isEmpty()){
            currentSong=songs.get(0);
            currentSongTime= Duration.ZERO;
            state=true;
        }
        return state;
    }

    @Override
    public void play(){
       if(setState()){
           while (currentSongTime.getSeconds()<=currentSong.getDuration().getSeconds()){
               currentSongTime=currentSongTime.plusSeconds(1);
               System.out.format("%s is currently playing -> Playtime:%d",currentSong.getTitle(),currentSongTime.getSeconds());
           }
       }
    }


    @Override
    public void quit() {
        currentSongTime = Duration.ZERO;
        state=false;
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

    @Override
    public void addToQueue(String songTitle){
        songs.add(library.);

    }
}
