/**
 * Write a description of class Cartas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Carta
{
    String nombre;
    int valor;
    String palo;

    /**
     * Constructor for objects of class Cartas
     */
    public Carta(int valor , String palo)
    {
        this.valor = valor;
        this.palo = palo;
        
    }

    /**
     * Metodo que devuelve el nombre completo de la carta
     */
    public String getNombre()
    {
        String num =  valor + "";
        
       
        if (valor == 1)
        {
            num = "As";
        }
        if (valor == 11)
        {
            num = "Jack";
        }
        if (valor ==12)
        {
            num ="Queen";
        }
        if (valor == 13)
        {
            num = "King";
        }
        String nombreCarta = num + " de " + palo;
       return nombreCarta;
    }
    /**
     * Metodo que retorna el palo de la carta
     */
    public String getPalo()
    {
       return palo;
    }
    
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    
    
   
   
}