/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import modelo.Pago;

public class ArregloPagos {

    private Pago[] pagos;
    private int contador;

    public ArregloPagos(int capacidad) {
        pagos = new Pago[capacidad];
        contador = 0;
    }

    public boolean agregar(Pago p) {
        if (contador < pagos.length) {
            pagos[contador] = p;
            contador++;
            return true;
        }
        return false;
    }

    public Pago buscarPorCliente(String cliente) {
        for (int i = 0; i < contador; i++) {
            if (pagos[i].getCliente().equalsIgnoreCase(cliente)) {
                return pagos[i];
            }
        }
        return null;
    }

    public boolean eliminarPorCliente(String cliente) {
        for (int i = 0; i < contador; i++) {
            if (pagos[i].getCliente().equalsIgnoreCase(cliente)) {

                // correr a la izquierda
                for (int j = i; j < contador - 1; j++) {
                    pagos[j] = pagos[j + 1];
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

    public Pago getPago(int index) {
        return pagos[index];
    }
}

