package oose.dea.dataaccess;

import oose.dea.entities.Song;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Wijnand on 6-10-2015.
 */
public class SongDAO {

    /**
     * @param search
     * @return
     */
    protected List<Song> searchSong(String search) {
        return new ArrayList<Song>();
    }

    /**
     * @param title
     * @return Song
     */
    protected List<Song> getByTitle(String title) {
        return new ArrayList<Song>();
    }

    /**
     * @param performer
     * @return ArrayList<Song>
     */
    protected List<Song> getByPerformer(String performer) {
        return new ArrayList<Song>();
    }

    protected List<Song> getByAlbum(String album) {
        return new ArrayList<Song>();
    }

    /**
     * @return ArrayList<Song>
     */
    protected List<Song> getAll() {
        return new ArrayList<Song>();
    }
}
