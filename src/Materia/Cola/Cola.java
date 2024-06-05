package Materia.Cola;

import java.util.EmptyStackException;
import java.util.NoSuchElementException;

import Materia.Models.node;

public class Cola {

    private node first;
    private node last;

    public Cola(){
        this.first = null;
        this.first = null;
    }

    public boolean isEmpty(){
        return first == null;
    }

    //Metodo par agaregar un nodo a la cola
    public void addnode(int value){
        node nodo = new node (value);
        if(isEmpty()){
            first= nodo;
            last = nodo;
        }else{
            last.next = nodo;
            last = nodo;
        }
    }

    public int remove(){
        if(isEmpty()){
            throw new NoSuchElementException("La cola esta vacia");
        }
        int value = first.value;
        first = first.next;
        if(first == null){
            last = null;
        }
        return value;
    }



    public int peek(){//oniene pero no saca de la fila
        if(isEmpty()){
            throw new NoSuchElementException("La cola esta vacia");
        }
        return first.value;
    }

}
