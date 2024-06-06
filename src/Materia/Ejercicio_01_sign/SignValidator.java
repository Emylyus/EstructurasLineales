package Materia.Ejercicio_01_sign;

import Materia.Pilas.PilaGenerica;

public class SignValidator {

    public  boolean isValing(String s){

        PilaGenerica<Character> pila = new PilaGenerica<>(); //inicializamos la pila generica

        for(int i = 0; i < s.length();i++){//creamos un for el cual va a iniciar una variable i con un valor de 0 y esta debe ser menor al tamaño del string 
            char elemento = s.charAt(i); //creamos un elemento que tenga como tipo char (caracter) y este  obtiene el valor de charAt en la posicion de i
            if ( elemento == '(' || elemento == '{' || elemento == '['){// ||Or // usamos un if el cual contiene el elemento de (, [, { y todos ponemos usando el or

                pila.push(elemento); // usamos el push para que cada elemento se vaya agregando
            }else if (pila.isEmpty() || !coincide(pila.pop(), elemento)) { // con el else if usamos el isEmpty el cual verifica si esta vacia la pila y usando un or hacemos un metodo llamado concidencia el cual tendra en parentesis el pop y ele elemento 
            }
        }
        return pila.isEmpty(); // returnamos el is empty para verificar si la pila esta vacia
    }

    private static boolean coincide(char apertura, char cierre) {// creamos es metodo coincide
        return (apertura == '(' && cierre == ')') || apertura == '{' && cierre == '}'|| apertura == '[' && cierre == ']';// con el return devolvemos el inicio y el final de cada simbolo ejemplo inicio ( ; final )
    }

}
