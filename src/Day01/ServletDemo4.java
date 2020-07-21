package Day01;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Description: 多个访问路径
 * @Author: Wang Shiyu
 * @Date: 2020/7/19/18:58
 */
@WebServlet({"/d4", "/demo4", "/Demo4"})
public class ServletDemo4 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doGet(req, resp);
        System.out.println("Demo4");
    }
}
