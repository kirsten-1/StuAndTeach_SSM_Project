
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form action="testRest/10" method="POST">
    <input type="hidden" name="_method" value="PUT">
    <input type="submit" value="PUT">
</form>
<form action="testRest/10" method="POST">
    <input type="hidden" name="_method" value="DELETE">
    <input type="submit" value="DELETE">
</form>
  <form action="testRest/10" method="get">
      <input type="submit" value="GET">
  </form>
  <form action="testRest/10" method="post">
      <input type="submit" value="POST">
  </form>
</body>
</html>
