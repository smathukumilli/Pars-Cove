<%-- 
    Document   : parscovemenu
    Created on : Jun 27, 2016, 2:34:19 PM
    Author     : shanmukh
--%>
<%@ page import="java.io.*,java.util.*,java.sql.*"%>
<%@ page import="javax.servlet.http.*,javax.servlet.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href = "//maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css" rel = "stylesheet">
        <title>Parscove Menu page</title>
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
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
        <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>

        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
        <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
        <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>

        <style>
            a{
                color: red;
                font-size: large; 
            }
            a:hover{
                background: #5b4282;
                color: white;
                font-style: normal;

            }
            #group {width:50%}
            ul {list-style:  square;
            }
            ul li {
                border-bottom: 1px dotted #000;
                text-align: right;
            }
            span.name{
                float: left;
            }
            span {
                margin: 0 0 -1px 0;
            }


        </style>

    </head>
    <body>
        <div class="w3-container" style="  border-bottom:solid 1px gainsboro;">

            <a class = "navbar-brand" href = "#">logo</a>
            <nav class = "w3-container" role = "navigation">

                <nav class = "nav navbar-right">
                       <div class = "navbar-header">
                        <a  class = "glyphicon glyphicon-home navbar-brand" href = "test.html">Home</a>
                        <a style="font-size: medium;" class = "navbar-brand" href = "aboutus.html">About Us</a>

                        <a style="font-size: medium;" class = "glyphicon glyphicon-cutlery navbar-brand" href = "parscovemenu.jsp">Menu</a>
                        <a style="font-size: medium;" class = "navbar-brand" href = "parties.html">Parties/Functions</a>
                        <a style="font-size: medium;" class = "glyphicon glyphicon-earphone navbar-brand" href = "contactus.html">Contact us</a>  
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
             <sql:query dataSource="${snapshot}" var="specials">
            SELECT * from specials;
        </sql:query>

        <img style=" width: 100%; height: 10%;" src="img_fjords.jpg" alt=""/>
        <div style="margin: 10px 320px;" id="group">
            <!--<div class="container">
              <h3>Tabs With Dropdown Menu</h3>
              <ul class="nav nav-tabs">
                <li class="active"><a href="#section1">MENU</a></li>
                <li><a href="#section2">Appetizers</a></li>
                <li><a href="#section3">Salads</a></li>
                    <li class="dropdown">
                  <a class="dropdown-toggle" data-toggle="dropdown" href="#section4">Entrees<span class="caret"></span></a>
                  
                </li>
                  <li><a href="#">Spirits</a></li>
                      <li><a href="#">Salads</a></li>
              </ul>
            </div>-->

            <div class="container" style=" margin: 1px -28px;">
                <ul class="nav nav-tabs">
                    <li class="active"><a href="parscovemenu.jsp">MENU</a></li>
                    <li><a href="#section2">Appetizers</a></li>
                    <li><a href="#section3">Salads</a></li>
                    <!--    <li class="dropdown">
                          <a class="dropdown-toggle" data-toggle="dropdown" href="#section4">Entrees<span class="caret"></span></a>
                    
                        </li>-->
                    <li class="dropdown">
                        <a class="dropdown-toggle" data-toggle="dropdown" href="#">Entrees <span class="caret"></span></a>
                        <ul class="dropdown-menu">
                            <li><a href="#section41">Vegetarian</a></li>
                            <li><a href="#section42">Chicken</a></li>
                            <li><a href="#section43">lamb</a></li>
                            <li><a href="#section43">Beef</a></li>
                            <li><a href="#section45">Fish</a></li>
                        </ul>
                    </li>
                    <li><a href="#section5">Spirits</a></li>
                              <li><a href="#section6">specials</a></li>
                </ul>
            </div>
            <div id="section1">
                <div id="section2">

                    <table>
                        <tr>
                        <h4 style=" margin-left: 280px;" >Appetizers</h4>
                        </tr>
                        <c:forEach var="row" items="${appetizer.rows}">
                            <tr>
                                <td style="color: peru;"><h4><c:out value="${row.name}"/></h4></td>
                                <td><h4 style=" color: #000;">$<c:out value="${row.price}"/></h4></td>
                            </tr>
                        </c:forEach>
                    </table>
                </div>
                <div id="section3">
                    <table >
                        <tr>
                        <h4 style=" margin-left: 280px;" >Salads</h4>
                        </tr>
                        <c:forEach var="row" items="${salad.rows}">
                            <tr>
                                <td style="color: peru;"><h4><c:out value="${row.Salad_name}"/></h4></td>
                                <td><h4 style=" color: #000;">$<c:out value="${row.salad_price}"/></h4></td>
                            </tr>
                        </c:forEach>
                    </table>
                </div>

             
                <div id="section4">
                    <div id="section41">
                        <table>
                            <tr>
                            <h4  style=" margin-left: 280px;">Entrees</h4>

                            </tr>
                            <tr>
                            <h4>Vegetarian</h4>
                            </tr>
                            <c:forEach var="row" items="${veg.rows}">
                                <tr>

                                    <td><h4 style=" color: navy;"><c:out value="${row.name}"/></h4></td>
                                    <td><h4 style="  margin-left: 400px; color: navy;">$<c:out value="${row.price}"/></h4></td>
                                </tr>
                            </c:forEach>
                        </table>
                    </div>
                    <div id="section42">

                        <table>
                            <tr><h4> chicken</h4></tr>
                            <c:forEach var="row" items="${chicken.rows}">
                                <tr>                     
                                    <td><h4><c:out value="${row.name}"/></td>
                                    <td><h4>$<c:out value="${row.price}"/></td>
                                </tr>
                            </c:forEach>
                        </table>
                    </div>
                    <div id="section43">
                        <table >
                            <tr>
                            <h4>lamb</h4>
                            </tr>
                            <c:forEach var="row" items="${lamb.rows}">
                                <tr>

                                    <td style="color: peru;"><h4><c:out value="${row.name}"/></h4></td>
                                    <td><h4 style=" color: #000;">$<c:out value="${row.price}"/></h4></td>
                                </tr>
                            </c:forEach>
                        </table>
                    </div>
                    <div id="section45">
                        <table >
                            <tr>
                            <h4>fish</h4>
                            </tr>
                            <c:forEach var="row" items="${fish.rows}">
                                <tr>

                                    <td style="color: peru;"><h4><c:out value="${row.name}"/></h4></td>
                                    <td><h4 style=" color: #000;">$<c:out value="${row.price}"/></h4></td>
                                </tr>
                            </c:forEach>
                        </table>
                    </div>
                    <div id="section44">

                        <table >
                            <tr>
                            <h4>Beef</h4>
                            </tr>
                            <c:forEach var="row" items="${beef.rows}">
                                <tr>

                                    <td style="color: peru;"><h4><c:out value="${row.name}"/></h4></td>
                                    <td><h4 style=" color: #000;">$<c:out value="${row.price}"/></h4></td>
                                </tr>
                            </c:forEach>
                        </table>
                    </div>
                </div>
                   <div id="section5">
                    <table>
                        <tr>
                        <h4 style=" margin-left: 280px;">Cocktails</h4>                 
                        </tr>
                        <c:forEach var="row" items="${spirit.rows}">
                            <tr>
                                <td><h4><c:out value="${row.name}"/></td>
                                <td><h4>$<c:out value="${row.price}"/></td>
                            </tr>
                        </c:forEach>
                    </table>
                </div>
                       <div id="section6">

                    <table >
                        <tr>
                        <h4 style="background-color:#483727; text-align:center; color:#fff;
 margin-left: 1px;" >specials</h4>
                        </tr>
                        <c:forEach var="row" items="${specials.rows}">
                            <tr>
                                <td style="color: peru;"><h4><c:out value="${row.name}"/></h4></td>
                                <td><h4 style=" color: #000;">$<c:out value="${row.price}"/></h4></td>
                            </tr>
                        </c:forEach>
                    </table>
                </div>

<!--
                <table class=" table">
                    <th>
                        <ul>
                            <li ><span class="name">Yossi Doeberg</span><span>$23,600</span></li>
                            <li><span class="name">John Doestein</span><span>$23,600</span></li>
                            <li><span class="name">Yankel Bigstein</span><span>$23,600</span></li>
                            <li><span class="name">Yerucham</span><span>$23,600</span></li>
                        </ul></th>                
                </table>-->
            </div>
        </div>

    </body>
</html>
