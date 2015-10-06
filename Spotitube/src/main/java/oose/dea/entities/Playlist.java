package oose.dea.entities;

import java.util.ArrayList;

/**
 * Created by Wijnand on 6-10-2015.
 */
public class Playlist {

    public Playlist(String name, String owner, ArrayList<Track> tracks) {
        if(tracks.isEmpty()) {
            throw new NullPointerException();
        }
        this.name = name;
        this.owner = owner;
        this.tracks = tracks;
    }

    public Playlist() {};


    private String name = null;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String owner;

    public String getOwner() {

        return this.owner;
    }

    private ArrayList<Track> tracks = new ArrayList<>();

    public ArrayList<Track> getTracks() {
        return tracks;
    }

    public void setTracks(ArrayList<Track> tracks) {
        this.tracks = tracks;
    }
}
