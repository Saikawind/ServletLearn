import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

/**
 * @Description: GenericServlet抽象类
 * @Author: Wang Shiyu
 * @Date: 2020/7/19/18:26
 */
@WebServlet("/Demo2")
public class ServletDemo2 extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) {
        System.out.println("Demo2");
    }
}
