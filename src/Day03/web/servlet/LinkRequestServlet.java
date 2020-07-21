package Day03.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @Description: 处理超链接请求数据
 * @Author: Wang Shiyu
 * @Date: 2020/7/21/22:12
 */
@WebServlet("/LinkRequestServlet")
public class LinkRequestServlet extends HttpServlet {

    public LinkRequestServlet() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 设置请求的字符编码为 UTF-8
        req.setCharacterEncoding("UTF-8");
        // 设置响应的文本类型为 HTML，字符编码为 UTF-8
        resp.setContentType("text/html;charset=UTF-8");
        //获取输出流
        PrintWriter out = resp.getWriter();
        //获取请求数据
        String pageNo = req.getParameter("pageNo");
        String queryString = req.getParameter("queryString");
        int pageNum = 0;
        if (pageNo != null) {
            pageNum = Integer.parseInt(pageNo);
        }
        //响应输出数据
        out.println("<p>请求的页数是：" + pageNum + "<p>");
        out.println("<p>请求的查询字符是：" + queryString + "<p>");
        out.flush();
        out.close();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
