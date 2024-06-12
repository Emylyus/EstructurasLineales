import Materia.Cola.Cola;
import Materia.Cola.ColaGenerica;
import Materia.Ejercicio_01_sign.SignValidator;
import Materia.Ejercicio_02_sorting.StackSorter;
import Materia.Ejercicio_03_linkedList.LinkedListEjr;
import Materia.ListasEnlazadas.ListaEnlazada;
import Materia.Models.Pantallas;
import Materia.Pilas.Pila;
import Materia.Pilas.PilaGenerica;
import Materia.Ejercicio_01_sign.SignValidator;
import Materia.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Pila pila = new Pila();
        pila.push(10);
        pila.push(20);
        pila.push(30);
        pila.push(40);

        System.out.println("Elemento en la cima de la pila es : "+pila.peek());
        System.out.println("Elemento Retirado de la cima de la pila es (pop) : "+pila.pop());
        System.out.println("Elemento en la cima de la pila es : "+pila.peek());

        System.out.println();
    
        //IMPLEMENTACION DE PILA GENERICA// coje de ultimo a primero
        PilaGenerica<Pantallas> pilaPantallas = new PilaGenerica<>();

        pilaPantallas.push(new Pantallas("Home Page", "/home"));
        pilaPantallas.push(new Pantallas("Menu Page", "/menu"));
        pilaPantallas.push(new Pantallas("Settings Page", "/home/menu/settings"));

        System.out.println("La pila tiene : "+ pilaPantallas.size()+" Elementos");
        System.out.println();

        System.out.println("Estoy en la pantalla:\n\t "+pilaPantallas.peek().getNombre());
        System.out.println("Destruir pantalla:\n\t "+pilaPantallas.pop().getNombre());
        System.out.println("Estoy en la pantalla:\n\t "+pilaPantallas.peek().getNombre());
        System.out.println();

        System.out.println("La pila tiene : "+ pilaPantallas.size()+" Elementos");//se elimina uno
        System.out.println();

        //Implementacion de cola
        Cola colis = new Cola();
        colis.addnode(10);
        colis.addnode(20);
        colis.addnode(30);

        //Mostrar el elemento en el frente
        System.out.println("Elemento en el frente: "+ colis.peek());

        //retirar
        System.out.println("Elemento Retirado: "+colis.remove());
        System.out.println("Elementos en el frente: "+colis.peek());
        
        System.out.println("Elemento Retirado: "+colis.remove());
        System.out.println("Elementos en el frente: "+colis.peek());

        //verificar si l acola esta vacia
        System.out.println("¿Cola Vacia?: "+(colis.isEmpty()?"Si":"No"));
        System.out.println();

        //COLA GENERICA // coje de primero a ultimo
        ColaGenerica<Pantallas> colaPantallas = new ColaGenerica<>();
        
        colaPantallas.addnode(new Pantallas("Home Page", "/home"));
        colaPantallas.addnode(new Pantallas("Menu Page", "/menu"));
        colaPantallas.addnode(new Pantallas("Settings Page", "/home/menu/settings"));
        
        System.out.println("La cola tiene : "+ colaPantallas.size()+" Elementos");
        System.out.println();
        System.out.println("Estoy en la pantalla:\n\t "+colaPantallas.peek().getNombre());
        System.out.println("Destruir pantalla:\n\t "+colaPantallas.remove().getNombre());
        System.out.println("Estoy en la pantalla:\n\t "+colaPantallas.peek().getNombre());
        System.out.println();

        System.out.println("La cola tiene : "+ colaPantallas.size()+" Elementos");//se elimina uno

        SignValidator signos = new SignValidator();// inicializamos la clase 

        System.out.println(signos.isValing("([]){}"));// usamos el is valing para verificar si estabien o no
        System.out.println(signos.isValing("({)}"));

        
        PilaGenerica<Integer> pila2 = new PilaGenerica<>();
        
        pila2.push(4);
        pila2.push(1);
        pila2.push(8);
        pila2.push(3);
        System.out.println("Pila original " + pila2);
        
        StackSorter numeros = new StackSorter();
       numeros.sortStack(pila2);

       System.out.println("Pila ordenada "+ pila2);


       ListaEnlazada lista = new ListaEnlazada();

        lista.addnode(1);
        lista.addnode(4);
        lista.addnode(3);
        lista.addnode(6);
        lista.print();
        lista.deleteNode(1);
        lista.print();
        lista.deleteNode(3);
        lista.print();



        ListaEnlazada listas2 = new ListaEnlazada();

        listas2.addnode(1);
        listas2.addnode(2);
        listas2.addnode(5);
        listas2.addnode(7);
        listas2.addnode(6);

        int position = 1;
        int result = listas2.getByPos(position); //devuelve el dato empezando por el final

        System.out.println("(listaEnlazada) El valor en la posición " + position + " empezando desde el final es: " + result);



        LinkedListEjr list = new LinkedListEjr();

            list.add(1);
            list.add(2);
            list.add(5);
            list.add(7);
            list.add(6);

            int posiciones = 1;
            int resultado = list.getByPos(posiciones); //devuelve el dato empezando por el final

            System.out.println("El valor en la posición " + posiciones + " empezando desde el final es: " + resultado);

        


    }
}
