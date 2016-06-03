
/**
 * Write a description of class MecanismoSumatorioParcial here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MecanismoSumatorioParcial extends Mecanismo
{
    // instance variables - replace the example below with your own
    private int num;

    /**
     * Constructor for objects of class MecanismoSumatorioParcial
     */
    public MecanismoSumatorioParcial(int numero)
    {
        super(numero);
        num = numero;
    }

    /**
     * Devuelve el numero almacenado en el mecanismo
     */
    public int getNumero(){
        return num;
    }

    /**
     * Metodo que realiza la codificacion de esta maquina
     */
    public int codifica(int numero){
        int i = 1;
        int resultado = numero;
        while(i <= getNumero()){
            resultado = resultado + (numero - i);
            i++;
        }
        return resultado;
    }

    /**
     * Metodo que realiza la decodificacion de esta maquina
     */
    public int decodifica(int numero){
        int i = 0;
        int resultado = 0;
        int aux = 0;
        while(i <= getNumero()){
            aux = aux + i;
            i++;
        }
        resultado = (numero + aux) / i;
        return resultado;
    }
}
