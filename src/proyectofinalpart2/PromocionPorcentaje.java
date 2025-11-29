/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinalpart2;

/**
 *
 * @author USUARIO
 */
public class PromocionPorcentaje extends Promocion implements Descontable {
    private double porcentajeDescuento;

    public PromocionPorcentaje(String codigo, String descripcion, double porcentajeDescuento, boolean activa) {
        super(codigo, descripcion, activa);
        this.porcentajeDescuento = porcentajeDescuento;
    }

    @Override
    public double calcularPrecioFinal(double precioBase) {
        double descuento = precioBase * porcentajeDescuento / 100;
        return precioBase - descuento;
    }
}
