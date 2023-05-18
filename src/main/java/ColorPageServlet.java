import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(name = "ColorPageServlet", urlPatterns = "/pickcolor")
public class ColorPageServlet extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String color = req.getParameter("color");
        String redirectURL = "/viewcolor?color=" + color;
        resp.sendRedirect(redirectURL);
    }
}
