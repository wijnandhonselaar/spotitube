package oose.dea.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by Wijnand on 6-10-2015.
 */
@Entity
@Table(name = "Playlist")
public class Playlist implements Serializable {

    @Id
    private String name;
    private String owner;
    @OneToMany
    @JoinColumn(name="name")
    private List<TrackAvailability> trackCollection;


//    public Playlist(String name, String owner, List<Track> tracks) {
//        if (tracks.isEmpty()) {
//            throw new NullPointerException();
//        }
//        this.name = name;
//        this.owner = owner;
//        this.tracks = tracks;
//    }

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

    public void addTrack(Track track) {
    }

    public void delete() {
        // delete this track
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public List<TrackAvailability> getTracks() {
        return trackCollection;
    }

    public void setTracks(List<TrackAvailability> tracks) {
        this.trackCollection = tracks;
    }
}
