<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ page import="cn.edu.cumt.ec.entity.Massages"%>
<%@ page import="cn.edu.cumt.ec.dao.MessageDao"%>
<%@ page import="cn.edu.cumt.ec.dao.MassagesDaoJDBCImpl" %>
<%@ page import="java.util.ArrayList"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>����չʾ</title>
<link rel="stylesheet" href="css/style2.css"/>
    <script type="text/javascript" src="js/script2.js"></script>
</head>
<body>
<h1>���Թ���</h1>



 <table id="cartTable">
    <thead>
        <tr>
            <th width="80">������</th>
            <th width="80">��������</th>
            <th width="80">����ʱ��</th>
            <th width="80">����״̬</th>
           
            
        </tr>
    </thead></table>
 <!-- ��Ʒѭ����ʼ -->
         <%  
              
               MessageDao messageDao = new MessageDao(); 
               ArrayList<Massages> list = messageDao.getAllMessage();
               if(list!=null&&list.size()>0)
               {
	               for(int i=0;i<list.size();i++)
	               {
	                  Massages massages = list.get(i);
           %>   
      <table id="cartTable">    
   
            <td class="price" width="80"><%=massages.getYgid() %></td>
            <td class="price" width="80"><%=massages.getLynr() %></td>
            <td class="price" width="80"><%=massages.getLysj() %></td>
             <td class="price" width="80"><%=massages.getSfcl() %></td>
              
            
        </tr>
     
        <tr>
         
</table>
          <!-- ��Ʒѭ������ -->
        
          <%
                   }
              } 
          %>
          
</body>
</html>