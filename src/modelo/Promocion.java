package modelo;

public class Promocion {

    private String descripcion;
    private double porcentajeDescuento;
    private boolean activa;

    public Promocion(String descripcion, double porcentajeDescuento, boolean activa) {
        this.descripcion = descripcion;
        this.porcentajeDescuento = porcentajeDescuento;
        this.activa = activa;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public boolean activa() {
        return activa;
    }

    public void setActiva(boolean activa) {
        this.activa = activa;
    }
}

