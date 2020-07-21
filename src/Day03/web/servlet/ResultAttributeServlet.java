package Day03.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @Description: 比较重定向和转发的不同
 * @Author: Wang Shiyu
 * @Date: 2020/7/22/0:59
 */
@WebServlet("/ResultAttributeServlet")
public class ResultAttributeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //设置响应到客户端的文本类型为HTML
        resp.setContentType("text/html;charset=UTF-8");
        //从request对象中获取attrobj属性值
        String attrobj = (String) req.getAttribute("attrobj");
        //获取输出流
        PrintWriter out = resp.getWriter();
        //输出响应结果
        out.println("<p>重定向和请求转发的结果页面</p>");
        out.println("读取的request对象的attrobj的属性值为：" + attrobj);
    }
}
