<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ page import="cn.edu.cumt.ec.entity.Kcproducts"%>
<%@ page import="cn.edu.cumt.ec.dao.KKXQDAO"%>
<%@ page import="cn.edu.cumt.ec.dao.MassagesDaoJDBCImpl" %>
<%@ page import="java.util.ArrayList"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>¿â´æÏêÇé</title>
<link rel="stylesheet" href="css/style2.css"/>
    <script type="text/javascript" src="js/script2.js"></script>
</head>
<body>
<h1>¿â´æÏêÇé</h1>



 <table id="cartTable">
    <thead>
        <tr>
            <th width="80">²úÆ·Ãû³Æ</th>
            
            <th width="80">×Ü¼Æ</th>
           
            
        </tr>
    </thead></table>
 <!-- ÉÌÆ·Ñ­»·¿ªÊ¼ -->
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
            
            <td class="price" width="80"><%=massages.getZj() %></td>
             
            
        </tr>
     
        <tr>
        
</table>
          <!-- ÉÌÆ·Ñ­»·½áÊø -->
        
          <%
                   }
              } 
          %>
          
</body>
</html>