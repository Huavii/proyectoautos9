/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinalpart2;

import proyectofinalpart2.Vehiculo;

/**
 *
 * @author USUARIO
 */
public class Sedan extends Vehiculo {
    private int numPuertas;

    public Sedan(String codigo, String marca, String modelo, String color, int anio, double precioBase, int numPuertas) {
        super(codigo, marca, modelo, color, anio, precioBase);
        this.numPuertas = numPuertas;
    }

    @Override
    public String tipoVehiculo() {
        return "Sedán";
    }

}
