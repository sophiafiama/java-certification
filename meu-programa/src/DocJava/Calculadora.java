package DocJava;

    /*
    * Classe para fazer calculos matematicos*
    * @autor SophiaFiama
    */

public class Calculadora {

    /**
     * Metodo para dividir dois numeros
     * @param dividendo Número que será dividido
     * @param divisor Número que irá dividir o dividendo
     * @return a divisão do dividendo pelo divisor
     * @author SophiaFiama
     * @exception java.lang.ArithmeticException em caso de passar o divisor como 0
     */
    static Integer dividir(Integer dividendo, Integer divisor){
        return dividendo/divisor;
    }
}
