<%--
  Created by IntelliJ IDEA.
  User: 黄晨
  Date: 2018/8/22
  Time: 9:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

    <script src="js/jquery.min.js"></script>

    <script>

        $(function(){
            $("#btn").click(function(){
                 //alert("hello btn");
                $.ajax({
                    url:"user/testAjax",
                    contentType:"application/json;charset=UTF-8",
                    data:'{"username":"hc","money":8500}',
                    dataType:"json",
                    type:"post",
                    success:function (data) {
                        alert(data.username);
                        alert(data.money);
                    }

                })

            });
        });

      
    </script>
</head>
<body>
<a href="user/testString">testString</a><br>


<a href="user/testVoid">testVoid</a><br>


<a href="user/testModelandView">testModelandView</a><br>


<a href="user/testforwardOrRedicet">testforwardOrRedicet</a><br>



<button id="btn">发送ajax的请求</button>


</body>
</html>
