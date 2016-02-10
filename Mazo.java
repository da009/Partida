import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;
import java.util.Iterator;

/**
 * Write a description of class Mazo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mazo
{
    // ArrayList para los palos y los valores de la baraja
    private ArrayList<Carta> listaCartas = new ArrayList<Carta>();
    private ArrayList<Integer> valores;
    private ArrayList<String> nombres;
    private ArrayList<String> palos;

    /**
     * Constructor que crea la baraja
     */
    public Mazo()
    {
        palos = new ArrayList<>(Arrays.asList("Tréboles","Corazones","Diamantes","Picas"));
        valores = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13));
        nombres = new ArrayList<>(Arrays.asList("As","Dos","Tres","Cuatro","Cinco","Seis","Siete","Ocho","Nueve","Diez","Jack","Queen","King"));
        for (String p : palos)
        {
            for (int v : valores)
            {
                Carta carta = new Carta(v,p);
                String nombre = carta.getNombre();
                carta.setNombre(nombres.get(v-1));
                listaCartas.add(carta);
                //System.out.println(v);
            }
        }
    }

    /**
     * Metodo para barajar las cartas
     */
    public void barajar()
    {
        Collections.shuffle(listaCartas);
    }

    /**
     * Metodo que retorna la primera carta del mazo y modifica el estado del mazo para reflejar que esa carta ya no se encuentra en el mazo.
     * En caso de que no queden cartas en el mazo devuelve null.
     */
    public Carta tomarPrimera()
    {
        Iterator <Carta> it = listaCartas.iterator();
        Carta carta = null;
        if (listaCartas.size() > 0) {
            carta = it.next();
            listaCartas.remove(carta);
        }
        return carta;
    }                

    /**
     * Metodo que retorna el numero de cartas que quedan
     */
    public int quedan()
    {
        return listaCartas.size();
    }

    public void listarMazo()
    {
        Iterator <Carta> it = listaCartas.iterator();
        Carta carta = null;   
        while (it.hasNext())
        {
            carta = it.next();
            System.out.println(carta.getNombre() + " de " + carta.getPalo());

        }
    }
}

