package Materia.ListasEnlazadas;
import Materia.Models.*;

public class ListaEnlazada {

    public node head;

    public ListaEnlazada(){

    }
    public void addnode(int value){
        if(head==null){
            head = new node (value);
            return;
        }

        node current = head;
        while (current.next !=null){
            current = current.next;


    }
    current.next = new node(value);
    }

    //metodo para eliminar
    public void deleteNode(int value){
        if(head == null) return;// no hay elementos no hagas nada
        if(head.value == value){
            head = head.next;
            return;
        }
        node current = head;
        while(current.next != null){
            if(current.next.value == value){
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }

    public int size(){
        

        return 1;
    }

    public void print(){
        if(head ==null){
            System.out.println("Lista Vacia");
            return;
        }
        node current = head;
        while (current.next != null) {
            System.out.println("Node -> " + current.value);
            current = current.next;
            
        }
        System.out.println("Node ->"+current.value);
        System.out.println("Fin de la lista ");
    }

    public int getByPos(int position) {//creamos el metodo para devolver la posicion solicitada empezando desde el final de la lista
        node lento= head;//Crea un puntero lento "lento"
        node rapido = head;//Crea un puntero rapido "rapido"
        
        for (int i = 0; i < position; i++) {//hace que el valor de "rapido" suba posiciones
        
        if (rapido == null) {//verifica si rapido tiene un valor
        throw new IllegalArgumentException("La posición especificada está fuera de rango.");
        }
        rapido = rapido.next;//crece el valor de rapido
        }
        
        while (rapido.next != null) {//hace que cuando el rapido se diferente a null , declare nuevos valores a lento y rapido
        lento = lento.next;
        rapido = rapido.next;
        }
        
        return lento.value;//devuelve el valor de lento
        }




   
    
}
