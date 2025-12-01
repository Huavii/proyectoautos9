/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import modelo.Promocion;

public class ArregloPromociones {

    private Promocion[] promociones;
    private int contador;

    public ArregloPromociones(int capacidad) {
        promociones = new Promocion[capacidad];
        contador = 0;
    }

    public boolean agregar(Promocion p) {
        if (contador < promociones.length) {
            promociones[contador] = p;
            contador++;
            return true;
        }
        return false;
    }

    public Promocion buscarPorDescripcion(String descripcion) {
        for (int i = 0; i < contador; i++) {
            if (promociones[i].getDescripcion().equals(descripcion)) {
                return promociones[i];
            }
        }
        return null;
    }

    public boolean eliminarPorDescripcion(String descripcion) {
        for (int i = 0; i < contador; i++) {
            if (promociones[i].getDescripcion().equals(descripcion)) {

                for (int j = i; j < contador - 1; j++) {
                    promociones[j] = promociones[j + 1];
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

    public Promocion getPromocion(int index) {
        return promociones[index];
    }
}
