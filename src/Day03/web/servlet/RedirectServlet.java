package Day03.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Description: Servlet重定向的使用
 * @Author: Wang Shiyu
 * @Date: 2020/7/21/23:31
 */
@WebServlet("/RedirectServlet")
public class RedirectServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("重定向前");
        //进行重定向
        resp.sendRedirect(req.getContextPath() + "/ResultServlet");
        //req.getContextPath() 获取当前的相对路径
        System.out.println("重定向后");

    }
}
