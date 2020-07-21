package Day03.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @Description: 重定向结果展示
 * @Author: Wang Shiyu
 * @Date: 2020/7/21/23:37
 */
@WebServlet("/ResultServlet")
public class ResultServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //设置响应到客户端的文本类型为html
        resp.setContentType("text/html;charset=UTF-8");
        //获取输出流
        PrintWriter out = resp.getWriter();
        //输出响应结果
        out.println("<p>重定向和请求转发的结果页面</p>");
    }
}
