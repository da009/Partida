

/**
 * Write a description of class Juego here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Juego
{
    private int numeroJugadores;
    
    /**
     * Constructor for objects of class Juego
     */
    public Juego(int numeroJugadores)
    {
        this.numeroJugadores = numeroJugadores;
        if (numeroJugadores < 2 || numeroJugadores > 8)
        {
            numeroJugadores = 4;
        }
    }
    
    public void repartir()
    {
        
    }
}
