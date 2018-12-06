<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>

<html>
<head>
<title>Категории</title>
<style>
   select {
    width: 200px;
     height: 200px;
   }
   td{
     padding:10px 10px 10px 10px;}

  </style>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</head>



<body>

        <div class="container">
          <div class="navbar">
            <div class="navbar-inner">


                <table border="0">
                    <tr>
                        <td>
                            <a href="/">Транзакции
                            </a>

                        </td>
                         <td>

                            <a href="/category">Категории
                             </a>
                         </td>
                    </tr>


            </div>
          </div>

    <tr align="center">
    <td>
          <div class="container">
          <form id="messageForm" action="/category" method="post">

            <input type="text" id="name" name="name" value="" placeholder="Название категории..." required />

    </td>
    <td>
                <div class="form-actions">
                  <input type="submit" value="Добавить" />
                </div>
        </td></tr>

    <tr align="center">
    <td>
            <select name="select" size="3" multiple>
            <c:forEach var="cl" items="${listCategory}">
                <option>${cl.name}</option>
            </c:forEach>
             </select>
    </td>
    </tr>
          </form>
        </div>
        </div>
    </table>
  </body>
</html>
