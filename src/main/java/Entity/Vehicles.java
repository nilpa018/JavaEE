package Entity;

import java.util.ArrayList;
import java.util.List;

public class Vehicles {

    private int id;
    private String brand;
    private String model;
    private String year;
    private String color;
    private String places;

    public void vehicles() {
    }

    public Vehicles(String brand, String model, String year, String color, String places) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        this.places = places;
        List<Object> vehicles_List = new ArrayList<>();
    }

    public Vehicles(int id, String brand, String model, String year, String color, String places) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        this.places = places;
        List<Object> vehicles_List = new ArrayList<>();
    }

    public int getId() { return id; }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPlaces() {
        return places;
    }

    public void setPlaces(String places) {
        this.places = places;
    }

    public Object getVehicles(){
        return getBrand() + getModel() + getYear() + getColor() + getPlaces();
    }

    @Override
    public String toString() {
        return
                "Véhicule de marque " + getBrand() +
                " de model " + getModel() +
                " il est de " + getYear() +
                " Il est de couleur " + getColor() +
                " et dispose de " + getPlaces() + " places";
    }

}
