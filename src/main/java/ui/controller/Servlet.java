package ui.controller;

import domain.db.TelefoonDB;
import domain.model.Telefoon;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "Servlet", value = "/Servlet")
public class Servlet extends HttpServlet {
    private TelefoonDB telefoonDB = new TelefoonDB();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("telefoonlijst", telefoonDB.getTelefoons());
        request.getRequestDispatcher("overzicht.jsp").forward(request,response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String naam = request.getParameter("naam");
        String prijsAlsString = request.getParameter("prijs");
        String productiejaarAlsString = request.getParameter("productiejaar");

        try {
            int prijs = Integer.parseInt(prijsAlsString);
            int productiejaar =  Integer.parseInt(productiejaarAlsString);
            Telefoon telefoon = new Telefoon();
            telefoon.setNaam(naam);
            telefoon.setPrijs(prijs);
            telefoon.setProductiejaar(productiejaar);

            telefoonDB.add(telefoon);

            request.setAttribute("telefoon", telefoonDB.getTelefoons());
            RequestDispatcher view = request.getRequestDispatcher("overzicht.jsp");
            view.forward(request, response);
        }

        catch (Exception e){
            RequestDispatcher view = request.getRequestDispatcher("voegtoe.jsp");
            view.forward(request, response);

        }


    }
}
