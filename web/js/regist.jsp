<%--
  Created by IntelliJ IDEA.
  User: 83477
  Date: 2020/7/21
  Time: 23:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户注册</title>
</head>
<body>
<form action="FormRequestServlet" method="post">
    <p>用户名：<input name="username" type="text"></p>
    <p>密&nbsp;码：<input name="password" type="password"></p>
    <p>信息来源：<input name="channel" type="checkbox" value="Web">网络
        <input name="channel" type="checkbox" value="Newspaper">报纸
        <input name="channel" type="checkbox" value="Friend">亲友
    </p>
    <p><input type="submit" value="提交">&nbsp;&nbsp;<input type="reset" value="重置"></p>
</form>
</body>
</html>
