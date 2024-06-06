package Materia.Ejercicio_02_sorting;

import Materia.Pilas.PilaGenerica;

public class StackSorter {

    public void sortStack (PilaGenerica<Integer> stack){ //Toma una pila de enteros como parametro
        PilaGenerica<Integer> pila = new PilaGenerica<>();  //Creamos una pila auxiliar vacia de enteros

        while (!stack.isEmpty()) { //Mientras la pila original no este vacia se saca el elemento del tope de la pila original y lo alamcena en la variable temporal
            int temp = stack.pop();
            while ( !pila.isEmpty() && pila.peek()> temp){ // Mientras la pila auxiliar no este vacia y TAMbien la pila el tope del elemento de esta tienen que ser mayor al temporal
                stack.push(pila.pop()); // Saca el elemento superior de la pila y lo mete en la original
            }

            pila.push(temp);// pone el elemento temporal a la pila
            
        }

        while (!pila.isEmpty()){//si la pila no esta vacia
            stack.push(pila.pop());//saca el elemento de arriba  lo pone en la original 
        }




    }

    

}
