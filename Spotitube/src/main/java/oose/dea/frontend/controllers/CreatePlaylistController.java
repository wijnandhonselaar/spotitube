package oose.dea.frontend.controllers;

import oose.dea.entities.Playlist;
import oose.dea.entities.Track;
import oose.dea.service.PlaylistManagerService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 * Created by Wijnand on 12-10-2015.
 */
public class CreatePlaylistController extends HttpServlet {
    PlaylistManagerService playlistManagerService = new PlaylistManagerService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Playlist newPlaylist = new Playlist();
        req.setAttribute("playlist", newPlaylist);
        req.getRequestDispatcher("/playlist/create.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Playlist newPlaylist = new Playlist();
        newPlaylist.setName(req.getParameter("name"));
        newPlaylist.setOwner(req.getParameter("owner"));

        PrintWriter w = resp.getWriter();
        w.print(newPlaylist);
        playlistManagerService.create(newPlaylist);

        req.setAttribute("playlist", newPlaylist);
        resp.sendRedirect("/playlist/view?playlist-name" + newPlaylist.getName());
        req.getRequestDispatcher("/playlist/view.jsp").forward(req, resp);
    }
}
