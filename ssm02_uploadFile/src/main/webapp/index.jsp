<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<style>
    .progress {
        width: 400px;
        height: 10px;
        border: 1px solid #ccc;
        border-radius: 10px;
        margin: 10px 0px;
        overflow: hidden;
    }
    /* 初始状态设置进度条宽度为0px */
    .progress > div {
        width: 0px;
        height: 100%;
        background-color: yellowgreen;
        transition: all .3s ease;
    }
</style>
<script type="text/javascript" src="static/js/jquery.min.js"></script>
<script type="text/javascript">
    $(function(){
        $("#uploadFile").click(function(){
            //获取要上传的文件
            var photoFile = $("#photo")[0].files[0];
            if (photoFile == undefined){
                alert("请重新上传图片")
                return;//后面的不用再执行
            }
            //将文件装入formData对象
            var formdata = new FormData();
            formdata.append("headPhoto",photoFile)
            //ajax向后台发送文件
            //$.ajax({url: url,data: data,success: callback,dataType: json});
            $.ajax(({
                type:"post",
                data:formdata,
                url:"fileUpload.do",
                processData:false,//默认值是为true，但是设置为true的时候，jquery 会将数据序列化；当processData: false的时候，jquery不会对数据进行处理。
                contentType:false,//为了避免 JQuery 的其他操作，从而失去分界符，而使服务器不能正常解析文件
                success:function(result){
                    alert(result.message);
                    //图片上传成功，回显
                    $("#headImg").attr("src","http://localhost:8090/upload/"+result.newFileName);
                    $("#photoinput").val(result.newFileName);
                    $("#filetypeinput").val(result.filetype);
                },
                xhr: function() {
                    var xhr = new XMLHttpRequest();
                    //使用XMLHttpRequest.upload监听上传过程，注册progress事件，打印回调函数中的event事件
                    xhr.upload.addEventListener('progress', function (e) {
                        console.log(e);
                        //loaded代表上传了多少
                        //total代表总数为多少
                        var progressRate = (e.loaded / e.total) * 100 + '%';

                        //通过设置进度条的宽度达到效果
                        $('.progress > div').css('width', progressRate);
                    })

                    return xhr;
                }
            }))

        })
    })
</script>
<body>
<form action="addPlayer" method="get">
    <p>
        账号：<input type="text" name="name">
    </p>
    <p>
        密码：<input type="password" name="password">
    </p>
    <p>
        昵称：<input type="text" name="nickname">
    </p>
    <p>
        头像
    </p>
    <p>
<%--图片回显--%>
        <img id="headImg" style="width: 400px;height: 200px" alt="你还未上传图片">
    </p>
    <div class="progress">
        <div></div>
    </div>
    <p>
        <input id="photo" type="file" >
        <a id="uploadFile" href="javascript:void(0)">立即上传</a>
    </p>
<%--    隐藏的input元素解决表单提交问题--%>
    <input type="hidden" name="photo" id="photoinput">
    <input type="hidden" name="filetype" id="filetypeinput">
    <p>
        <input type="submit" value="注册">
    </p>

</form>

</body>
</html>
