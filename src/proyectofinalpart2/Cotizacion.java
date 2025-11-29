/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinalpart2;

/**
 *
 * @author USUARIO
 */
public class Cotizacion {

    private String codigo;
    private Cliente cliente;
    private Empleado vendedor;
    private Vehiculo vehiculo;
    private Descontable promocion;
    private double precioFinal;

    public Cotizacion(String codigo, Cliente cliente, Empleado vendedor, Vehiculo vehiculo, Descontable promocion) {
        this.codigo = codigo;
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.vehiculo = vehiculo;
        this.promocion = promocion;
        this.precioFinal = calcularPrecioFinal();
    }

    public double calcularPrecioFinal() {
        if (promocion != null) {
            return promocion.calcularPrecioFinal(vehiculo.precioBase);
        } else {
            return vehiculo.precioBase;
        }
    }

    public double getPrecioFinal() {
        return precioFinal;
    }
}
