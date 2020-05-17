<%@ page language="java" contentType="text/html; charset=utf-8" 
    pageEncoding="utf-8"%>
              <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
                 <%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>  
              
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta http-equiv="content-type" content="text/html; charset=utf-8" />
<title>Insert title here</title>
</head>
<body>
<div class="myclass" style="margin-left:100px;margin-top:100px;margin-right:30px;border:2px solid black"">
<h2 style="text-align:center;">Selected Problems</h2>
 <hr style="height:1px;border:none;color:#333;background-color:#333;">
<table border="2" cellpadding="10" bordercolor="solid black">
<tr>
<th>PID</th>
<th>Content</th>
</tr>
  <c:forEach items="${list}" var="item">
    <tr>
      <td><p>${item.pid }</p></td>
            <td><p>${item.content }</p></td>
     
    </tr>
  </c:forEach>
</table>
</div>
</body>

</html>