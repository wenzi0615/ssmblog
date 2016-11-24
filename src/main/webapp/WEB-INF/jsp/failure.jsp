<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@include file="../common/tag.jsp" %>
<!DOCTYPE html>
<!-- 拷贝html模板 -->
<html>
<head>
    <title>Failure</title>
    <%@include file="../common/head.jsp" %>
</head>
<body>

<br><br>
<div class="container">
    <div class="panel panel-default text-center">
        <div class="panel-heading">
            <h2>Failure</h2>
            <a href="/blog/list" class="btn btn-info" target="_blank">返回列表</a>
        </div>
    </div>
</div>
</body>
</html>
