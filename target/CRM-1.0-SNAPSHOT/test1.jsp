<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2021/9/27
  Time: 10:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="js/jquery-1.7.2.js"></script>
</head>

    <script>
        $(function (){
            $("#djBtn").click(function (){
                $.ajax({
                    url:"test.do",
                    type:"get",
                    dataType:"json",
                    async:true,
                    /*[{"name":"wangwu","age":22},{"name":"tianmao","age":10}]*/
                    success:function (resp){
                        $.each(resp,function (i,n){
                            $("#id1").html(n.id)
                            $("#name1").html(n.name)
                            $("#age1").html(n.age)
                        })
                    }


                    /*这样返回的是[object Object]，后端返回的是json对象*/
/*                    success:function (resp){
                        alert(resp)
                    }*/
                })
            })

        })

    </script>
<body>
    <button id="djBtn">点击我</button>
    学员1:<br>
    id:<span id="id1"></span><br>
    姓名:<span id="name1"></span><br>
    年龄:<span id="age1"></span><br>


    学员2:<br>
    id:<span id="id2"></span><br>
    姓名:<span id="name2"></span><br>
    年龄:<span id="age2"></span><br>

</body>
</html>
