import Materia.Cola.Cola;
import Materia.Cola.ColaGenerica;
import Materia.Models.Pantallas;
import Materia.Pilas.Pila;
import Materia.Pilas.PilaGenerica;

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


    }
}
