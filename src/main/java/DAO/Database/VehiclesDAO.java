package DAO.Database;

import Entity.Vehicles;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class VehiclesDAO {

    Database database = new Database();

    public void addVehicle(String brand, String model, String year, String color, String places) throws SQLException {
        database.connect();
        String addVehicule = "insert into vehicules(brand,model,year,color,places) values(?,?,?,?,?)";
        PreparedStatement statement = database.conn.prepareStatement(addVehicule);
        statement.setString(1, brand);
        statement.setString(2, model);
        statement.setString(3, year);
        statement.setString(4, color);
        statement.setString(5, places);
        statement.execute();
        statement.close();
        database.disconnect();
    }

    public List<Vehicles> showAllVehicles() throws SQLException {
        try {
            List<Vehicles> vehiclesList = new ArrayList<>();
            database.connect();
            String showAllVehicles = "select * from vehicules";
            PreparedStatement st = database.conn.prepareStatement(showAllVehicles);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Vehicles vehicule = new Vehicles(rs.getInt("id"), rs.getString("brand"), rs.getString("model"), rs.getString("year"), rs.getString("color"), rs.getString("places"));
                vehiclesList.add(vehicule);
            }
            return vehiclesList;
        } catch (Exception e){
            e.printStackTrace();
            System.out.println("Une erreur s'est produite !");
            database.disconnect();
        }
        return null;
    }

    public void deleteVehicle(int id) throws SQLException {
        database.connect();
        String deleteVehicle = "DELETE FROM vehicules WHERE vehicules.id = ?";
        PreparedStatement st = database.conn.prepareStatement(deleteVehicle);
        st.setInt(1, id);
        st.execute();
        st.close();
        database.disconnect();
    }
}
