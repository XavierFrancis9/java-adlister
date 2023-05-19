package controllers;

import models.Album;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name="BeanTest", urlPatterns = "/beantest")
public class BeanTest extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Album album1 = new Album("Michael Jackson", "Thriller", 1982, "Pop, post-disco, funk, rock", 51.2);
        Album album2 = new Album("AC/DC", "Back in Black", 1980, "Hard rock", 30.1);
        Album album3 = new Album("Whitney Houston", "The Bodyguard", 1992, "R&B, soul, pop, soundtrack", 28.7);

        List<Album> albums = new ArrayList<>();
        albums.add(album1);
        albums.add(album2);
        albums.add(album3);

        req.setAttribute("albums", albums);

        req.getRequestDispatcher("/test.jsp").forward(req, resp);
    }
}
