package oose.dea.items;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Path;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

/**
 * Created by Wijnand on 6-10-2015.
 */

@Path("/")
public class ViewItemsController extends HttpServlet {

    @Path("/view-items")
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        PrintWriter writer = resp.getWriter();

        writer.println("<html><head><title>Hello</title></head><body>");
        writer.println("<h1><a href=\"/\"><span>Home, I am Lorde...</span></a> </h1>");
        writer.println("<p>Current time: " + new Date() + "</p>");
        for (Item item : new ItemService().findAll()) {
            writer.print("<ul> <li>Sku: " + item.getSku() + "</li>");
            writer.print("<li> Category: " + item.getCategory() + "</li>");
            writer.print("<li> Title: " + item.getTitle() + "</li></ul>");
        }
        writer.println("</body></html>");
    }

//    @Path("/view-items")
//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
//            throws ServletException, IOException {
//
//        PrintWriter writer = resp.getWriter();
//
//        writer.println("<html><head><title>Hello</title></head><body>");
//        writer.println("<h1><a href=\"/\"><span>Home, I am Lorde...</span></a> </h1>");
//        writer.println("<p>Current time: " + new Date() + "</p>");
//        for (Item item : new ItemService().findAll()) {
//            writer.print("<ul> <li>Sku: " + item.getSku() + "</li>");
//            writer.print("<li> Category: " + item.getCategory() + "</li>");
//            writer.print("<li> Title: " + item.getTitle() + "</li></ul>");
//        }
//        writer.println("</body></html>");
//    }

}
