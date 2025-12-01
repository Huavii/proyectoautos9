/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import modelo.Cotizacion;

public class ArregloCotizaciones {

    private Cotizacion[] cotizaciones;
    private int contador;

    public ArregloCotizaciones(int capacidad) {
        cotizaciones = new Cotizacion[capacidad];
        contador = 0;
    }

    public boolean agregar(Cotizacion c) {
        if (contador < cotizaciones.length) {
            cotizaciones[contador] = c;
            contador++;
            return true;
        }
        return false;
    }

    public Cotizacion buscarPorNumero(String numero) {
        for (int i = 0; i < contador; i++) {
            if (cotizaciones[i].getNumero().equals(numero)) {
                return cotizaciones[i];
            }
        }
        return null;
    }

    public Cotizacion getCotizacion(int index) {
        return cotizaciones[index];
    }
    public int getContador() { 
        return contador; 
    }
    
    
    public boolean eliminarPorClienteYVehiculo(String dni, String codigo) {
    for (int i = 0; i < contador; i++) {
        if (cotizaciones[i].getCliente().getDni().equals(dni) &&
            cotizaciones[i].getVehiculo().getCodigo().equals(codigo)) {

            for (int j = i; j < contador - 1; j++) {
                cotizaciones[j] = cotizaciones[j + 1];
            }
            contador--;
            return true;
        }
    }
    return false;
}
}
