package co.jero.domain;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Biblioteca {
    private ArrayList<Recurso> recursos;

    public Biblioteca(ArrayList<Recurso> recursos) {
        this.recursos=new ArrayList<>();
    }

    public void addRecurso(Recurso recurso){
        byte a = (byte) recursos.stream().filter(recurso1 -> !recurso1.getNombre().equalsIgnoreCase(recurso.getNombre())).count();
        if(recursos.size()==a){ recursos.add(recurso); }
    }

    public boolean prestarRecurso(Prestable recursoAPrestar){
        return recursoAPrestar.prestar();
    }

    public boolean devolverRecurso(Prestable recursoADevolver){
        return recursoADevolver.devolver();
    }
    public ArrayList getPrestados(){
        return (ArrayList<Recurso>) recursos.stream().filter(recurso->recurso.isPrestado()==true).collect(Collectors.toList());
    }

    public ArrayList<Recurso> getRecursos() {
        return recursos;
    }
}
