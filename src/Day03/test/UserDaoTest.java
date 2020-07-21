package Day03.test;

import Day03.dao.UserDao;
import Day03.entity.User;
import org.junit.Test;

/**
 * @Description: 数据库操作测试类
 * @Author: Wang Shiyu
 * @Date: 2020/7/21/12:38
 */
public class UserDaoTest {

    @Test
    public void testLogin() {
        User loginuser = new User();
        loginuser.setUsername("wsy");
        loginuser.setPassword("1231");

        UserDao dao = new UserDao();
        User user = dao.login(loginuser);

        System.out.println(user);
    }
}
