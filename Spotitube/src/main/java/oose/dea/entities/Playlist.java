package oose.dea.entities;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Wijnand on 6-10-2015.
 */
public class Playlist {

    private String name = null;
    private String owner;
    private List<Track> tracks = new ArrayList<>();

    public Playlist(String name, String owner, List<Track> tracks) {
        if (tracks.isEmpty()) {
            throw new NullPointerException();
        }
        this.name = name;
        this.owner = owner;
        this.tracks = tracks;
    }

    public Playlist() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {

        return this.owner;
    }

    public List<Track> getTracks() {
        return tracks;
    }

    public void setTracksList(List<Track> tracklist) {
        this.tracks = tracklist;
    }

    public void addTrack(Track track) {
        this.tracks.add(track);
    }

    public void delete() {
        // delete this track
    }
}
