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
    
        //IMPLEMENTACION DE PILA GENERICA
        PilaGenerica<Pantallas> pilaPantallas = new PilaGenerica<>();

        pilaPantallas.push(new Pantallas("Home Page", "/home"));
        pilaPantallas.push(new Pantallas("Menu Page", "/menu"));
        pilaPantallas.push(new Pantallas("Settings Page", "/home/menu/settings"));

        System.out.println("Estoy en la pantalla:\n\t "+pilaPantallas.peek().getNombre());
        System.out.println("Destruir pantalla:\n\t "+pilaPantallas.pop().getNombre());
        System.out.println("Estoy en la pantalla:\n\t "+pilaPantallas.peek().getNombre());
        
    }
}
