/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Renato
 */

public class Empleado extends Persona implements Verificar{

    private String usuario;
    private String clave;
    private String rol; 

    public Empleado(String dni, String nombres, String apellidoPaterno, String apellidoMaterno, String telefono, String correo, String usuario, String clave, String rol) {
        super(dni, nombres, apellidoPaterno, apellidoMaterno, telefono, correo);
        this.usuario = usuario;
        this.clave = clave;
        this.rol = rol;
    }

    public String getUsuario() {
        return usuario; 
    }
    public void setUsuario(String usuario) { 
        this.usuario = usuario; 
    }

    public String getClave() {
        return clave; 
    }
    public void setClave(String clave) { 
        this.clave = clave;
    }

    public String getRol() { 
        return rol; 
    }
    public void setRol(String rol) {
        this.rol = rol; 
    }

    @Override
    public String getTipoPersona() {
        return "Empleado - " + rol;    
    }

    @Override
    public boolean verificador(String usuario, String clave) {
        return this.usuario.equals(usuario) && this.clave.equals(clave);
    }
}

