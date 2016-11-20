<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="../common/tag.jsp" %>
<!DOCTYPE html>
<html>
<head>
    <title>Add New Blog</title>
    <%@include file="../common/head.jsp" %>
</head>
<body>

<!-- 页面显示部分-->
<div class="container">
    <div class="panel panel-default text-center">
        <div class="panel-heading">
            <h2>Add New Blog</h2>
        </div>
        <div class="panel-body">
            <form class="form-horizontal">
                <fieldset>
                    <div id="legend" class="">
                        <legend class=""> New Blog</legend>
                    </div>
                    <div class="control-group">

                        <!-- Text input-->
                        <label class="control-label">Text input</label>
                        <div class="controls">
                            <input type="text" placeholder="placeholder" class="input-xlarge">
                            <p class="help-block">Supporting help text</p>
                        </div>
                    </div>



                    <div class="control-group">

                        <!-- Textarea -->
                        <label class="control-label">Textarea</label>
                        <div class="controls">
                            <div class="textarea">
                                <textarea type="" class=""> </textarea>
                            </div>
                        </div>
                    </div>

                    <div class="control-group">

                        <!-- Select Basic -->
                        <label class="control-label">Select - Basic</label>
                        <div class="controls">
                            <select class="input-xlarge">
                                <option>Enter</option>
                                <option>Your</option>
                                <option>Options</option>
                                <option>Here!</option>
                            </select>
                        </div>

                    </div>

                    <div class="control-group">
                        <label class="control-label">Button</label>

                        <!-- Button -->
                        <div class="controls">
                            <button class="btn btn-success">Button</button>
                        </div>
                    </div>

                </fieldset>
            </form>
        </div>
    </div>
</div>

</body>

<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>

<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>

</html>
