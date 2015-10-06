package oose.dea.entities;

/**
 * Created by Wijnand on 6-10-2015.
 */
public class Track {
    /**
     * @param performer
     * @param available
     * @param title
     * @param utl
     * @param duration
     */
    public Track(String performer, boolean available, String title, String utl, long duration) {
        this.performer = performer;
        this.available = available;
        this.title = title;
        this.utl = utl;
        this.duration = duration;
    }

    public Track() {}

    private String performer;

    public String getPerformer() {
        return performer;
    }

    public void setPerformer(String performer) {
        this.performer = performer;
    }

    private boolean available;


    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    private String utl;

    public String getUtl() {
        return utl;
    }

    public void setUtl(String utl) {
        this.utl = utl;
    }

    private long duration;

    public long getDuration() {
        return duration;
    }

    public void setDuration(long duration) {
        this.duration = duration;
    }
}
