package oose.dea.dataaccess;

import oose.dea.entities.Video;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Wijnand on 6-10-2015.
 */
public class VideoDAO {
    /**
     * @param keyword
     * @return ArrayList<Video>
     */
    protected List<Video> searchVideo(String keyword) {
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
    protected List<Video> getByPerformer(String performer) {
        return new ArrayList<Video>();
    }

    protected List<Video> getByAlbum(String album) {
        return new ArrayList<Video>();
    }

    /**
     * @return ArrayList<Song>
     */
    protected List<Video> getAll() {
        return new ArrayList<Video>();
    }
}
