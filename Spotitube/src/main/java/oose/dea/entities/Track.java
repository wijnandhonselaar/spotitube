package oose.dea.entities;

/**
 * Created by Wijnand on 6-10-2015.
 */
public class Track {
    private String performer;
    private boolean available;
    private String title;
    private String url;
    private long duration;

    /**
     * @param performer
     * @param available
     * @param title
     * @param url
     * @param duration
     */
    public Track(String performer, boolean available, String title, String url, long duration) {
        this.performer = performer;
        this.available = available;
        this.title = title;
        this.url = url;
        this.duration = duration;
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
}
