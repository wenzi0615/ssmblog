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
    <title>博客详情</title>
    <%@include file="../common/head.jsp" %>
</head>
<body>

<!-- 页面显示部分-->
<div class="container">
    <div class="panel panel-default text-center">
        <div class="panel-heading">
            <h2>${blog.title}</h2>
        </div>
        <div class="panel-body">
            <br>
            <table class="table table-hover">
                <tbody>
                    <tr>
                        <td>编号</td>
                        <td>${blog.id}</td>
                    </tr>
                    <tr>
                        <td>题目</td>
                        <td>${blog.title}</td>
                    </tr>
                    <tr>
                        <td>内容</td>
                        <td>${blog.content}</td>
                    </tr>
                    <tr>
                        <td>类别编号</td>
                        <td>${blog.cateId}</td>
                    </tr>
                    <trs>
                        <td>创建时间</td>
                        <td>
                            <fmt:formatDate value="${blog.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/>
                        </td>
                    </trs>
                </tbody>
            </table>
        </div>
    </div>
</div>

</body>

<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>

<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>

</html>
