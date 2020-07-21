package Day03.web.servlet;

import Day03.entity.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Description: ${todo}
 * @Author: Wang Shiyu
 * @Date: 2020/7/21/13:58
 */
@WebServlet("/successServlet")
public class SuccessServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 获取 request 域中共享的 user 对象
        User user = (User) request.getAttribute("user");

        if (user != null) {
            // 给页面写一句话

            // 设置编码
            response.setContentType("text/html;charset=UTF-8");

            // 输出
            response.getWriter().write("登陆成功！" + user.getUsername() + "，欢迎你");
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
