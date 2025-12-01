/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

public class Cotizacion {

    private String numero;
    private Cliente cliente;
    private Empleado vendedor;
    private Vehiculo vehiculo;
    private Promocion promocion;
    private double precioBase;
    private double precioFinal;
    private String fecha;

    public Cotizacion(int numero1, Cliente cliente, String numero, Vehiculo vehiculo, Empleado vendedor, double montoTotal, int par1, double montoTotal1, String fecha) {
        this.numero = numero;
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.vehiculo = vehiculo;
        this.promocion = promocion;
        this.fecha = fecha;

        this.precioBase = vehiculo.getPrecioBase();
        calcularPrecioFinal();
    }

    private void calcularPrecioFinal() {
        double descuento = 0;

        if (promocion != null) {          
            if (promocion.activa()) {  
                descuento = precioBase * (promocion.getPorcentajeDescuento() / 100.0);
            }
        }

        precioFinal = precioBase - descuento;
    }

    public String getNumero() { 
        return numero; 
    }
    public Cliente getCliente() { 
        return cliente; 
    }
    public Empleado getVendedor() { 
        return vendedor; 
    }
    public Vehiculo getVehiculo() { 
        return vehiculo; 
    }
    public Promocion getPromocion() { 
        return promocion; 
    }
    public double getPrecioBase() { 
        return precioBase; 
    }
    public double getPrecioFinal() { 
        return precioFinal; 
    }
    public String getFecha() { 
        return fecha; 
    }
}
