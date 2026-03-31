import java.util.LinkedList;
import java.util.Queue;

public class fila {
    public static void main(String[] args) {

        Queue<String> carros = new LinkedList<>();

        carros.add("BMW");
        carros.add("ford");
        carros.add("tesla");

        System.out.println("topo " + carros.peek()); // mostrar o elemento

       // System.out.println("topo " + carros.poll()); // mostrar e retirar o elemento do topo

        System.out.println(carros);
        System.out.println(carros.isEmpty()?"vazia":"com elementos");
    }
}
