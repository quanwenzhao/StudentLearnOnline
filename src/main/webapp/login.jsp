<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户登陆</title>
</head>
<body>
    <form action="login" method="post">
        <label>账号：</label>
        <input type="text" name="account"><br>
        <label>密码：</label>
        <input type="password" name="password"><br>
        <button type="submit">登陆</button>
        <a href="${pageContext.request.contextPath}/register">我没有账号，注册一个</a></p>
    </form>
    <div>
        ${error}
    </div>
</body>
</html>
