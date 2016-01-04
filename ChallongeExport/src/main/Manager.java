package main;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Manager {
    
    private String csv;
    
    final private String HEAD = "Jugador1,Jugador2,Resultado1,Resultado2";
    final private String NL = "\n";
    final private String SEPARATOR = ",";
    
    public Manager(String urlCSV){
        setCsv(urlCSV);
    }
    
    /* GET SET */

    public String getCsv() {
        return csv;
    }

    public void setCsv(String csv) {
        this.csv = csv;
    }
    
    /* FUNCTIONS */
    
    public void generateCSV(String nombre,List<Resultados> rs){
    
        try{
            FileWriter writer = new FileWriter(this.getCsv()+nombre+".csv");
            
            writer.append(HEAD);
            writer.append(NL);
            
            for(Resultados r : rs){
                System.out.println(r.getJ1());
                writer.append(r.getJ1());
                writer.append(SEPARATOR);
                writer.append(r.getJ2());
                writer.append(SEPARATOR);
                writer.append(Integer.toString(r.getR1()));
                writer.append(SEPARATOR);
                writer.append(Integer.toString(r.getR2()));
                writer.append(SEPARATOR);
                writer.append(Integer.toString(r.getRonda()));
                writer.append(NL);
            }
            
            writer.flush();
            writer.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    
    }
}
