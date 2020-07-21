package Day02;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @Description: 获取浏览器提交的参数
 * @Author: Wang Shiyu
 * @Date: 2020/7/20/15:58
 */

@WebServlet("/login2")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //设置接收的编码方式，解决无法输出中文的问题
        req.setCharacterEncoding("UTF-8");

        String name = req.getParameter("username");
        String password = req.getParameter("password");

        String html = null;

        if ("admin".equals(name) && "123".equals(password)) {
            html = "<div style='color:green'>登录成功</div>";
        } else {
            html = "<div style='color:red'>登录失败</div>";
        }
        //设置发送的编码方式，解决无法输出中文的问题
        resp.setContentType("text/html; charset=UTF-8");

        PrintWriter pw = resp.getWriter();
        pw.println(html);
    }
}
