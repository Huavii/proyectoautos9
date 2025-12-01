/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import modelo.Empleado;

public class ArregloEmpleados {

    private Empleado[] empleados;
    private int contador;

    public ArregloEmpleados(int capacidad) {
        empleados = new Empleado[capacidad];
        contador = 0;
    }

    public boolean agregar(Empleado e) {
        if (contador < empleados.length) {
            empleados[contador] = e;
            contador++;
            return true;
        }
        return false;
    }

    public Empleado buscarPorDni(String dni) {
        for (int i = 0; i < contador; i++) {
            if (empleados[i].getDni().equals(dni)) {
                return empleados[i];
            }
        }
        return null;
    }

    public boolean eliminarPorDni(String dni) {
        for (int i = 0; i < contador; i++) {
            if (empleados[i].getDni().equals(dni)) {
                for (int j = i; j < contador - 1; j++) {
                    empleados[j] = empleados[j + 1];
                }
                contador--;
                return true;
            }
        }
        return false;
    }

    public Empleado buscarPorUsuarioClave(String usuario, String clave) {
        for (int i = 0; i < contador; i++) {
            if (empleados[i].verificador(usuario, clave)) {
                return empleados[i];
            }
        }
        return null;
    }

    public int getContador() {
        return contador;
    }

    public Empleado getEmpleado(int index) {
        return empleados[index];
    }

    Empleado[] getEmpleado() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
