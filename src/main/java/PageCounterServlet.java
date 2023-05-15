import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import static java.lang.Integer.parseInt;

@WebServlet(name="PageCounterServlet", urlPatterns = "/count")
public class PageCounterServlet extends HttpServlet {
    private int count = 1;
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        String counter = req.getParameter("counter");
        if(counter == null) {
            out.println("<h1>View Counter: " + count + "</h1>");
            count++;
        } else {
            count = parseInt(counter);
            res.sendRedirect("http://localhost:8080/count");
        }


    }

}
