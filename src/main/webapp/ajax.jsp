<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
  <script src="js/jquery.min.js"></script>
  <script>
    $(function (){
        $("#btn").click(function(){
            //$.get(url,[data],[callback],[type])
            $.get("testJson.do",{"username":"李北群","age":18},function(data){
                console.log(data)
            })
        })
    })
  </script>
</head>
<body>
  <input id="btn" type="submit" value="testJSON">
</body>
</html>