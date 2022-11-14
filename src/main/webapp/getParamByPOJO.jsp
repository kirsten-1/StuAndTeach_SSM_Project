<%--
  Created by IntelliJ IDEA.
  User: apple
  Date: 2022/11/10
  Time: 12:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="testByPojo" method="POST">
    <p>
        姓名：<input type="text" name="pname">
    </p>
    <p>
        年龄：<input type="text" name="page">
    </p>
    <p>
        性别：<input type="radio" name="gender" value="0">男
        <input type="radio" name="gender" value="1">女
    </p>
    <p>
        爱好<input type="checkbox" name="hobby" value="1">篮球
        <input type="checkbox" name="hobby" value="2">足球
        <input type="checkbox" name="hobby" value="3">排球
        <input type="checkbox" name="hobby" value="4">门球
    </p>
    <p>
        生日<input type="text" name="birthDate">
    </p>

    <p>
        宠物List：
        名字：<input type="text" name="pets[0].petName">类型：<input type="text" name="pets[0].petType">
        名字：<input type="text" name="pets[1].petName">类型：<input type="text" name="pets[1].petType">
    </p>
<%--    <p>--%>
<%--        宠物：--%>
<%--        名字：<input type="text" name="pet.petName">类型：<input type="text" name="pet.petType">--%>
<%--    </p>--%>
    <p>
        宠物Map：
        名字：<input type="text" name="petMap['a'].petName">类型：<input type="text" name="petMap['a'].petType">
        名字：<input type="text" name="petMap['b'].petName">类型：<input type="text" name="petMap['b'].petType">
    </p>
    <p>
        <input type="submit" value="提交"/>
    </p>
</form>

</body>
</html>
