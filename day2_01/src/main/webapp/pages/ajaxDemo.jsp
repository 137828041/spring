<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="${pageContext.request.contextPath}/js/jquery-3.3.1.js"></script>
    <script >
        $(function () {
            $.ajax({
                 type:'post',
                url:'${pageContext.request.contextPath}/use/test7',
                //dataType:'json',
                contentType:'application/json',
                data:'{"id":"18","username":"吴迪"}',
                success:function (data) {
                    alert(data);
                }
            })
            
        })
    </script>
</head>
<body>

</body>
</html>
