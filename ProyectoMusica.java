
package ProyectoMusica;

import DTO.Cancion;

public class ProyectoMusica {

        public static void main(String[] args) {
            Cancion mansoTema = new Cancion();
            mansoTema.setArtista("Van Hallen");
            mansoTema.setTitulo("Panamá");
            mansoTema.setDuracion(389);
            mansoTema.setDescargada(true);
            mansoTema.setFavorita(true);
            
            Cancion temaDos = new Cancion();
            temaDos.setArtista("Metallica");
            temaDos.setTitulo("Ride The Lightning");
            temaDos.setDuracion(878);
            temaDos.setDescargada(true);
            temaDos.setFavorita(true);
        
            
            Cancion temaTres = new Cancion();
            temaTres.setArtista("Alice In Chains");
            temaTres.setTitulo("Nutshell");
            temaTres.setDuracion(478);
            temaTres.setDescargada(true);
            temaTres.setFavorita(true);
        
            mansoTema.Imprimir();
            System.out.println("¿Diría usted que es un tema largo? "+ (mansoTema.esLarga() ? "Sip" : "Nope"));
    }
    
}
