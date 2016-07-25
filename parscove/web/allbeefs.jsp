<%-- 
    Document   : allbeefs
    Created on : Jun 23, 2016, 5:14:00 PM
    Author     : shanmukh
--%>
<%@ page import="java.io.*,java.util.*,java.sql.*"%>
<%@ page import="javax.servlet.http.*,javax.servlet.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ page import="java.io.*,java.util.*,java.sql.*"%>
<%@ page import="javax.servlet.http.*,javax.servlet.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>

<html>
<head>
          <link href = "//maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css" rel = "stylesheet">   
<title>Beef Items</title>
</head>
<body>
       <nav class = "jumbotron" role = "navigation">
   
   <div class = "nav-main ">
      <a class = "navbar-brand" href = "#">Parscove</a>
   </div>
  <nav class = "nav navbar-right">
  <div class = "navbar-header">
      <a class = "navbar-brand" href = "test.html">Home</a>
         <a class = "navbar-brand" href = "saladinfo.jsp">Salads</a>
         <a class = "navbar-brand" href = "entrees.html">Entrees</a>
         <a class = "navbar-brand" href = "appetizerinfo.jsp">Appetizers</a>
         <a class = "navbar-brand" href = "spiritsinfo.jsp">spirits</a>
           <a class = "navbar-brand" href = "specialsinfo.jsp">specials</a>
         </div>
        </nav>
    </nav>
      <table border="1">
            <td><a href="beefinfo.jsp">Beef Item Info</a></td>
            <td><a href="allbeefs.jsp">All Beef Items</a></td>            
        </table>
 
   <sql:setDataSource var="snapshot" driver="com.mysql.jdbc.Driver"
     url="jdbc:mysql://localhost/itmd4515"
     user="itmd4515"  password="itmd4515"/>

<sql:query dataSource="${snapshot}" var="result">
SELECT * from Beef;
</sql:query>
 
<table border="1" width="50%">
<tr>
<th>Beef Item ID</th>
<th>Beef Item Name</th>
<th>price</th>

</tr>
<c:forEach var="row" items="${result.rows}">
<tr>
    <td><a href="${pageContext.request.contextPath}/GetBeef?id=${row.beefID}">${row.beefID}</a></td>
<td><c:out value="${row.name}"/></td>
<td><c:out value="${row.price}"/></td>

</tr>
</c:forEach>
</table>

</body>
</html>