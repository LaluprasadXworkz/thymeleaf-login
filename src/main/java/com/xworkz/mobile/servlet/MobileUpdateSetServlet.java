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

@WebServlet(urlPatterns = "/mobileUpdate",loadOnStartup = +9)
public class MobileUpdateSetServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        MobileEntity entity=new MobileEntity();
        MobileService service=new MobileServiceImpl();
        String mName=req.getParameter("mobileName");
        Long pnum=Long.parseLong(req.getParameter("phoneNumber"));
        int price=Integer.parseInt(req.getParameter("mPrice"));
        String showrom=req.getParameter("sRoom");
        int id=MobileUpdatefindServlet.mid;
        boolean update=service.ValidateUpdateMobileDetails(mName,pnum,price,showrom,id);
        if (update ) {
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("/updateMsg.jsp");
            requestDispatcher.forward(req, resp);

        }
    }
}
