package Day03.web.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Description: 请求转发
 * @Author: Wang Shiyu
 * @Date: 2020/7/21/23:40
 */
@WebServlet("/ForwardServlet")
public class ForwardServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("请求转发前");
        RequestDispatcher dispatcher = req.getRequestDispatcher("/ResultServlet");
        dispatcher.forward(req, resp);
        System.out.println("请求转发后");
    }

}
