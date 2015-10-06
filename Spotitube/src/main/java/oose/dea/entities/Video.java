package oose.dea.entities;

import java.util.Calendar;

/**
 * Created by Wijnand on 6-10-2015.
 */
public class Video extends Track {
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

    public Video() {}

    private int playcount;

    public int getPlaycount() {
        return playcount;
    }

    public void setPlaycount(int playcount) {
        this.playcount = playcount;
    }

    private Calendar publicationDate;

    public Calendar getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(Calendar publicationDate) {
        this.publicationDate = publicationDate;
    }

    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
