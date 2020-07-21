package Day02;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

/**
 * @Description: Servlet类使用 resp 参数返回在浏览器上
 * @Author: Wang Shiyu
 * @Date: 2020/7/20/16:56
 */
@WebServlet("/Hello")
public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            resp.getWriter().println("<h1>Hello Servlet! </h1>");
            resp.getWriter().println(new Date().toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
