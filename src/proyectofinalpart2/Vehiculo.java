/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinalpart2;

/**
 *
 * @author USUARIO
 */
public abstract class Vehiculo {


    protected String codigo;
    protected String marca;
    protected String modelo;
    protected String color;
    protected int anio;
    protected double precioBase;

    public Vehiculo(String codigo, String marca, String modelo, String color, int anio, double precioBase) {
        this.codigo = codigo;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.anio = anio;
        this.precioBase = precioBase;
    }

    public String mostrarDatos() {
        return codigo + " - " + marca + " " + modelo;
    }

    public abstract String tipoVehiculo();
}


