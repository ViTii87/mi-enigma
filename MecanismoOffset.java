
/**
 * Write a description of class MecanismoOffset here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MecanismoOffset extends Mecanismo
{
    // instance variables - replace the example below with your own
    private int numero;

    /**
     * Constructor for objects of class MecanismoOffset
     */
    public MecanismoOffset(int numero)
    {
        super(numero);
        this.numero = numero;
    }

    /**
     * Devuelve el numero almacenado en el mecanismo
     */
    public int getNumero(){
        return numero;
    }
}
