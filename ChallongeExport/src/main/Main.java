package main;
import challonge.model.Match;
import interfaz.Ventana;
import java.util.ArrayList;
import java.util.List;

/*
README

Falta:
URL Parser

Posibles fallos:
Main admin new
Admin listaEnfrentamientos -> open 

*/

public class Main {

    final static Boolean debug = true;

    public static void main(String[] args) {
        
        //Admin a = new Admin();
        
        if(!debug){
            // Llamamos a la interfaz
            Ventana v = new Ventana();
            v.setVisible(true);           
        }
        else{
            // API Key - String    
            String key = "3Eum2ckuPLG7XEni1t4nYwn1qI45IsZZbQlAFPEf";
            // Challonge links - String
            String link = "test20D";
            // Llamamos a Admin
           // a = new Admin(key,link);
        }
        
        
        // Llamamos a los enfrentamientos - List<Match>
      //  List<Match> enfrentamientos = a.listaEnfrentamientos();
        
        // Llamamos a Manager
        //Manager m = new Manager();
        
            // Creamos el CSV
            
            // Lo rellenamos con los datos
            // Guardamos
    }
    
}
