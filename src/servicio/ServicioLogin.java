/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import modelo.Empleado;

public class ServicioLogin {

    private ArregloEmpleados arregloEmpleados;
    
    public ServicioLogin(ArregloEmpleados arregloEmpleados) {
        this.arregloEmpleados = arregloEmpleados;
    }

    public Empleado validar(String usuario, String clave) {
        Empleado[] datos = arregloEmpleados.getEmpleado();
        for (int i = 0; i < arregloEmpleados.getContador(); i++) {
            Empleado e = datos[i];
            if (e.verificador(usuario, clave)) {
                return e;
            }
        }
        return null;
    }
}
