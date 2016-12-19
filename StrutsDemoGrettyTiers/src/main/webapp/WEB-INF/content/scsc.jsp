<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ page import="cn.edu.cumt.ec.entity.Items"%>
<%@ page import="cn.edu.cumt.ec.dao.ItemsDAO"%>
<%@ page import="java.util.ArrayList"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>删除食材</title>
<link rel="stylesheet" href="css/style2.css"/>
    <script type="text/javascript" src="js/script2.js"></script>
</head>
<body>
<h1>食材管理</h1>
<h2>删除食材</h2>
<a href="tianjia">添加食材</a>&nbsp;&nbsp;&nbsp;&nbsp;

 <form action="shanchu" method="post">
	 输入食材名称：
	 <input type="text" name="SCMC"/>
	 <input type="submit" value="删除"/>
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