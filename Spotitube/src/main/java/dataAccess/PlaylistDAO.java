package dataAccess;

import oose.dea.entities.Playlist;

import java.util.ArrayList;

/**
 * Created by Wijnand on 6-10-2015.
 */
public class PlaylistDAO {

    /**
     * @param playlist
     */
    protected void create(Playlist playlist) {

    }

    /**
     * @param playlist
     */
    protected void update(Playlist playlist) {

    }


    /**
     * @param name
     */
    protected void delete(String name) {

    }

    /**
     * @param playlist
     */
    protected void delete(Playlist playlist) {

    }

    /**
     * @param name
     * @return Playlist
     */
    protected Playlist getByName(String name) {
        return new Playlist();
    }

    /**
     * @param owner
     * @return ArrayList<Playlist>
     */
    protected ArrayList<Playlist> getByOwner(String owner) {
        return new ArrayList<Playlist>();
    }

    /**
     * @return ArrayList<Playlist>
     */
    protected ArrayList<Playlist> getAll() {
        return new ArrayList<Playlist>();
    }


}
