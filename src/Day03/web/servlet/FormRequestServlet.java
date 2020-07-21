package Day03.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

/**
 * @Description: 获取表单数据
 * @Author: Wang Shiyu
 * @Date: 2020/7/21/23:04
 */
@WebServlet("/FormRequestServlet")
public class FormRequestServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //设置响应的文本类型为HTML，字符编码为 UTF-8
        resp.setContentType("text/html;charset=UTF-8");
        //获取请求数据
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String[] channel = req.getParameterValues("channel");
        Enumeration<String> elem = req.getParameterNames();
        //获取输出流
        PrintWriter out = resp.getWriter();
        //响应输出数据
        out.println("<p>注册的用户名是：" + username + "<p>");
        out.println("<p>注册的密码是：" + password + "<p>");
        out.println("<p>注册的信息来源是：");
        for (String c : channel) {
            out.println(c + "&nbsp");
        }
        out.println("</p>");
        out.println("<p>所有客户请求的参数名是：");
        while (elem.hasMoreElements()) {
            out.println(elem.nextElement() + "&nbsp");
        }
        out.println("</p>");
        out.flush();
        out.close();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }
}
