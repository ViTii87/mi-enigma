
/**
 * Write a description of class Mecanismo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Mecanismo
{
    private int numerin;

    /**
     * Constructor for objects of class Mecanismo
     */
    public Mecanismo(int numerin)
    {
        this.numerin = numerin;
    }
    
    /**
     * Metodo abstracto
     */
    public abstract int getNumero();
}
