<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户注册</title>
</head>
<body>
    <form id="register" action="register" method="post">
        <label>注册账号：</label>
        <input id="account" type="text" name="account"><br>
        <label>注册密码：</label>
        <input id="password" type="password" name="password"><br>
        <label>确认密码：</label>
        <input type="password"><br>
        <button type="submit" formaction="register">注册</button><br>
        <div>
            ${error}
        </div>
    </form>
</body>
</html>
