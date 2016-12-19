<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ page import="cn.edu.cumt.ec.entity.Items"%>
<%@ page import="cn.edu.cumt.ec.dao.ItemsDAO"%>
<%@ page import="java.util.ArrayList"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>采购录入</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta name="keywords" content="jquery,ui,easy,easyui,web">
	<meta name="description" content="easyui help you build your web page easily!">
	<title>jQuery EasyUI Demo</title>
	<link rel="stylesheet" type="text/css" href="http://www.w3cschool.cc/try/jeasyui/themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="http://www.w3cschool.cc/try/jeasyui/themes/icon.css">
	<script type="text/javascript" src="http://code.jquery.com/jquery-1.4.4.min.js"></script>
	<script type="text/javascript" src="http://www.w3cschool.cc/try/jeasyui/jquery.easyui.min.js"></script>
</head>
<body>
<h1>请录入今日采购消息</h1>

<form action="CAIGOU" method="get">
	<table id="tt"  style="width:1200px;height:250px"
			title="后台管理" 
			toolbar="#tb">
		<thead>
			<tr>
				<th  width="80">产品名称</th>
				<th  width="80">进货数量</th>
				<th width="80" align="center">进货单价</th>
				
				
			</tr>
			<tr>
				<td  width="80">
				<input class="easyui-textbox" name="SCMC" data-options="prompt:'请注意商品ID为主键不可重复！'" style="width:100%;height:35px">
				</td>
				<td  width="80">
				<input class="easyui-textbox" name="JHSL" style="width:100%;height:35px">
				</td>
				<td  width="80" align="right">
				<input class="easyui-textbox" name="JHDJ" style="width:100%;height:35px">
				</td>
				
			</tr>
			
		</thead>
	</table>
	<div id="tb">
	<input type="submit" value="录入">
	</div>
	</form>
	 
	
	
	
</body>
</html>