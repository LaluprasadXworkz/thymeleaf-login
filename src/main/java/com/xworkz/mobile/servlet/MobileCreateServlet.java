package com.xworkz.mobile.servlet;

import com.xworkz.mobile.entity.MobileEntity;
import com.xworkz.mobile.service.MobileService;
import com.xworkz.mobile.service.impl.MobileServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/mobileCreate")
public class MobileCreateServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/createMobile.jsp");
        requestDispatcher.forward(req, resp);
    }
//    mid, M_name, pnumber, price, showRoomName

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        MobileEntity entity=new MobileEntity();
        MobileService service=new MobileServiceImpl();
        entity.setMobileName(req.getParameter("mobileName"));
        entity.setPNumber(Long.parseLong(req.getParameter("phoneNumber")));
        entity.setPrice(Integer.parseInt(req.getParameter("mPrice")));
        entity.setShowRoomName(req.getParameter("sRoom"));
        service.ValidateSave(entity);

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/createWelcomeMsg.jsp");
        requestDispatcher.forward(req, resp);


    }
}
