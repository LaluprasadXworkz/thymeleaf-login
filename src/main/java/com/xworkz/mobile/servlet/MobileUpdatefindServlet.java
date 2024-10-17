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
@WebServlet(urlPatterns = "/update",loadOnStartup = +7)
public class MobileUpdatefindServlet extends HttpServlet {
    static int mid;
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        MobileService service = new MobileServiceImpl();
        String id=req.getParameter("mid");
        MobileEntity entity = service.ValidateGetMobileById(Integer.parseInt(id));
        req.setAttribute("entity", entity);
        RequestDispatcher requestDispatcher= req.getRequestDispatcher("/updateSet.jsp");
        requestDispatcher.forward(req,resp);
        mid=Integer.parseInt(id);
    }
}
