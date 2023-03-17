package co.edu.poli.builder.model;

public class Ceil {

    private String tipo;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Ceil(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "[ Tipo = " + tipo + " ]";
    }

}
