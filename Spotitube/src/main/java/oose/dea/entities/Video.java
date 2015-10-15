package oose.dea.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Calendar;

/**
 * Created by Wijnand on 6-10-2015.
 */
//@Entity
//@Table(name="video")
//@DiscriminatorValue("video")
public class Video extends Track implements Serializable {
//    @Id
//    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    private int playcount;
    private Calendar publicationDate;
    private String description;
//    @MapsId
//    @OneToOne
//    @JoinColumn(name="id")
    private int trackid;

    /**
     * @param performer
     * @param available
     * @param title
     * @param utl
     * @param duration
     * @param playcount
     * @param description
     */
    public Video(String performer, boolean available, String title, String utl, long duration, int playcount, Calendar publicationDate, String description) {
        super(performer, available, title, utl, duration);
        this.playcount = playcount;
        this.publicationDate = publicationDate;
        this.description = description;
    }

    public Video() {
    }

    public int getPlaycount() {
        return playcount;
    }

    public void setPlaycount(int playcount) {
        this.playcount = playcount;
    }

    public Calendar getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(Calendar publicationDate) {
        this.publicationDate = publicationDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    public int getTrackid() {
        return trackid;
    }

    public void setTrackid(int trackid) {
        this.trackid = trackid;
    }
}
