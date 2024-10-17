<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>User List</title>

    <style>

    table {
      font-family: arial, sans-serif;
      width: 100%;
    }

    td, th {
      border: 1px solid #dddddd;
      text-align: left;
      padding: 8px;
    }

    tr:nth-child(even) {
      background-color: #dddddd;
    }
    </style>
</head>
<body>
    <a href="index.jsp">Home</a>
    <h2>List Of Mobiles</h2>
    <table border="1">
    <!-- mid, M_name, pnumber, price, showRoomName -->
            <tr>
                <th>Sr No</th>
                <th>Mobile Name</th>
                <th>Phone Number</th>
                <th>Price</th>
                <th>Show Room Name</th>
                <th>Action</th>
            </tr>
            <c:forEach var="list" items="${mobile}">
                <tr>
                    <td>${list.getId()}</td>
                    <td>${list.getMobileName()}</td>
                    <td>${list.getPNumber()}</td>
                    <td>${list.getPrice()}</td>
                    <td>${list.getShowRoomName()}</td>
                    <td><a href="update?mid=${list.getId()}">Update</a>/
                    <a href="delete?id=${list.getId()}">Delete</a></td>
                </tr>
            </c:forEach>
    </table>
</body>
</html>
