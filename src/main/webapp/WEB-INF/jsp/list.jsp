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
    <title>博客列表页</title>
    <%@include file="../common/head.jsp" %>
</head>
<body>

    <!-- 页面显示部分-->
    <div class="container">
        <div class="panel panel-default text-center">
            <div class="panel-heading">
                <h2>博客列表</h2>
            </div>
            <div class="panel-body">
                <table class="table table-hover">
                    <thead>
                        <tr>
                            <td>编号</td>
                            <td>题目</td>
                            <td>类别编号</td>
                            <td>创建时间</td>
                            <td></td>
                        </tr>
                    </thead>
                    <tbody>
                    <c:forEach var="bl" items="${list}">
                        <tr>
                            <td>${bl.id}</td>
                            <td>${bl.title}</td>
                            <td>${bl.cateId}</td>
                            <td>
                                <fmt:formatDate value="${bl.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/>
                            </td>
                            <td>
                                <a href="/blog/${bl.id}/article" class="btn btn-info" target="_blank">详情</a>
                            </td>
                            <td>
                                <a href="/blog/${bl.id}/modifyBlog" class="btn btn-info" target="_blank">修改</a>
                            </td>
                            <td>
                                <a href="/blog/${bl.id}/delete" class="btn btn-info" target="_blank">删除</a>
                            </td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </div>
            <div>
                <a href="/blog/addBlog" class="btn btn-info" target="_blank">添加</a>
            </div>
        </div>
    </div>

</body>

<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>

<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>

</html>
