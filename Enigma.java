
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
            if(mecanismo instanceof MecanismoOffset){
                int mult = 0;
                int aux = 0;
                int aux2 = mecanismo.getNumero();
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
            if(mecanismo instanceof MecanismoOffset){
                int mult = 0;
                int aux = 0;
                int aux2 = mecanismo.getNumero();
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
            }
        }
        if(resultado <= 10)
            resultado = -1;
        return resultado;
    }
}
