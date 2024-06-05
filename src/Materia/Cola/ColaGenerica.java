package Materia.Cola;

import java.util.NoSuchElementException;

import Materia.Models.NodoGenerico;

public class ColaGenerica<T>{
   private NodoGenerico<T> first;
   private NodoGenerico<T> Last;
   private int size;

   public ColaGenerica(){
    this.first=null;
    this.Last=null;
    size = 0;
   }

   public boolean isEmpty(){
    return first == null;
   }
   public void addnode (T data){
    NodoGenerico<T> nodo = new NodoGenerico<>(data);
    if(isEmpty()){
        first= nodo;
        Last = nodo;

    }else{
        Last.next=nodo;
        Last=nodo;
    }
   }

   public T remove(){
        if(isEmpty()){
            throw new NoSuchElementException("La cola esta vacia");
        }
        T value = first.data;
        first = first.next;
        if(first == null){
            Last = null;
        }
        return value;
    }



    public T peek(){//oniene pero no saca de la fila
        if(isEmpty()){
            throw new NoSuchElementException("La cola esta vacia");
        }
        return first.data;
    }

    public int size(){
        int count = 0;
        NodoGenerico<T> nodo = first;
        while (nodo != null) {
            count++;
            nodo = nodo.next;
        }
        return count;
    }


}
