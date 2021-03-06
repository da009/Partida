import java.util.ArrayList;

/**
 * Write a description of class Jugador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Jugador
{
    // Almacena el id del jugador.
    private int id;
    // Arraylist para las cartas en mano.
    private ArrayList<Carta> cartas;
    
    /**
     * Constructor for objects of class Jugador
     */
    public Jugador(int id)
    {
        this.id = id;
        cartas = new ArrayList<Carta>();
    }
    
    /**
     * Devuelve el identificador (id) del jugador
     */
    public int getId()
    {
        return id;
    }
    
    /**
     * Recibe una carta.
     */
    public void recibirCarta(Carta unaCarta)
    {
        cartas.add(unaCarta);
    }
    
    /**
     * Muestra las cartas del jugador.
     */
    public void cartasQueTieneEnLaMano()
    {
        if (cartas.size() != 0)
        {
            for (Carta carta : cartas)
            {
                System.out.println(carta.getNombre());
            }
        }
        else
        {
            System.out.println("El jugador no tiene cartas en la mano");
        }
    }
}
