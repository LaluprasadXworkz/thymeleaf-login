<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<body>
<h2>Fill the Mobile details</h2>
    <form action="mobileCreate" method="post">

        <!-- mid, M_name, pnumber, price, showRoomName -->
        <div>
            <label for="mName">Mobile name</label></td>
            <input type="text" name="mobileName" id="mName">
        </div>
        <br>
        <div>
            <label for="pNumber">Phone Number </label></td>
            <input type="number" name="phoneNumber" id="pNumber">
        </div>
        <br>
        <div>
            <label for="price">Price</label>
            <input type="number" name="mPrice" id="price">
        </div>
        <br>
        <div>
            <label for="sName">Show Room Name</label>
            <input type="text" name="sRoom" id="sName">
        </div>
        <br>
        <div>
            <input type="submit" value="Submit">
        </div>
    </form>
</body>
</html>