package co.edu.poli.builder.model;

public class Garden {

    private int cant_estatuas;
    private int cant_arbustos;

    @Override
    public String toString() {
        return "Garden [cant_estatuas=" + cant_estatuas + ", cant_arbustos=" + cant_arbustos + "]";
    }

    public Garden(int cant_estatuas, int cant_arbustos) {
        this.cant_estatuas = cant_estatuas;
        this.cant_arbustos = cant_arbustos;
    }

    public int getCant_estatuas() {
        return cant_estatuas;
    }

    public void setCant_estatuas(int cant_estatuas) {
        this.cant_estatuas = cant_estatuas;
    }

    public int getCant_arbustos() {
        return cant_arbustos;
    }

    public void setCant_arbustos(int cant_arbustos) {
        this.cant_arbustos = cant_arbustos;
    }

}
