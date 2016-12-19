<%@ page language="java" contentType="text/html; charset=utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>添加留言</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta name="keywords" content="jquery,ui,easy,easyui,web">
	<meta name="description" content="easyui help you build your web page easily!">
	<title>jQuery EasyUI Demo</title>
	<link rel="stylesheet" type="text/css" href="http://www.w3cschool.cc/try/jeasyui/themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="http://www.w3cschool.cc/try/jeasyui/themes/icon.css">
	<script type="text/javascript" src="http://code.jquery.com/jquery-1.4.4.min.js"></script>
	<script type="text/javascript" src="http://www.w3cschool.cc/try/jeasyui/jquery.easyui.min.js"></script>
	<link rel="stylesheet" href="css/style2.css"/>
    <script type="text/javascript" src="js/script2.js"></script>
</head>
<body>
    <h1>留言板</h1>
<h2>添加留言</h2>
<form action="LIUYAN" method="get">
        留言人：<input class="easyui-textbox" name="ygid" style="width:100%;height:35px">
	请输入留言：<input class="easyui-textbox" name="lynr" style="width:100%;height:35px">
	留言时间：<input class="easyui-textbox" name="lysj" style="width:100%;height:35px">
	<input  type="hidden" class="easyui-textbox" name="sfcl" value="no" style="width:100%;height:35px">

	<div id="tb">
	<input type="submit" value="提交" align="right">
	</div>
	</form>
</body>