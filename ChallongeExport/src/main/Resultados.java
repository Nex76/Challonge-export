package main;

/**
 *
 * @author nexmaniosis
 */
public class Resultados {
    
    private String Jugador1;
    private String Jugador2;
    private int Resultado1;
    private int Resultado2;
    private int Ronda;
    
    public Resultados(String j1,String j2,int r1,int r2,int r){
        setJ1(j1);
        setJ2(j2);
        setR1(r1);
        setR2(r2);
        setRonda(r);
    }

    /* GET Y SET */
    
    public String getJ1() {
        return Jugador1;
    }

    public void setJ1(String Jugador1) {
        this.Jugador1 = Jugador1;
    }

    public String getJ2() {
        return Jugador2;
    }

    public void setJ2(String Jugador2) {
        this.Jugador2 = Jugador2;
    }

    public int getR1() {
        return Resultado1;
    }

    public void setR1(int Resultado1) {
        this.Resultado1 = Resultado1;
    }

    public int getR2() {
        return Resultado2;
    }

    public void setR2(int Resultado2) {
        this.Resultado2 = Resultado2;
    }

    public int getRonda() {
        return Ronda;
    }

    public void setRonda(int Ronda) {
        this.Ronda = Ronda;
    }
    
}
