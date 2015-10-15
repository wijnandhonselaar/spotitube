package oose.dea.entities;

import javax.persistence.Table;

/**
 * Created by Wijnand on 15-10-2015.
 */
@Table(name="availability")
public class Availability {
    public Availability() {

    }
    private Track track;
    private boolean available;

    public Track getTrack() {
        return track;
    }

    public void setTrack(Track track) {
        this.track = track;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
