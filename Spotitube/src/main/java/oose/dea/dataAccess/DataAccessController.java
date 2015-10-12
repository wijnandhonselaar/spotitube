package oose.dea.dataAccess;

import oose.dea.entities.Playlist;
import oose.dea.entities.Track;

import java.util.List;

/**
 * Created by Wijnand on 6-10-2015.
 */
public class DataAccessController {

    PlaylistDAO playlistDAO = new PlaylistDAO();
    SongDAO songDAO = new SongDAO();
    VideoDAO videoDAO = new VideoDAO();

    public void createPlaylist(Playlist playlist) {
        playlistDAO.create(playlist);
    }

    public void removePlaylist(String playlist) {
        playlistDAO.delete(playlist);
    }

    public void updatePlaylist(Playlist playlist) {
        playlistDAO.update(playlist);
    }

    public List<Playlist> getAllPlaylist() {
        return playlistDAO.getAll();
    }

    public Playlist getPlaylistByName(String searchtoken) {
        return playlistDAO.getByName(searchtoken);
    }

    public List<Playlist> getPlaylistByOwner(String searchtoken) {
        return playlistDAO.getByOwner(searchtoken);
    }

    public void addTrackToPlaylist(Playlist playlist, Track track) {
        playlistDAO.addTrackToPlaylist(playlist, track);
    }
}
