<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ page import="cn.edu.cumt.ec.entity.product"%>
<%@ page import="cn.edu.cumt.ec.dao.CGXXDAO"%>
<%@ page import="cn.edu.cumt.ec.dao.MassagesDaoJDBCImpl" %>
<%@ page import="java.util.ArrayList"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>采购详情</title>
<link rel="stylesheet" href="css/style2.css"/>
    <script type="text/javascript" src="js/script2.js"></script>
</head>
<body>
<h1>采购详情</h1>



 <table id="cartTable">
    <thead>
        <tr>
            <th width="80">产品名称</th>
            <th width="80">进货数量</th>
            <th width="80">进货单价</th>
           
            
        </tr>
    </thead></table>
 <!-- 商品循环开始 -->
         <%  
              
               CGXXDAO messageDao = new CGXXDAO(); 
               ArrayList<product> list = messageDao.getAllMessage();
               if(list!=null&&list.size()>0)
               {
	               for(int i=0;i<list.size();i++)
	               {
	                  product massages = list.get(i);
           %>   
      <table id="cartTable">    
   
            <td class="price" width="80"><%=massages.getSCMC() %></td>
            <td class="price" width="80"><%=massages.getJHSL() %></td>
            <td class="price" width="80"><%=massages.getJHDJ() %></td>
            
             
            
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