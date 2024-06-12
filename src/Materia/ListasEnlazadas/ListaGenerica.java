package Materia.ListasEnlazadas;

public class ListaGenerica <T> {
    public Node<T> head;

    public ListaGenerica(){

    }

    public void addNode(T value){
        if(head == null){
            head = new Node<>(value);
            return;
        }

        Node<T> current = head;
        while (current.next != null){
            current = current.next;
        }
        current.next = new Node<>(value);
    }

    // Metodo para eliminar
    public void deleteNode(T value){
        if(head == null) return; // No hay elementos no hagas nada
        if(head.value.equals(value)){
            head = head.next;
            return;
        }
        Node<T> current = head;
        while(current.next != null){
            if(current.next.value.equals(value)){
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }

    public int size(){
        int count = 0;
        Node<T> current = head;
        while(current != null){
            count++;
            current = current.next;
        }
        return count;
    }

    public void print(){
        if(head == null){
            System.out.println("Lista Vacia");
            return;
        }
        Node<T> current = head;
        while(current.next != null){
            System.out.println("Node -> " + current.value);
            current = current.next;
        }
        System.out.println("Node -> " + current.value);
        System.out.println("Fin de la lista");
    }

    public static class Node<T> {
        T value;
        Node<T> next;

        public Node(T value){
            this.value = value;
            this.next = null;
        }
    }
}
