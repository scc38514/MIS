<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ page import="cn.edu.cumt.ec.entity.Kcproducts"%>
<%@ page import="cn.edu.cumt.ec.dao.KKXQDAO"%>
<%@ page import="cn.edu.cumt.ec.dao.MassagesDaoJDBCImpl" %>
<%@ page import="java.util.ArrayList"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>库存详情</title>
<link rel="stylesheet" href="css/style2.css"/>
    <script type="text/javascript" src="js/script2.js"></script>
</head>
<body>
<h1>库存详情</h1>



 <table id="cartTable">
    <thead>
        <tr>
            <th width="80">产品名称</th>
            <th width="80">一食堂</th>
            <th width="80">二食堂</th>
            <th width="80">三食堂</th>
            <th width="80">总计</th>
           
            
        </tr>
    </thead></table>
 <!-- 商品循环开始 -->
         <%  
              
               KKXQDAO messageDao = new KKXQDAO(); 
               ArrayList<Kcproducts> list = messageDao.getAllMessage();
               if(list!=null&&list.size()>0)
               {
	               for(int i=0;i<list.size();i++)
	               {
	            	   Kcproducts massages = list.get(i);
           %>   
      <table id="cartTable">    
   
            <td class="price" width="80"><%=massages.getCpmc() %></td>
            <td class="price" width="80"><%=massages.getKc1() %></td>
            <td class="price" width="80"><%=massages.getKc2() %></td>
            <td class="price" width="80"><%=massages.getKc3() %></td>
            <td class="price" width="80"><%=massages.getZj() %></td>
             
            
        </tr>
     
        <tr>
        
</table>
          <!-- 商品循环结束 -->
        
          <%
                   }
              } 
          %>
          
</body>
</html>