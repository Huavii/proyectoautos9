/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import modelo.Venta;

public class ServicioReportes {

    public double totalVentas(ArregloVentas arrVentas) {
        double suma = 0;
        Venta[] ventas = arrVentas.getVentas();
        for (int i = 0; i < arrVentas.getContador(); i++) {
            suma += ventas[i].getTotal();
        }
        return suma;
    }
}
