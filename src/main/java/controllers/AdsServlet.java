package controllers;

import dao.Ads;
import dao.DaoFactory;
import models.Ad;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name="controllers.AdsServlet", urlPatterns = "/ads")
public class AdsServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

//    -- gets dao.ListAdsDao
        Ads listAdsDao = DaoFactory.getAdsDao();
//    -- gets all ads
        List<Ad> ads = listAdsDao.all();
//    -- created key pair with ads
        req.setAttribute("ads", ads);
        req.getRequestDispatcher("/ads/index.jsp").forward(req,resp);
    }

}
