package dataAccess;

import oose.dea.entities.Song;

import java.util.ArrayList;

/**
 * Created by Wijnand on 6-10-2015.
 */
public class SongDAO {

    /**
     * @param search
     * @return
     */
    protected ArrayList<Song> searchSong(String search) {
        return new ArrayList<Song>();
    }

    /**
     * @param title
     * @return Song
     */
    protected ArrayList<Song> getByTitle(String title) {
        return new ArrayList<Song>();
    }

    /**
     * @param performer
     * @return ArrayList<Song>
     */
    protected ArrayList<Song> getByPerformer(String performer) {
        return new ArrayList<Song>();
    }

    protected ArrayList<Song> getByAlbum(String album) {
        return new ArrayList<Song>();
    }

    /**
     * @return ArrayList<Song>
     */
    protected ArrayList<Song> getAll() {
        return new ArrayList<Song>();
    }
}
