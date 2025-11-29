/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinalpart2;

/**
 *
 * @author USUARIO
 */
public class ArregloVehiculos {

    private Vehiculo[] vehiculos;
    private int contador;

    public ArregloVehiculos(int tamanio) {
        vehiculos = new Vehiculo[tamanio];
        contador = 0;
    }

    public void agregar(Vehiculo v) {
        vehiculos[contador] = v;
        contador++;
    }

    public Vehiculo buscarPorCodigo(String codigo) {
        for (int i = 0; i < contador; i++) {
            if (vehiculos[i].codigo.equals(codigo)) {
                return vehiculos[i];
            }
        }
        return null;
    }

    public Vehiculo[] listar() {
        return vehiculos;
    }
}