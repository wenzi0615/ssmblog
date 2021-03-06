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
    <title>添加博客</title>
    <%@include file="../common/head.jsp" %>
</head>
<body>

<!-- 页面显示部分-->
<div class="container">
    <div class="panel panel-default">
        <div class="panel-heading text-center">
            <h2>添加新的博客</h2>
        </div>
        <div class="panel-body">
            <br>

            <form class="form-horizontal" role="form" action ="/blog/add_submit" method="post">
                <div class="form-group">
                    <label for="title" class="col-sm-2 control-label">题目</label>
                    <div class="col-sm-5">
                        <input type="text" class="form-control" id="title" name="title" placeholder="请输入题目"/>
                    </div>
                </div>
                <div class="form-group">
                    <label for="content" class="col-sm-2 control-label">内容</label>
                    <div class="col-sm-8">
                        <textarea class="form-control" rows="10" id="content" name="content">请输入博客内容</textarea>
                    </div>
                </div>
                <div class="form-group">
                    <label for="cateId" class="col-sm-2 control-label">类别编号</label>
                    <div class="col-sm-5">
                        <input type="text" class="form-control" id="cateId" name="cateId" placeholder="请输入类别编号"/>
                    </div>
                </div>
                <div class="form-group">
                    <div class="col-sm-offset-2 col-sm-8">
                        <button type="submit" class="btn btn-default">提交</button>
                    </div>
                </div>
            </form>
            <br>
        </div>
    </div>
</div>

</body>

<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>

<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>

</html>
