
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
        int aux = numero;
        int resultado = 0;
        while(aux >= getNumero()){
            resultado += aux;
            aux--;
        }
        return resultado;
    }

    /**
     * Metodo que realiza la decodificacion de esta maquina
     */
    public int decodifica(int numero){
        int aux = getNumero();
        int aux2 = numero;
        while(aux2 > aux){
           aux2 -= aux;
           aux ++;
        }
        return aux2;
    }
}
