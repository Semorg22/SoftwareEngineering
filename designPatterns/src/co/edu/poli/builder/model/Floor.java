package co.edu.poli.builder.model;

public class Floor {

    private String tipo;
    private int metros;

    @Override
    public String toString() {
        return "Floor [tipo=" + tipo + ", metros=" + metros + "]";
    }

    public Floor(String tipo, int metros) {
        this.tipo = tipo;
        this.metros = metros;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getMetros() {
        return metros;
    }

    public void setMetros(int metros) {
        this.metros = metros;
    }

}
