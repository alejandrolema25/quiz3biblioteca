package co.jero.main;

import co.jero.domain.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {



        Libro libro               =new Libro(false,"La isla misteriosa");
        Tesis tesis               =new Tesis(false," Las políticas de inmigración en España. Actores y proceso en la arena migratoria");
        Revista revista           =new Revista(false,"El colombiano");
        Enciclopedia enciclopedia = new Enciclopedia(false,"Enciclopedio mundial");
        Cuentos cuentos           = new Cuentos(false,"Rin rin renacuajo");

        ArrayList<Recurso>listaDeRecursosTotales=new ArrayList<>();

        Biblioteca biblioteca=new Biblioteca(listaDeRecursosTotales);

        biblioteca.addRecurso(libro);
        biblioteca.addRecurso(tesis);
        biblioteca.addRecurso(revista);
        biblioteca.addRecurso(enciclopedia);
        biblioteca.addRecurso(cuentos);

        System.out.println(biblioteca.prestarRecurso(libro));
        System.out.println(biblioteca.prestarRecurso(revista));
        System.out.println(biblioteca.prestarRecurso(cuentos));


        System.out.println(biblioteca.getPrestados());





    }
}
