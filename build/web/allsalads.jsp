<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
              <link href = "//maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css" rel = "stylesheet">   
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>All salads</title>
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
            <td><a href="saladinfo.jsp">salad Info</a></td>
            <td><a href="${pageContext.request.contextPath}/Allsalads">All Salads</a></td>            
        </table>
        <br />
        <h3>List of Salads</h3>
        <br />
        <table border="1">
            <th>Salad ID</th>
            <th>Salad Name</th>
            <th>Salad Price</th>
            <c:forEach items="${requestScope.list}" var="salad">
                <tr>
                    <td><a href="${pageContext.request.contextPath}/GetSalad?id=${salad.saladId}">${salad.saladId}</a></td>
                    <td>${salad.saladname}</td>
                    <td>${salad.saladPrice}</td>
<!--                    <TD> <a href="${pageContext.request.contextPath}/GetSalad?salad_id=${salad.saladId}">${salad.saladId}Update</a> </td>
            <TD> <a href="${pageContext.request.contextPath}/GetSalad?salad_id=${salad.saladId}">${salad.saladId}Delete</a> </TD>
      -->
                </tr>
            </c:forEach>            
        </table>
    </body>
</html>
