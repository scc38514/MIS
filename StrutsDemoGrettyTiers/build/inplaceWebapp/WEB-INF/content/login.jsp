<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<link rel="stylesheet" type="text/css" href="../../css/themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="../../css/themes/icon.css">
	<link rel="stylesheet" type="text/css" href="../../css/demo.css">
	<script type="text/javascript" src="../../js/jquery.min.js"></script>
	<script type="text/javascript" src="../../js/jquery.easyui.min.js"></script>
</head>
<body>
	<h2>填写信息登录</h2>
	
	<div style="margin:20px 0;"></div>
	<div class="easyui-panel" title="New Topic" style="width:400px">
		<div style="padding:10px 60px 20px 60px">
	    <form id="ff" action ="Loginht" method="post">
	    	<table cellpadding="5">
	    		<tr>
	    			<td>用户名:</td>
	    			<td><input class="easyui-textbox" type="text" name="name" data-options="required:true"></input></td>
	    		</tr>
	    		<tr>
	    			<td>密码:</td>
	    			<td><input class="easyui-textbox" type="text" name="pass" data-options="required:true"></input></td>
	    		</tr>
	    	</table>
	    	 <div style="text-align:center;padding:5px">
	    <input type="submit" key="登陆"/> </form>
	   
	    </div>
	</div>
	
</body>
</html>
