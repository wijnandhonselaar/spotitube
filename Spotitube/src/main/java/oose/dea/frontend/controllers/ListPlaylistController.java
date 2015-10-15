package oose.dea.frontend.controllers;

import oose.dea.service.PlaylistManagerService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Wijnand on 15-10-2015.
 */
public class ListPlaylistController extends HttpServlet {
    PlaylistManagerService playlistManagerService = new PlaylistManagerService();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("playlists", playlistManagerService.getByOwner(req.getParameter("owner")));
        req.getRequestDispatcher("/playlist/list.jsp").forward(req, resp);
    }
}
