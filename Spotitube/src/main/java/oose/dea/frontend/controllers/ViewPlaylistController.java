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
public class ViewPlaylistController extends HttpServlet {
    PlaylistManagerService playlistManagerService = new PlaylistManagerService();

    /**
     * View playlist
     * req.Parameter name (playlist-name)
     * OR
     * req.getAttribute(playlist)
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if (req.getAttribute("playlist") != null) {
            req.setAttribute("playlist", req.getAttribute("playlist"));
        } else if (req.getParameter("playlist-name") != null) {
            req.setAttribute("playlist", playlistManagerService.getByName(req.getParameter("name")));
        }

        req.getRequestDispatcher("/playlist/view.jsp").forward(req, resp);
    }
}
