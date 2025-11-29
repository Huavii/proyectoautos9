/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinalpart2;

/**
 *
 * @author USUARIO
 */
public class ArregloPromociones {

    private Promocion[] promociones;
    private int contador;

    public ArregloPromociones(int tamanio) {
        promociones = new Promocion[tamanio];
        contador = 0;
    }

    public void agregar(Promocion p) {
        promociones[contador] = p;
        contador++;
    }

    public Promocion buscarPorCodigo(String codigo) {
        for (int i = 0; i < contador; i++) {
            if (promociones[i].codigo.equals(codigo)) {
                return promociones[i];
            }
        }
        return null;
    }
}