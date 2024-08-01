package com.example.vehicle;

import DAO.Database.VehiclesDAO;
import Entity.Vehicles;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/")
public class ShowVehiculesServlet extends HttpServlet {

        VehiclesDAO dao = new VehiclesDAO();
        List<Vehicles> vehiclesList = new ArrayList<Vehicles>();

        @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            try {
                vehiclesList = dao.showAllVehicles();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            req.setAttribute("vehiclesList", vehiclesList);
            RequestDispatcher dispatcher = req.getRequestDispatcher("/views/vehicle/showVehicles.jsp");
            dispatcher.forward(req, resp);
        }

}
