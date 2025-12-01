/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

public class Venta {
    private String numeroVenta;
    private Cotizacion cotizacion;
    private double total;
    private String fecha;
    private boolean cancelada;

    private String tipoFacturacion; 
    private String vendedor;         

    public Venta(String numeroVenta, Cotizacion cotizacion, 
                 String fecha, String tipoFacturacion, String vendedor) {

        this.numeroVenta = numeroVenta;
        this.cotizacion = cotizacion;
        this.total = cotizacion.getPrecioFinal();
        this.fecha = fecha;
        this.cancelada = false;

        this.tipoFacturacion = tipoFacturacion;
        this.vendedor = vendedor;
    }

    public String getNumeroVenta() { 
        return numeroVenta; 
    }

    public Cotizacion getCotizacion() { 
        return cotizacion; 
    }

    public double getTotal() { 
        return total; 
    }

    public String getFecha() { 
        return fecha; 
    }

    public boolean isCancelada() { 
        return cancelada; 
    }

    public String getTipoFacturacion() { 
        return tipoFacturacion; 
    }

    public String getVendedor() { 
        return vendedor; 
    }

    public void cancelar() { 
        this.cancelada = true; 
    }
}
