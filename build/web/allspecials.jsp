<%-- 
    Document   : allstudents
    Created on : Aug 22, 2011, 9:51:32 PM
    Author     : bagnes
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
              <link href = "//maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css" rel = "stylesheet">   
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>All specials</title>
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
            <td><a href="specialsinfo.jsp">specials Info</a></td>
            <td><a href="allspecials.jsp">All specials</a></td>            
        </table>
        <br />
        <h3>List of specials</h3>
        <br />
        <table border="1">
            <th>specials ID</th>
            <th>specials Name</th>
            <th>price</th>
            <c:forEach items="${requestScope.list}" var="specials">
                <tr>
                    <td><a href="${pageContext.request.contextPath}/GetSpecials?id=${specials.specialsID}">${specials.specialsID}</a></td>
                    <td>${specials.name}</td>
                    <td>${specials.price}</td>
                </tr>
            </c:forEach>                 
        </table>
    </body>
</html>
