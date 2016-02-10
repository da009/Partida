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
    // Objeto de la clase carta.
    private Carta carta;
    // Objeto de la clase Mazo.
    private Mazo mazo;
    
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
            System.out.println("El intervalo de número de jugadores introducido no es válido, se asignarán 4 jugadores por defecto");
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
        mazo.barajar();
        while (mazo.quedan() >= jugadores.size())
        {
            for(Jugador jugador : jugadores)
            {
                jugador.recibirCarta(mazo.tomarPrimera());
            }
        }
    }
    
    /**
     * Muestra las cartas de cada jugador, junto con su id.
     */
    public void mostrarCartasJugadores()
    {
        for (Jugador jugador : jugadores)
        {
            System.out.println("El jugador con la Id " + jugador.getId() + " tiene en la mano las siguientes cartas: \n");
            jugador.cartasQueTieneEnLaMano();
        }
    }
}
