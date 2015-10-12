package oose.dea.dataAccess;

import oose.dea.entities.Playlist;
import oose.dea.entities.Track;

import java.util.ArrayList;
import java.util.List;

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
        Playlist playlist = getByName(name);
        playlist.delete();
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
    protected List<Playlist> getByOwner(String owner) {
        return new ArrayList<Playlist>();
    }

    /**
     * @return ArrayList<Playlist>
     */
    protected List<Playlist> getAll() {
        return new ArrayList<Playlist>();
    }

    protected void addTrackToPlaylist(Playlist playlist, Track track) {
        playlist.addTrack(track);
    }


}
