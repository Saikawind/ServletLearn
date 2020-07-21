package Day03.web.servlet;

import Day03.dao.UserDao;
import Day03.entity.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Description: 登录类
 * @Author: Wang Shiyu
 * @Date: 2020/7/21/13:47
 */
@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 1.设置编码
        req.setCharacterEncoding("UTF-8");

        // 2.获取请求参数
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        // 3.封装 user 对象
        User loginUser = new User();
        loginUser.setUsername(username);
        loginUser.setPassword(password);

        // 4.调用 UserDao的 login方法
        UserDao dao = new UserDao();
        User user = dao.login(loginUser);

        // 5.判断 user
        if (user == null) {
            // 登录失败
            req.getRequestDispatcher("/failServlet").forward(req, resp);
        } else {
            // 登录成功
            // 存储数据
            req.setAttribute("user", user);
            // 转发
            req.getRequestDispatcher("/successServlet").forward(req, resp);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }
}
