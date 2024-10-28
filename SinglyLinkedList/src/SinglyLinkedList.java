public class SinglyLinkedList {
    Nodo cabeza;

    public SinglyLinkedList() {
        this.cabeza=null;
    }

    public void insertar(Integer dato){
        //Crear un nodo
        Nodo nuevoNodo = new Nodo(dato);

        //Verificar si la lsta esta vacia
        if (cabeza == null) {
            //Coloca el nodo nuevo como la cabeza
            cabeza = nuevoNodo;
        } else {
            Nodo temp = cabeza;//Iniciamos desde la cabeza (El primero ps)
            // Recorremos todos os nodos hasta encontrar un null en las referencias
            while (temp.siguiente != null) {
                temp= temp.siguiente;
            }
            temp.siguiente=nuevoNodo;
        }
    }

    public void mostrar(){
        Nodo temp = cabeza; //Comenzamos desde la cabeza(inicio)
        //Mientras temp no sea nulo
        while (temp != null) {
            System.out.print(temp.dato + "->");
            temp = temp.siguiente;
        }
        System.out.print("null");
    }

    // Metodo Buscar
    public boolean buscar(Integer valor) {
        //Primer paso
        if (cabeza == null) {
            System.out.println("La lista esta vacia");
            return false;
        } else {
        //Segundo paso
            Nodo temp = cabeza;//Iniciamos desde la cabeza (El primero ps)
            // Recorremos todos los nodos hasta encontrar un null en las referencias
            while (temp.siguiente != null) {
                //Tercer paso
                if (temp.dato == valor) {
                    System.out.println("Se encontro el dato deseado, el cual es: " + valor);
                    return true;
                // Cuarto paso
                } else {
                    System.out.println("No se encotro el dato deseado");
                    return false;
                }
            } 
        }
        return false;
    }
    public void eliminar(Integer valor) {
        if (cabeza == null) { //Averiguar si la lista esta vacia
            System.out.println("No se puede eliminar, por que la lista esta vacia");
        }
        if (cabeza.dato == valor) { // Averiguar si el elemento a eliminar es la cabeza
            cabeza = cabeza.siguiente;
            return;
        }
        Nodo temp = cabeza;
        Nodo anterior = null;
        while (temp.siguiente != null && temp.dato != valor) { // Recorrer hasta encontrar el nodo con el valor 
            anterior = temp;
            temp = temp.siguiente;
        }
        if (temp == null) {
            System.out.println("No se encontro el valor");
            return;
        }
        anterior.siguiente = temp.siguiente;
        System.out.println("Se elimino correctamente: " + valor);
    }
}