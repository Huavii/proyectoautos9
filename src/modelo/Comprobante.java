/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

public abstract class Comprobante {
    protected String serie;
    protected String numero;
    protected Venta venta;

    public Comprobante(String serie, String numero, Venta venta) {
        this.serie = serie;
        this.numero = numero;
        this.venta = venta;
    }

    public abstract String generarTexto();
}
