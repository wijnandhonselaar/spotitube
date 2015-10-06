package oose.dea.entities;

/**
 * Created by Wijnand on 6-10-2015.
 */
public class Song extends Track{
    /**
     * @param performer
     * @param available
     * @param title
     * @param utl
     * @param duration
     * @param album
     */
    public Song(String performer, boolean available, String title, String utl, long duration, String album) {
        super(performer, available, title, utl, duration);
        this.album = album;
    }

    public Song() {}

    private String album;

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }
}
