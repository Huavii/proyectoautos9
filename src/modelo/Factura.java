/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

public class Factura extends Comprobante {

    public Factura(String serie, String numero, Venta venta) {
        super(serie, numero, venta);
    }

    @Override
    public String generarTexto() {
        return "FACTURA\n" +
               "Serie: " + serie + "\n" +
               "Número: " + numero + "\n" +
               "Cliente: " + venta.getCotizacion().getCliente().nombreCompleto() + "\n" +
               "Total: " + venta.getTotal();
    }
}
