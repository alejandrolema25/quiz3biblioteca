package co.jero.domain;

public abstract class Recurso {
    private boolean prestado;
    private String nombre;

    public Recurso(boolean prestado, String nombre) {
        this.prestado = prestado;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        String a;
        if(prestado==false){
            a=" esta disponible en la biblioteca";
        }
        else
        {
            a=" esta prestado";
        }
        return (getNombre()+a);
    }

    public boolean isPrestado() {
        return prestado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }
}
