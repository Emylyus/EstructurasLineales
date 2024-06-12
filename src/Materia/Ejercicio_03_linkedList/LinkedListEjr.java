package Materia.Ejercicio_03_linkedList;

import Materia.ListasEnlazadas.ListaGenerica.Node;
import Materia.Models.node;
import Materia.ListasEnlazadas.ListaEnlazada;
import Materia.ListasEnlazadas.ListaGenerica.*;

public class LinkedListEjr {

    public LinkedListEjr() {//Contructor del linkedList
    one = null;
    }
    
    private class Node {//crea una clase nodo
    int data;
    Node next;
    
    Node(int data) {
    this.data = data;
    this.next = null;
    }
    }
    
    private Node one;
    
    public void add(int data) {
    Node newNode = new Node(data);
    if (one == null) {
    one = newNode;
    } else {
    Node current = one;//nodo temporal con el valor del nodo primero
    while (current.next != null) {
    current = current.next;
    }
    current.next = newNode;
    }
    }
    
    public int getByPos(int position) { // Método que devuelve el valor del nodo en la posición especificada empezando desde el final.
    Node lento= one;//Crea un puntero lento "lento"
    Node rapido = one;//Crea un puntero rapido "rapido"
    
    for (int i = 0; i < position; i++) {
    if (rapido == null) {
        throw new IllegalArgumentException("La posición especificada está fuera de rango.");
    }
        rapido = rapido.next;
    }
    
    while (rapido.next != null) {
        lento = lento.next;
        rapido = rapido.next;
    }
    
    return lento.data;
    }
    
    }