
/**
 * Write a description of class Enigma here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enigma
{

    /**
     * Constructor for objects of class Enigma
     */
    public Enigma()
    {
    }

    /**
     * Metodo para encriptar un numero dependiendo del tipo de mecanismo
     */
    public int encripta(Mecanismo mecanismo, int numero){
        int resultado = -1;
        if(numero > 10){
            if( mecanismo instanceof MecanismoMultiplicacionPrimo) {
                resultado = mecanismo.getNumero() * numero;
            }
        }
        return resultado;
    }
    
    /**
     * Metodo para desencriptar un numero dependiendo del tipo de mecanismo
     */
    public int desencripta(Mecanismo mecanismo, int numero){
        int resultado = -1;
        if(numero > 10){
            if( mecanismo instanceof MecanismoMultiplicacionPrimo) {
                resultado = numero / mecanismo.getNumero();
            }
        }
        if(resultado <= 10)
            resultado = -1;
        return resultado;
    }
}
