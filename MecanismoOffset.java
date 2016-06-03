
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
    
    /**
     * Metodo que realiza la codificacion de esta maquina
     */
    public int codifica(int numero){
        int resultado = -1;
        int mult = 0;
        int aux = 0;
        int aux2 = getNumero();
        resultado = 0;
        while(numero > 10){
            aux = numero % 10;
            aux += aux2;
            if(aux >= 10)
                aux = aux % 10;
            resultado += aux*(Math.pow(10,mult));
            numero = numero / 10;
            mult ++;
        }
        resultado += numero*(Math.pow(10,mult));
        return resultado;
    }

    /**
     * Metodo que realiza la decodificacion de esta maquina
     */
    public int decodifica(int numero){
        int resultado = -1;
        int mult = 0;
        int aux = 0;
        int aux2 = getNumero();
        resultado = 0;
        while(numero > 10){
            aux = (numero % 10) + 10;
            aux -= aux2;
            if(aux >= 10)
                aux = aux % 10;
            resultado += aux*(Math.pow(10,mult));
            numero = numero / 10;
            mult ++;
        }
        resultado += numero*(Math.pow(10,mult));
        return resultado;
    }
}
