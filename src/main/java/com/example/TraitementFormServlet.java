package com.example;

import Entity.Vehicles;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/traitementForm")
public class TraitementFormServlet extends HttpServlet {

        List<Vehicles> vehicles_List = new ArrayList<>();

        @Override
        protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            String brand = req.getParameter("brand");
            String model = req.getParameter("model");
            String year = req.getParameter("year");
            String color = req.getParameter("color");
            String places = req.getParameter("places");

            Vehicles vehicule1 = new Vehicles("Opel", "Corsa", "1998", "rouge", "5");
            Vehicles vehicule2 = new Vehicles("Audi", "A3", "2001", "gris", "5");
            Vehicles vehicule = new Vehicles(brand, model, year, color, places);

            vehicles_List.add(vehicule1);
            vehicles_List.add(vehicule2);
            vehicles_List.add(vehicule);

            req.setAttribute("vehicleList", vehicles_List);
            req.setAttribute("vehicule", vehicule);
            RequestDispatcher dispatcher = req.getRequestDispatcher("/views/traitementForm.jsp");
            dispatcher.forward(req, resp);
        }

}
