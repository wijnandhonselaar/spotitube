package oose.dea.service.playlist;

import oose.dea.dataaccess.DataAccessController;
import oose.dea.entities.Playlist;
import oose.dea.entities.Track;

import javax.ws.rs.*;
import java.util.List;

/**
 * Created by Wijnand on 6-10-2015.
 */
public class PlaylistManager {
    DataAccessController dac = new DataAccessController();

    @Path("/")
    @GET
    @Produces("application/json")
    public List<Playlist> getAll() {
        return dac.getAllPlaylist();
    }

    @Path("/{name}")
    @GET
    @Produces("application/json")
    public Playlist getByName(@PathParam("name") String name) {
        return new Playlist();
    }

    @Path("/create")
    @POST
    @Consumes("application/json")
    public void add(Playlist playlist) {
        dac.createPlaylist(playlist);
    }

    @Path("/update")
    @POST
    @Consumes("application/json")
    public void save(Playlist playlist) {
        dac.updatePlaylist(playlist);
    }

    @Path("/delete/{name}")
    @DELETE
    @Consumes("application/json")
    public void remove(@PathParam("name") String name) {
        dac.removePlaylist(name);
    }

    public void addTrack(Playlist playlist, Track track) {

    }

    public void removeTrack(Playlist playlist, Track track) {

    }

    public List<Playlist> getByOwner(String searchtoken) {
        return dac.getPlaylistByOwner(searchtoken);
    }
}
