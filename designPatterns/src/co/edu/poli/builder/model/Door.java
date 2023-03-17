package co.edu.poli.builder.model;

public class Door {

    private double alto;
    private double ancho;
    private String madera;
    private int cant_puertas;

    public Door(double alto, double ancho, String madera, int cant_puertas) {
        this.alto = alto;
        this.ancho = ancho;
        this.madera = madera;
        this.cant_puertas = cant_puertas;
    }

    @Override
    public String toString() {
        return "Door [alto=" + alto + ", ancho=" + ancho + ", madera=" + madera + ", cant_puertas=" + cant_puertas
                + "]";
    }

    public int getCant_puertas() {
        return cant_puertas;
    }

    public void setCant_puertas(int cant_puertas) {
        this.cant_puertas = cant_puertas;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public String getMadera() {
        return madera;
    }

    public void setMadera(String madera) {
        this.madera = madera;
    }

}
