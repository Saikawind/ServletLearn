package Day03.dao;

import Day03.entity.User;
import Day03.util.JDBCUtils;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @Description: 用户数据库操作类
 * @Author: Wang Shiyu
 * @Date: 2020/7/21/11:59
 */
public class UserDao {

    //声明 JDBCTemplate 对象共用
    private JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());

    //登录方法
    public User login(User loginUser) {
        try {
            //1.编写 sql
            String sql = "SELECT * FROM user WHERE username = ? and password = ?";
            //2.调用 query方法
            User user = template.queryForObject(sql, new BeanPropertyRowMapper<User>(User.class),
                    loginUser.getUsername(), loginUser.getPassword());

            return user;
        } catch (DataAccessException e) {
            // 记录日志
            e.printStackTrace();
            return null;
        }
    }
}
