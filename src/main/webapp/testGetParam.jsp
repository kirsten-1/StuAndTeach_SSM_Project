
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<p>松耦合提交参数</p>
<form action="getParam.do">
    username:
    <input type="text" name="username" >
    <input type="password" name="password" >
    <input type="submit" value="提交">
</form>
<p>紧耦合提交参数</p>
<form action="getArg.do">
    username:
    <input type="text" name="username" >
    <input type="password" name="pwd" >
    <input type="submit" value="提交">
</form>
</body>
</html>
