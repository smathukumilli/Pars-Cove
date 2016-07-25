<%-- 
    Document   : veginfo
    Created on : Jun 23, 2016, 6:19:09 PM
    Author     : shanmukh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
           <link href = "//maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css" rel = "stylesheet">

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Vegetarian Items  Page</title>
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
         </div>
        </nav>
    </nav>
       <table border="1">
            <td><a href="veginfo.jsp">Vegetarian Items Info</a></td>
            <td><a href="${pageContext.request.contextPath}/AllVegs">All Vegetarian Items</a></td>            
        </table>
        <br />

        <form action="${pageContext.request.contextPath}/VegServlet" method="POST">
            <table>
                <tr>
                    <td>Vegetarian Item ID:</td>
                    <td><input type="text" name="id" value="${veg.vegID}"/></td>
                </tr>
                <tr>
                    <td>Vegetarian Item Name:</td>
                    <td><input type="text" name="name" value="${veg.name}"/></td>
                </tr>
                <tr>
                    <td>Vegetarian Item Price</td>
                    <td><input type="text" name="price" value="${veg.price}" /></td>
                </tr>
                <tr>
                    <td colspan="2"><input type="Submit" name="operation" value="Add" />
                    <input type="Submit" name="operation" value="Edit" />
                    <input type="Submit" name="operation" value="Delete" />
                    <input type="Submit" name="operation" value="Search" /></td>
                </tr>                
            </table>
        </form>
    </body>
</html>