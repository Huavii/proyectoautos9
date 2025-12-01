/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;


public class Cliente extends Persona {

    private String direccion;

    public Cliente(String dni, String nombres, String apellidoPaterno,String apellidoMaterno, String telefono, String correo,String direccion) {
        super(dni, nombres, apellidoPaterno, apellidoMaterno, telefono, correo);
        this.direccion = direccion;
    }

    public String getDireccion() { 
        return direccion; 
    }
    public void setDireccion(String direccion) { 
        this.direccion = direccion; 
    }

    @Override
    public String getTipoPersona() {
        return "Cliente";
    }
}
