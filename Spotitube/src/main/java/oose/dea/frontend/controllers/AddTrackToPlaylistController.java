package oose.dea.frontend.controllers;

import oose.dea.entities.Playlist;
import oose.dea.service.PlaylistManagerService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Wijnand on 12-10-2015.
 */
public class AddTrackToPlaylistController extends HttpServlet {
    PlaylistManagerService playlistManagerService = new PlaylistManagerService();

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Playlist playlist = playlistManagerService.getByName(req.getParameter("playlist-name"));
    }
}
