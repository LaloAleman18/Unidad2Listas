import java.util.Scanner;
 
public class App {
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);

        SinglyLinkedList lista = new SinglyLinkedList();

        lista.insertar(10);
        lista.insertar(20);
        lista.insertar(30);
        lista.mostrar();  

        /*
        int numeroDeseado;
        System.out.println();
        System.out.print("Escribe el valor que deseas encontrar:");
        numeroDeseado = leer.nextInt();

        lista.buscar(numeroDeseado); */

        int numeroEliminar;
        System.out.println();
        System.out.print("Escribe el valor que deseas eliminar:");
        numeroEliminar = leer.nextInt();

        lista.eliminar(numeroEliminar);
        lista.mostrar();
    }
}