<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
body{
background-color:Grey;
}
h1{
color:white;
}
h4{
color:Purple;
}
h5{
color:Yellow;
}
</style>
</head>
<body>
<div class="container">
<h1>Your Bill is...</h1>
<% double total=(double)request.getAttribute("originalAmt");
double finalAmt=(double)request.getAttribute("finalAmt");
String membership=(String)request.getAttribute("membership");

%>
<%
if(membership.equals("Prime")){%>

<h1>Original Amount is <%=total%></h1>
<br>
<h1>Final Amount With GST is <%=finalAmt%></h1>
 <h5>Thank You...!!!</h5>
<%}else{ %>
   <h1>Original Amount is <%=total%></h1>
   <br>
   <h1>Final Amount With RS:40 Delivery Charges is <%=finalAmt %></h1>
   <h4>*NOTE: To avoid Delivery charges take prime membership*</h4>
   <h5>Thank You...!!!</h5>
   <%}%>




</div>

</body>
</html>