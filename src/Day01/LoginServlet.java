package Day01;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Description: 测试取出录入表单的数据
 * @Author: Wang Shiyu
 * @Date: 2020/7/20/12:21
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
         //设置编码方式，解决无法输出中文的问题
        req.setCharacterEncoding("UTF-8");
         //获取表格中的参数
        String name = req.getParameter("username");
        String password = req.getParameter("password");

        System.out.println("name: " + name);
        System.out.println("password" + password);
    }
}
