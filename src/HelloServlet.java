import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by : Naveen Pabhath
 * Date : 6/7/2022
 * Time : 11:24 AM
 * Project Name : javaEE
 **/

@WebServlet(urlPatterns = "/hello")
public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Request Received");
        PrintWriter writer = resp.getWriter();
        writer.write("Response Sended");
    }
}
