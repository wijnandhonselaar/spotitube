package oose.dea.service;

import oose.dea.entities.Playlist;
import oose.dea.entities.Track;
import oose.dea.service.playlist.PlaylistManager;

import javax.ws.rs.*;

/**
 * Created by Wijnand on 6-10-2015.
 */
@Path("/playlist")
public class PlaylistManagerService {

        private PlaylistManager playlistManager = new PlaylistManager();

        @Path("/{name}")
        @GET
        @Produces("application/json")
        public Playlist getByName(@PathParam("name") String name) {
              return playlistManager.getByName(name);
        }

        @Path("/create")
        @POST
        @Consumes("application/json")
        public void add(Playlist playlist) {
                playlistManager.add(playlist);
        }

        @Path("/update")
        @POST
        @Consumes("application/json")
        public void save(Playlist playlist) {
                playlistManager.save(playlist);
        }

        @Path("/delete")
        @Consumes("application/json")
        public void remove(Playlist playlist) {
                playlistManager.remove(playlist);
        }

        @Path("/add-track")
        @POST
        @Consumes("application/json")
        public void addTrack(Playlist playlist, Track track) {
                playlistManager.addTrack(playlist, track);
        }

        @Path("/remove-track")
        public void removeTrack(Playlist playlist, Track track) {
               playlistManager.removeTrack(playlist, track);
        }
}
