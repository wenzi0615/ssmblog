<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">

<title>System Manager</title>

<!-- Bootstrap core CSS -->
<link href="../../resources/css/bootstrap.css" rel="stylesheet">

<!-- Add custom CSS here -->
<link href="../../resources/css/sb-admin.css" rel="stylesheet">
<link href="../../resources/css/font-awesome.min.css" rel="stylesheet">
</head>

<body>

	<div id="wrapper">

		<!-- Sidebar -->
		<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
		<!-- Brand and toggle get grouped for better mobile display -->
		<div class="navbar-header">
			<button type="button" class="navbar-toggle" data-toggle="collapse"
				data-target=".navbar-ex1-collapse">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="manager.jsp">System Manager</a>
		</div>

		<!-- Collect the nav links, forms, and other content for toggling -->
		<div class="collapse navbar-collapse navbar-ex1-collapse">
			<ul class="nav navbar-nav side-nav">
				<li class="active"><a href="blank-page.html"><i
						class="fa fa-home"></i> Home</a></li>
				<li><a href="charts.html"><i class="fa fa-user"></i>
						Profile</a></li>
				<li><a href="tables.html"><i class="fa fa-list-alt"></i>
						All the Blogs</a></li>
				<li class="dropdown"><a href="blogManager" class="dropdown-toggle"
					data-toggle="dropdown"><i class="fa fa-cogs"></i>
						Blog Manager <b class="caret"></b> </a>
					<ul class="dropdown-menu">
						<li><a href="list">List Blogs</a></li>
						<li><a href="addBlog">Add Blog</a></li>
						<li><a href="#">Delete Blog</a></li>
						<li><a href="#">Modify Blog</a></li>

					</ul>
				</li>
				<li><a href="home"><i class="fa fa-arrow-left"></i>
						Return to Blog</a></li>
			</ul>

			<ul class="nav navbar-nav navbar-right navbar-user">
				<li class="dropdown messages-dropdown"><a href="#"
					class="dropdown-toggle" data-toggle="dropdown"><i
						class="fa fa-envelope"></i> Messages <span class="badge">7</span>
						<b class="caret"></b> </a>
					<ul class="dropdown-menu">
						<li class="dropdown-header">7 New Messages</li>
						<li class="message-preview"><a href="#"> <span
								class="avatar"><img src="http://placehold.it/50x50">
							</span> <span class="name">John Smith:</span> <span class="message">Hey
									there, I wanted to ask you something...</span> <span class="time"><i
									class="fa fa-clock-o"></i> 4:34 PM</span> </a>
						</li>
						<li class="divider"></li>
						<li class="message-preview"><a href="#"> <span
								class="avatar"><img src="http://placehold.it/50x50">
							</span> <span class="name">John Smith:</span> <span class="message">Hey
									there, I wanted to ask you something...</span> <span class="time"><i
									class="fa fa-clock-o"></i> 4:34 PM</span> </a>
						</li>
						<li class="divider"></li>
						<li class="message-preview"><a href="#"> <span
								class="avatar"><img src="http://placehold.it/50x50">
							</span> <span class="name">John Smith:</span> <span class="message">Hey
									there, I wanted to ask you something...</span> <span class="time"><i
									class="fa fa-clock-o"></i> 4:34 PM</span> </a>
						</li>
						<li class="divider"></li>
						<li><a href="#">View Inbox <span class="badge">7</span> </a>
						</li>
					</ul>
				</li>
				<li class="dropdown alerts-dropdown"><a href="#"
					class="dropdown-toggle" data-toggle="dropdown"><i
						class="fa fa-bell"></i> Alerts <span class="badge">3</span> <b
						class="caret"></b> </a>
					<ul class="dropdown-menu">
						<li><a href="#">Default <span class="label label-default">Default</span>
						</a></li>
						<li><a href="#">Primary <span class="label label-primary">Primary</span>
						</a></li>
						<li><a href="#">Success <span class="label label-success">Success</span>
						</a></li>
						<li><a href="#">Info <span class="label label-info">Info</span>
						</a></li>
						<li><a href="#">Warning <span class="label label-warning">Warning</span>
						</a></li>
						<li><a href="#">Danger <span class="label label-danger">Danger</span>
						</a></li>
						<li class="divider"></li>
						<li><a href="#">View All</a></li>
					</ul>
				</li>
				<li class="dropdown user-dropdown"><a href="#"
					class="dropdown-toggle" data-toggle="dropdown"><i
						class="fa fa-user"></i> John Smith <b class="caret"></b> </a>
					<ul class="dropdown-menu">
						<li><a href="#"><i class="fa fa-user"></i> Profile</a></li>
						<li><a href="#"><i class="fa fa-envelope"></i> Inbox <span
								class="badge">7</span> </a></li>
						<li><a href="#"><i class="fa fa-gear"></i> Settings</a></li>
						<li class="divider"></li>
						<li><a href="#"><i class="fa fa-power-off"></i> Log Out</a></li>
					</ul>
				</li>
			</ul>
		</div>
		<!-- /.navbar-collapse --> </nav>

		<div id="page-wrapper">

			<div class="row">
				<div class="col-lg-12">
					<h1>
						Welcome to the System Management page! <small>A Helpful Guide.</small>
					</h1>
					<br/>
					<br/>
					<ol class="breadcrumb">
						<li><a href="index.html"><i class="icon-dashboard"></i>
							Profile</a></li>
						<li class="active"><i class="icon-file-alt"></i>  Personal Profile</li>
					</ol>
					<ol class="breadcrumb">
						<li><a href="list"><i class="icon-dashboard"></i>
							List</a></li>
						<li class="active"><i class="icon-file-alt"></i> Blog List</li>
					</ol>
					<ol class="breadcrumb">
						<li><a href="blogManager"><i class="icon-dashboard"></i>
							Blog Manager</a></li>
						<li class="active"><i class="icon-file-alt"></i> Blog Manager</li>
					</ol>

				</div>
			</div>
			<!-- /.row -->

		</div>
		<!-- /#page-wrapper -->

	</div>
	<!-- /#wrapper -->

	<!-- JavaScript -->
	<script src="../../resources/script/jquery-1.10.2.js"></script>
	<script src="../../resources/script/bootstrap.js"></script>

</body>
</html>