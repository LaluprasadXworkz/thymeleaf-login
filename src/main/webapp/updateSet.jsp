<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<body>
<h2>Fill the Mobile details</h2>
    <form action="mobileUpdate" method="post">
           <h2>Update mobile phone details</h2>
        <!-- mid, M_name, pnumber, price, showRoomName -->
        <div>
            <label for="mid">Sr no</label></td>
            <input type="number" name="srNum" value="${entity.getId()}" id="mid">
        </div>
        <br>
        <div>
            <label for="mName">Mobile name</label></td>
            <input type="text" name="mobileName" value="${entity.getMobileName()}" id="mName">
        </div>
        <br>
        <div>
            <label for="pNumber">Phone Number </label></td>
            <input type="number" name="phoneNumber" value="${entity.getPNumber()}" id="pNumber">
        </div>
        <br>
        <div>
            <label for="price">Price</label>
            <input type="number" name="mPrice" value="${entity.getPrice()}" id="price">
        </div>
        <br>
        <div>
            <label for="sName">Show Room Name</label>
            <input type="text" name="sRoom" value="${entity.getShowRoomName()}" id="sName">
        </div>
        <br>
        <div>
            <input type="submit" value="Update">
        </div>
    </form>
</body>
</html>