package Day03.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Description: 比较重定向和转发的不同
 * @Author: Wang Shiyu
 * @Date: 2020/7/22/0:55
 */
@WebServlet("/RedirectAttributeServlet")
public class RedirectAttributeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //把attrobj属性值test存储到request对象中
        req.setAttribute("attrobj", "test");
        System.out.println("重定向前");
        //进行重定向
        resp.sendRedirect(req.getContextPath() + "/ResultAttributeServlet");
        System.out.println("重定向后");
    }

}
