/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import modelo.Vehiculo;

public class ArregloVehiculos {

    private Vehiculo[] vehiculos;
    private int contador;

    public ArregloVehiculos(int capacidad) {
        vehiculos = new Vehiculo[capacidad];
        contador = 0;
    }

    public boolean agregar(Vehiculo v) {
        if (contador < vehiculos.length) {
            vehiculos[contador] = v;
            contador++;
            return true;
        }
        return false;
    }

    public Vehiculo buscarPorCodigo(String codigo) {
        for (int i = 0; i < contador; i++) {
            if (vehiculos[i].getCodigo().equals(codigo)) {
                return vehiculos[i];
            }
        }
        return null;
    }

    public boolean eliminarPorCodigo(String codigo) {
        for (int i = 0; i < contador; i++) {
            if (vehiculos[i].getCodigo().equals(codigo)) {

                for (int j = i; j < contador - 1; j++) {
                    vehiculos[j] = vehiculos[j + 1];
                }

                contador--;
                return true;
            }
        }
        return false;
    }

    public int getContador() {
        return contador;
    }

    public Vehiculo getVehiculo(int index) {
        return vehiculos[index];
    }
}
