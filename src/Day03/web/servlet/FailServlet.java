package Day03.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Description: ${todo}
 * @Author: Wang Shiyu
 * @Date: 2020/7/21/13:56
 */
@WebServlet("/failServlet")
public class FailServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 给页面写一句话

        // 设置编码
        response.setContentType("text/html;charset=UTF-8");
        // 输出
        response.getWriter().write("登录失败，用户名或密码错误");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
