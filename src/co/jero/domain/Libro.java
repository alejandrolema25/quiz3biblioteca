package co.jero.domain;

public class Libro extends Recurso implements Prestable{
    public Libro(boolean prestado, String nombre) {
        super(prestado, nombre);
    }

    @Override
    public boolean prestar() {
        if(this.isPrestado()==false){
            setPrestado(true);
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public boolean devolver() {
        if(isPrestado()==true){
            setPrestado(false);
            return true;
        }
        else{

            return false;
        }
    }
}
