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
import java.util.List;


@WebServlet(urlPatterns = "/mobileRead",loadOnStartup = +5)
public class MobileReadServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        MobileService service=new MobileServiceImpl();
        List<MobileEntity> list =service.ValidateGetAllMobile();
        req.setAttribute("mobile",list);
        RequestDispatcher requestDispatcher=req.getRequestDispatcher("/readMobile.jsp");
        requestDispatcher.forward(req,resp);
    }
}
