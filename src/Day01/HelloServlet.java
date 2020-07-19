package Day01;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

/**
 * @Description: Servlet测试类
 * @Author: Wang Shiyu
 * @Date: 2020/7/18/19:03
 */

@WebServlet("/Day01.HelloServlet")
public class HelloServlet implements Servlet {

    // 初始化方法
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("Hello Servlet");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    // 提供服务的方法，每一次Servlet被访问时，执行，执行多次
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {

    }

    @Override
    public String getServletInfo() {
        return null;
    }

    // 销毁方法
    @Override
    public void destroy() {

    }
}
