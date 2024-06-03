package Materia.Pilas;

import Materia.Models.node;

public class Pila {
    private node top;

    public Pila(){
        top=null;
    }

    //Push : agregar elemento a la pila

    public void push(int value){
        node nodo = new node (value);

        nodo.next = top;

        top = nodo;

    }

    public int pop(){
        if(top==null){
            System.out.println("La pila esta vacia");
            return 0;
        }else{
            int value = top.value;
            top = top.next;

            return value;
        }
    }

    public int peek(){
        if(top==null){
            System.out.println("La pila esta vacia");
            return 0;
        }

        return top.value;
    }

    public boolean isEmpty(){
        return top == null;
    }


}
