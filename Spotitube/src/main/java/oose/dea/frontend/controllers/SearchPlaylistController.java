package oose.dea.frontend.controllers;

import oose.dea.service.PlaylistManagerService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Wijnand on 12-10-2015.
 */
public class SearchPlaylistController extends HttpServlet {
    PlaylistManagerService playlistManagerService = new PlaylistManagerService();
    String owner = "";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if (owner == "") {
            owner = req.getParameter("username");
        }

        req.setAttribute("playlists", playlistManagerService.getByOwner(owner));
        req.getRequestDispatcher("/playlist/list.jsp").forward(req, resp);
    }
}
