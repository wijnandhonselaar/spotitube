package oose.dea.entities;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Wijnand on 6-10-2015.
 */
@Entity
@Table(name="song")
@DiscriminatorValue("song")
public class Song extends Track implements Serializable {
    private String album;

    /**
     * @param performer
     * @param available
     * @param title
     * @param url
     * @param duration
     * @param album
     */
    public Song(String performer, boolean available, String title, String url, long duration, String album) {
        this.album = album;
    }

    public Song() {
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }
}
