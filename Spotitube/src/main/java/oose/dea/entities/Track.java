package oose.dea.entities;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Wijnand on 6-10-2015.
 */
@Entity
@Table(name="track")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name="type")
public class Track implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @JoinColumn(name="id")
    private int id;
    private String performer;
    private boolean available;
    private String title;
    private String url;
    private long duration;
    private String type;

    /**
     * @param performer
     * @param available
     * @param title
     * @param url
     * @param duration
     */
    public Track(String performer, boolean available, String title, String url, long duration, String type) {
        this.performer = performer;
        this.available = available;
        this.title = title;
        this.url = url;
        this.duration = duration;
        this.type = type;
    }


    public Track() {
    }

    public String getPerformer() {
        return performer;
    }

    public void setPerformer(String performer) {
        this.performer = performer;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public long getDuration() {
        return duration;
    }

    public void setDuration(long duration) {
        this.duration = duration;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
