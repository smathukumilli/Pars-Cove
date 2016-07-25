<%@ page import="java.io.*,java.util.*,java.sql.*"%>
<%@ page import="javax.servlet.http.*,javax.servlet.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>

<html>
    <head>
        <link href = "//maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css" rel = "stylesheet">
        <title>Parscove test page</title>
        <link href = "//maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css" rel = "stylesheet">

        <link rel="shortcut icon" href="/favicon.ico" type="image/x-icon" />

        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="http://www.w3schools.com/lib/w3.css">

        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="http://www.w3schools.com/lib/w3.css">
        <link rel="stylesheet" href="jspstylesheet.css" type="text/css"/>
        <link rel="stylesheet" href="foundation.min.css" type="text/css"/>
        <link rel="stylesheet" href="normalize.css" type="text/css"/>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
        <style>


            .mySlides {display:none}
            .w3-left, .w3-right, .w3-badge {cursor:pointer}
            .w3-badge {height:13px;width:13px;padding:0}
            body {
                background-color: ghostwhite;
            }

            .image { 
                position: absolute; 
                top:0px;
                width: 160%; /* for IE 6 */
            }
            .hr {
                border:none;
                border-top:1px dotted #f00;
                color: red;
                background-color:#fff;
                height:1px;
                width:50%;
            }
            .navbar-float{
                position: fixed;
                margin-left: 150px;
            }
            a:hover{
                background: #5b4282;
                color: white;
                font-style: normal;

            }
            a{
                color: red;
                font-size: large; 
            }
            .table{
                bordercolor:"green";
                border: 15px;
            }
        </style>

        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
        <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
        <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>

        <link href="<c:url value="/resources/css/main.css" />" rel="stylesheet">
        <script src="<c:url value="/resources/js/jquery.1.10.2.min.js" />"></script>
        <script src="<c:url value="/resources/js/main.js" />"></script>
    </head>
    <body>
        <div class="w3-container" >
        
            <a class = "navbar-brand" href = "#">Parscove</a>
            <nav class = "w3-container" role = "navigation">

                <nav style="  border-bottom:solid 2px gainsboro;" class = "nav navbar-right">
                    <div class = "navbar-header">
                        <a  class = "glyphicon glyphicon-home navbar-brand" href = "test.html">Home</a>

                        <a style="font-size: medium;" class = "glyphicon glyphicon-cutlery navbar-brand" href = "menu.jsp">Menu</a>

                        <a style="font-size: medium;" class = "glyphicon glyphicon-earphone navbar-brand" href = "index.html">Contact us</a>  
                    </div>
                </nav>

            </nav>
        </div>
        <sql:setDataSource var="snapshot" driver="com.mysql.jdbc.Driver"
                           url="jdbc:mysql://localhost/itmd4515"
                           user="itmd4515"  password="itmd4515"/>

        <sql:query dataSource="${snapshot}" var="salad">
            SELECT * from Salads;
        </sql:query>
        <sql:query dataSource="${snapshot}" var="veg">
            SELECT * from Veg;
        </sql:query>
        <sql:query dataSource="${snapshot}" var="chicken">
            SELECT * from chicken;
        </sql:query>
        <sql:query dataSource="${snapshot}" var="lamb">
            SELECT * from lamb;
        </sql:query>
        <sql:query dataSource="${snapshot}" var="fish">
            SELECT * from fish;
        </sql:query>
        <sql:query dataSource="${snapshot}" var="spirit">
            SELECT * from spirits;
        </sql:query>
        <sql:query dataSource="${snapshot}" var="beef">
            SELECT * from beef;
        </sql:query>
        <sql:query dataSource="${snapshot}" var="appetizer">
            SELECT * from appetizers;
        </sql:query>
            <div class="menu"  data-spy="scroll" data-target=".navbar" data-offset="50">
            <nav class="navbar navbar-inverse" style=" background-color: #5b4282;  left: 280px; position: fixed; width: 700px; top:30px;">
                <div class="container-fluid">
                    <div class="navbar-header">
                        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                        </button>
                        <a class="navbar-brand" href="#">ParsCove Menu</a>
                    </div>
                    <div>
                        <div class="collapse navbar-collapse" id="myNavbar">
                            <ul class="nav navbar-nav">
                                <li><a href="#section1">Salads</a></li>
                                <li><a href="#section2">Spirits</a></li>
                                <li><a href="#section3">Entrees</a></li>
                                <li><a href="#section4">Appetizers</a></li>
                            </ul>
                        </div>
                    </div>
                </div>
            </nav>
            <div id="section1" class="container-fluid h1">
                <h1>Salads</h1>
                         <table class="fontface" frame="vsides" border="1" width="100%">
                    <tr class="backcol">
                        <th ><h4 class="fontface coltext">Salad Name</h4></th>
                        <th><h4 class="fontface coltext ">Salad Price</h4></th>
                    </tr>
                    <c:forEach var="row" items="${salad.rows}">
                        <tr>
                            <td><h4 style=" color: navy;"><c:out value="${row.Salad_name}"/></h4></td>
                            <td><h4 style=" color: navy;">$<c:out value="${row.salad_price}"/></h4></td>
                        </tr>
                    </c:forEach>
                </table></div>
            <div id="section2" class="container-fluid">
                <h1>Spirits</h1>
                <table class="fontface" style=" border-color: red;" frame="vsides" border="1" width="100%">
                    <tr class="backcol">
                        <th ><h4 class="fontface coltext">Cocktails</h4></th>
                        <th><h4 class="fontface coltext ">Price</h4></th>
                    </tr>
                    <c:forEach var="row" items="${spirit.rows}">
                        <tr>
                            <td><h4 style=" color: navy;"><c:out value="${row.name}"/></h4></td>
                            <td><h4 style=" color: navy;">$<c:out value="${row.price}"/></h4></td>
                        </tr>
                    </c:forEach>
                </table></div>  
            <div id="section3" class="container-fluid h1">
                <h1>Entrees</h1>
                <table class="fontface" style=" border-color: red;" frame="vsides" border="1" width="100%">
                    <tr>
                        <!--        <th ><h4 class="fontface coltext">Vegetarian</h4></th>-->
                        <!--        <th><h4 class="fontface coltext ">Salad Price</h4></th>-->
                    </tr>
                    <c:forEach var="row" items="${veg.rows}">
                        <tr>
                        <h1>Vegetarian</h1>
                        <td><h4 style=" color: navy;"><c:out value="${row.name}"/></h4></td>
                        <td><h4 style=" color: navy;">$<c:out value="${row.price}"/></h4></td>
                        </tr>
                    </c:forEach>
                </table></div>
            





            <div id="section4" class="container-fluid h1">
                <h1>Appetizers</h1>
                <table class="fontface" style=" border-color: red;" frame="vsides" border="1" width="100%">
                    <tr class="backcol">
                        <th ><h4 class="fontface coltext">Appetizer</h4></th>
                        <th><h4 class="fontface coltext "> Price</h4></th>
                    </tr>
                    <c:forEach var="row" items="${appetizer.rows}">
                        <tr>
                            <td><h4 style=" color: navy;"><c:out value="${row.name}"/></h4></td>
                            <td><h4 style=" color: navy;">$<c:out value="${row.price}"/></h4></td>
                        </tr>
                    </c:forEach>
                </table></div>
        </div>
<!--            <div>
                <h1 style=" margin: 300px 52px;">hi</h1>
            </div>-->
<!--
    <div class="fb-follow" data-href="https://www.facebook.com/profile.php?id=100011473429976" data-layout="standard" data-show-faces="true"></div>
    <div>
        <a href="http://www.facebook.com/" style="margin: 90px 1000px; ">facebook</a>
    </div>-->
<div style="margin: 150px 30px; " class="container">
  <h3>ParsCove Menu</h3>
  <div class="row">
    
    <div class="col-md-3">
      <ul class="nav nav-pills nav-stacked">
        <li><a href="#section1">Salads</a></li>
        <li><a href="#section2">Spirits </a></li>
        <li><a href="#section3">Entrees</a></li>
        <li><a href="#section4">Appetizers</a></li>
      </ul>
    </div>
    <div class="clearfix visible-lg"></div>
  </div>
</div>


</body>
</html>