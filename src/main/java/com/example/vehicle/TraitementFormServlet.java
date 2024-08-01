package com.example.vehicle;

import DAO.Database.Database;
import Entity.Vehicles;
import DAO.Database.VehiclesDAO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/traitementForm")
public class TraitementFormServlet extends HttpServlet {

        Database database = new Database();
        List<Vehicles> vehicles_List = new ArrayList<>();
        VehiclesDAO dao = new VehiclesDAO();

        @Override
        protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            String brand = req.getParameter("brand");
            String model = req.getParameter("model");
            String year = req.getParameter("year");
            String color = req.getParameter("color");
            String places = req.getParameter("places");
            try {
                this.dao.addVehicle(brand, model, year, color, places);
                resp.sendRedirect(req.getContextPath()+"/");
            } catch (SQLException e) {
                System.out.println("Création échoué !");
            }
        }

}
