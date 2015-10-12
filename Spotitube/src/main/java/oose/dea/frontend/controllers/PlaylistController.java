package oose.dea.frontend.controllers;

import oose.dea.frontend.models.PlaylistModel;
import oose.dea.service.PlaylistManagerService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Wijnand on 6-10-2015.
 */

public class PlaylistController extends HttpServlet {
    PlaylistManagerService playlistManagerService = new PlaylistManagerService();
    String owner = "";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        switch (req.getServletPath()) {
            case "/playlist/list":
                if (owner == "") {
                    owner = req.getParameter("username");
                }
                req.setAttribute("playlists", playlistManagerService.getByOwner(owner));
                print(resp, owner);
                req.getRequestDispatcher("/playlist/list.jsp").forward(req, resp);
                break;
            case "/playlist/view":
                req.setAttribute("playlists", playlistManagerService.getByName(req.getParameter("name")));
                req.getRequestDispatcher("/playlist/view.jsp").forward(req, resp);
                break;
            case "/playlist/all":
                req.setAttribute("playlists", playlistManagerService.getAll());
                req.getRequestDispatcher("/playlist/list.jsp").forward(req, resp);
                break;
            case "/playlist/create":
                req.setAttribute("playlist", new PlaylistModel());
                req.getRequestDispatcher("/playlist/create.jsp").forward(req, resp);
                break;
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        switch (req.getServletPath()) {
            case "/playlist":
                owner = req.getParameter("username");
                print(resp, req.getParameter("username"));
                break;
            case "/playlist/create":

                print(resp, req.getParameter("username"));
                break;
        }
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    }

    private void print(HttpServletResponse resp, String string) throws IOException {
        PrintWriter w = resp.getWriter();
        w.println(string);
    }
}
