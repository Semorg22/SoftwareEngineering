package co.edu.poli.builder.model;

public class Pool {

    private double ancho;
    private double largo;
    private double profund;

    public Pool(double ancho, double largo, double profund) {
        this.ancho = ancho;
        this.largo = largo;
        this.profund = profund;
    }

    @Override
    public String toString() {
        return "[ Ancho = " + ancho + "cm, Largo = " + largo + "cm, Profundidad = " + profund + " cm ]";
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getProfund() {
        return profund;
    }

    public void setProfund(double profund) {
        this.profund = profund;
    }

}
