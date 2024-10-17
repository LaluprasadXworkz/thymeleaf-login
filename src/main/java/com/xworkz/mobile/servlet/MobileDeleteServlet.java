package com.xworkz.mobile.servlet;

import com.xworkz.mobile.service.MobileService;
import com.xworkz.mobile.service.impl.MobileServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/delete",loadOnStartup = +4)
public class MobileDeleteServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id=req.getParameter("id");
        MobileService service=new MobileServiceImpl();
        boolean isDeleted =  service.ValidateDeleteMobileById(Integer.parseInt(id));
        if (isDeleted){
            resp.sendRedirect(req.getContextPath()+"/mobileRead");
        }

    }

}
