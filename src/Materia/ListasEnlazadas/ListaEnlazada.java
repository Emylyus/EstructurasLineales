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
        System.out.println(current.value);
        System.out.println("Fin de la lista ");
    }




   
    
}
