<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ page import="cn.edu.cumt.ec.entity.Items"%>
<%@ page import="cn.edu.cumt.ec.dao.ItemsDAO"%>
<%@ page import="java.util.ArrayList"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>添加食材</title>
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
<h1>食材管理</h1>
<h2>添加食材</h2>
<a href="scsc">删除食材</a>&nbsp;&nbsp;&nbsp;&nbsp;
<form action="addItem" method="get">
	<table id="tt"  style="width:1200px;height:250px"
			title="后台管理" 
			toolbar="#tb">
		<thead>
			<tr>
				<th  width="80">产品名称</th>
				<th  width="80">安全库存</th>
				<th width="80" align="center">保质期</th>
				<th width="80" align="center">保质期预警</th>
				
			</tr>
			<tr>
				<td  width="80">
				<input class="easyui-textbox" name="SCMC" data-options="prompt:'请注意商品ID为主键不可重复！'" style="width:100%;height:35px">
				</td>
				<td  width="80">
				<input class="easyui-textbox" name="AQKC" style="width:100%;height:35px">
				</td>
				<td  width="80" align="right">
				<input class="easyui-textbox" name="BZQ" style="width:100%;height:35px">
				</td>
				<td  width="80" align="center">
				<input class="easyui-textbox" name="YJ" style="width:100%;height:35px">
				</td>
			</tr>
			
		</thead>
	</table>
	<div id="tb">
	<input type="submit" value="上架" align="right">
	</div>
	</form>
	 <table id="cartTable">
    <thead>
        <tr>
            <th width="80">食材名称</th>
            <th width="80">安全库存</th>
            <th width="80">保质期</th>
        </tr>
    </thead></table>
 <!-- 商品循环开始 -->
          <%  
              
               ItemsDAO itemsDao = new ItemsDAO(); 
               ArrayList<Items> list = itemsDao.getAllItems();
               if(list!=null&&list.size()>0)
               {
	               for(int i=0;i<list.size();i++)
	               {
	                  Items item = list.get(i);
           %>   
      <table id="cartTable">    
    
        <tr>
            <td class="price" width="80"><%=item.getSCMC() %></td>
            <td class="price" width="80"><%=item.getAQKC() %></td>
            <td class="price" width="80"><%=item.getBZQ() %></td>
        </tr>
      
</table>
          <!-- 商品循环结束 -->
        
          <%
                   }
              } 
          %>
          
	
	
</body>
</html>