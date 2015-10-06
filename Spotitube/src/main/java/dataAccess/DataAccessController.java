package dataAccess;

import oose.dea.entities.Playlist;

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

    public void removePLaylist(Playlist playlist) {

    }

}
