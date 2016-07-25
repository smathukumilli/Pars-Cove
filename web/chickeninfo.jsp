<%-- 
    Document   : chickeninfo
    Created on : Jun 23, 2016, 1:53:57 PM
    Author     : shanmukh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
              <link href = "//maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css" rel = "stylesheet">   
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Chicken Item INFO</title>
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
            <td><a href="chickeninfo.jsp">chicken Item Info</a></td>
            <td><a href="${pageContext.request.contextPath}/AllChicken">All chicken Items</a></td>            
        </table>
        <br />

        <form action="${pageContext.request.contextPath}/ChickenServlet" method="POST">
            <table>
                <tr>
                    <td>chicken Item ID:</td>
                    <td><input type="text" name="id" value="${chicken.chickenID}"/></td>
                </tr>
                <tr>
                    <td>Chicken Item Name:</td>
                    <td><input type="text" name="name" value="${chicken.name}"/></td>
                </tr>
                <tr>
                    <td>chicken Item Price</td>
                    <td><input type="text" name="price" value="${chicken.price}" /></td>
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
