package dataAccess;

import oose.dea.entities.Video;

import java.util.ArrayList;

/**
 * Created by Wijnand on 6-10-2015.
 */
public class VideoDAO {
    /**
     * @param keyword
     * @return ArrayList<Video>
     */
    protected ArrayList<Video> searchVideo(String keyword) {
        return new ArrayList<Video>();
    }

    /**
     * @param title
     * @return Video
     */
    protected ArrayList<Video> getByTitle(String title) {
        return new ArrayList<Video>();
    }

    /**
     * @param performer
     * @return ArrayList<Video>
     */
    protected ArrayList<Video> getByPerformer(String performer) {
        return new ArrayList<Video>();
    }

    protected ArrayList<Video> getByAlbum(String album) {
        return new ArrayList<Video>();
    }

    /**
     * @return ArrayList<Song>
     */
    protected ArrayList<Video> getAll() {
        return new ArrayList<Video>();
    }
}
