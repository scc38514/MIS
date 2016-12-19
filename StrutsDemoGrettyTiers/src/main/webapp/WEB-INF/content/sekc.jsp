<%@ page language="java" contentType="text/html; charset=utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table id="cartTable">
    <thead>
        <tr>
            <th width="80">商品名称</th>
            <th width="80">食堂一库存</th>
            <th width="80">食堂二库存</th>
            <th width="80">食堂三库存</th>
            <th width="80">总计</th>          
        </tr>
    </thead>
    <tr>
            <td class="price" width="80">${session.cpmc}</td>
            <td class="price" width="80">${session.kc1}</td>
            <td class="price" width="80">${session.kc2 }</td>
            <td class="price" width="80">${session.kc3}</td>
            <td class="price" width="80">${session.zj}</td>
        </tr>
    </table> 
</body>
</html>