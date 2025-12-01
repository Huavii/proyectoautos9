/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import modelo.Venta;

public class ArregloVentas {

    private Venta[] ventas;
    private int contador;

    public ArregloVentas(int capacidad) {
        ventas = new Venta[capacidad];
        contador = 0;
    }

    public boolean agregar(Venta v) {
        if (contador < ventas.length) {
            ventas[contador] = v;
            contador++;
            return true;
        }
        return false;
    }

    public Venta buscarPorNumero(String numero) {
        for (int i = 0; i < contador; i++) {
            if (ventas[i].getNumeroVenta().equals(numero)) {
                return ventas[i];
            }
        }
        return null;
    }

    public boolean eliminarPorNumero(String numero) {
        for (int i = 0; i < contador; i++) {
            if (ventas[i].getNumeroVenta().equals(numero)) {

                for (int j = i; j < contador - 1; j++) {
                    ventas[j] = ventas[j + 1];
                }
                contador--;
                return true;
            }
        }
        return false;
    }

    public Venta[] getVentas() { return ventas; }

    public int getContador() { return contador; }
}
