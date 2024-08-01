package com.example.vehicle;

import DAO.Database.VehiclesDAO;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/vehicle/delete")
public class DeleteVehiculeServlet extends HttpServlet {

        VehiclesDAO dao = new VehiclesDAO();

        @Override
        protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {

            int id = Integer.parseInt(req.getParameter("id"));
            try {
                dao.deleteVehicle(id);
                resp.sendRedirect(req.getContextPath()+"/");
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
}
