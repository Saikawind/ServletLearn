package util;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

/**
 * @Description: 数据库访问工具类
 * @Author: Wang Shiyu
 * @Date: 2020/7/22/16:52
 */
public class DBUtil {
    // 属性文件
    private static Properties properties;
    private static Connection connection = null;

    static {
        try {
            //1.创建Properties集合类
            properties = new Properties();
            //2.加载文件
            properties.load(new FileInputStream("src/druid.properties"));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //连接数据库
    public static Connection getConnection() {

        // 获取连接数据库的变量
        String driver = properties.getProperty("driverClassName");
        String url = properties.getProperty("url");
        String username = properties.getProperty("username");
        String password = properties.getProperty("password");

        try {
            //1.注册驱动
            Class.forName(driver);
            //获取数据库连接对象
            connection = DriverManager.getConnection(url, username, password);

        } catch (ClassNotFoundException | SQLException e) {
            //连接异常，则抛出异常信息
            e.printStackTrace();
        }

        // 返回连接对象
        return connection;
    }

    //关闭数据库连接
    public static void closeJDBC(Connection connection, Statement statement, ResultSet resultSet) {
        // 判断传入的数据库变量是否为空，不为空则可以关闭
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if (statement != null) {
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if (resultSet != null) {
            try {
                resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }


}
