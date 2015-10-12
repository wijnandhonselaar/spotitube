package oose.dea.service;

import oose.dea.entities.Playlist;
import oose.dea.entities.Track;
import oose.dea.service.playlist.PlaylistManager;

import javax.ws.rs.Path;
import java.util.List;

/**
 * Created by Wijnand on 6-10-2015.
 */
public class PlaylistManagerService {

    private PlaylistManager playlistManager = new PlaylistManager();

    public List<Playlist> getAll() {
        return playlistManager.getAll();
    }

    public Playlist getByName(String name) {
        return playlistManager.getByName(name);
    }

    public void create(Playlist playlist) {
        playlistManager.add(playlist);
    }

    public void save(Playlist playlist) {
        playlistManager.save(playlist);
    }

    public void remove(String name) {
        playlistManager.remove(name);
    }

    public void addTrack(Playlist playlist, Track track) {
        playlistManager.addTrack(playlist, track);
    }

    @Path("/remove-track")
    public void removeTrack(Playlist playlist, Track track) {
        playlistManager.removeTrack(playlist, track);
    }

    public List<Playlist> getByOwner(String searchtoken) {
        return playlistManager.getByOwner(searchtoken);
    }
}
