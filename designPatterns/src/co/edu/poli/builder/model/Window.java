package co.edu.poli.builder.model;

public class Window {

    private double ancho;
    private double alto;
    private double grosor;

    public Window(double ancho, double alto, double grosor) {
        this.ancho = ancho;
        this.alto = alto;
        this.grosor = grosor;
    }

    @Override
    public String toString() {
        return "[ Ancho = " + ancho + "cm, Alto = " + alto + "cm, Grosor = " + grosor + " mm]";
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getGrosor() {
        return grosor;
    }

    public void setGrosor(double grosor) {
        this.grosor = grosor;
    }

}
