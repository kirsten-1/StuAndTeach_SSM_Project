<%--
  Created by IntelliJ IDEA.
  User: apple
  Date: 2022/11/10
  Time: 20:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<p>
    requestScope message:  ${requestScope.message} uname1:${requestScope.allUser[0].uname}
</p>
<p>
    sessionScope message:  ${sessionScope.message} uname1:${sessionScope.allUser[1].uname}
</p>
<p>
    applicationScope message:  ${applicationScope.message} uname1:${applicationScope.allUser[0].uname}
</p>
</body>
</html>
