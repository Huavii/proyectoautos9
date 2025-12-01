/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import modelo.Cliente;

public class ArregloClientes {

    private Cliente[] clientes;
    private int contador;

    public ArregloClientes(int capacidad) {
        clientes = new Cliente[capacidad];
        contador = 0;
    }

    public boolean agregar(Cliente cliente) {
        if (contador < clientes.length) {
            clientes[contador] = cliente;
            contador++;
            return true;
        }
        return false;
    }

    public Cliente buscarPorDni(String dni) {
        for (int i = 0; i < contador; i++) {
            if (clientes[i].getDni().equals(dni)) {
                return clientes[i];
            }
        }
        return null;
    }

    public boolean eliminarPorDni(String dni) {
        for (int i = 0; i < contador; i++) {
            if (clientes[i].getDni().equals(dni)) {
                for (int j = i; j < contador - 1; j++) {
                    clientes[j] = clientes[j + 1];
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

    public Cliente getCliente(int index) {
        return clientes[index];
    }
}
