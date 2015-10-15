package oose.dea.entities;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Wijnand on 15-10-2015.
 */
@Entity
@Table(name="trackAvailability")
@Inheritance(strategy = InheritanceType.JOINED)
public class TrackAvailability implements Serializable {
    public TrackAvailability() {

    }

    @Id
    @ManyToOne
    @JoinColumn(name="name")
    private Playlist playlist;

    @Id
    @OneToOne
    @JoinColumn(name="id")
    private Track track;

    private boolean available;

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public Playlist getPlaylist() {
        return playlist;
    }

    public void setPlaylist(Playlist playlist) {
        this.playlist = playlist;
    }

    public Track getTrack() {
        return track;
    }

    public void setTrack(Track track) {
        this.track = track;
    }
}
