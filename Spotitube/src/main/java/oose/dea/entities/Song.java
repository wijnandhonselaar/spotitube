package oose.dea.entities;

/**
 * Created by Wijnand on 6-10-2015.
 */
public class Song extends Track {
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
        super(performer, available, title, url, duration);
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
