import java.util.ArrayList;

/**
 * Write a description of class Juego here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Juego
{
    // Número de jugadores
    private int numeroJugadores;
    // ArrayList para los jugadores).
    private ArrayList<Jugador> jugadores;
    // Contador para los jugadores
    private int contNumeroJugadores;
    
    /**
     * Constructor for objects of class Juego
     */
    public Juego(int numeroJugadores)
    {
        this.numeroJugadores = numeroJugadores;
        jugadores = new ArrayList<Jugador>();
        contNumeroJugadores = 1;
        
        // Comprueba que los valores sean válidos y sino asigna 4 por defecto.
        if (numeroJugadores < 2 || numeroJugadores > 8)
        {
            numeroJugadores = 4;
        }
        
        // Añade jugadoreshasta que se alcance el número de jugadores de la partida.
        while (contNumeroJugadores <= numeroJugadores)
        {
            jugadores.add(new Jugador(contNumeroJugadores));
            contNumeroJugadores++;
        }
    }

    
    /**
     * Reparte las cartas.
     */
    public void repartir()
    {
        
    }
    
    /**
     * Muestra las cartas de cada jugador, junto con su id.
     */
    public void mostrarCartasJugadores()
    {
        
    }
}
