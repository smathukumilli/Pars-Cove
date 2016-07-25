<%-- 
    Document   : allchickens
    Created on : Jun 23, 2016, 1:53:46 PM
    Author     : shanmukh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
              <link href = "//maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css" rel = "stylesheet">   
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>All Chickens</title>
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
            <td><a href="chickeninfo.jsp">Chicken Item Info</a></td>
<!--            <td><a href="allchickens.jsp">All Chicken Items</a></td>            -->
        </table>
        <br />
        <h3>List of chicken Items</h3>
        <br />
        <table border="1">
            <th>chicken Item ID</th>
            <th>chicken Item Name</th>
            <th>chicken Item Price</th>
            <c:forEach items="${requestScope.list}" var="chicken">
                <tr>
                    <td><a href="${pageContext.request.contextPath}/GetChicken?id=${chicken.chickenID}">${chicken.chickenID}</a></td>
                    <td>${chicken.name}</td>
                    <td>${chicken.price}</td>
                </tr>
            </c:forEach>                 
        </table>
    </body>
</html>
