<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="yellow">
<div align=center>
<h1>Bid Submitted</h1>
<p>Your bid is now active. If your bid is successful, you will be notified within 24 hours of the close of bidding.</p>
<table border="5">
   <tr bgcolor="black">
   <%
    String iname=(String)request.getAttribute("item_n");
   %>
      <td style="text-align:center;color:white">
         <%=iname%>
      </td>
   </tr>   
 
   <tr>
    <%
    String iid=(String)request.getAttribute("item_i");
    %>
    <td style="text-align:center" >Item ID:
         <%=iid%>
    </td>
  </tr>   
  
  <tr>
   <%
    String name=(String)request.getAttribute("n");
   %>
   <td style="text-align:center">Name:
        <%=name%>
    </td>
  </tr>   
  

  <tr>
   <%
    String email=(String)request.getAttribute("email");
   %>
    <td style="text-align:center">Email Address:
       <%=email%>
    </td>
  </tr> 
   
  <tr>
   <%
    String amount=(String)request.getAttribute("amt");
   %>
    <td style="text-align:center">Bid price:Rs
         <%=amount%>
    </td>
 </tr>   
 
  <tr>
   <%
    String autoincrement=(String)request.getAttribute("auto");
   %>
    <td style="text-align:center">Auto-increment price:
    <%=autoincrement%>
    </td>
 </tr>   
 
  
</table>
</div>
</body>
</html>