import java.util.LinkedList;
import java.util.Queue;

public class fila {
    public static void main(String[] args) {

        Queue<String> carros = new LinkedList<>();


        carros.add("BMW"); //adiciona na cauda / add tothe tail
        carros.add("ford"); //adiciona na cauda / add tothe tail
        carros.add("tesla"); //adiciona na cauda / add tothe tail

        System.out.println("topo " + carros.peek()); // mostrar o elemento / show the element

        System.out.println("topo " + carros.poll()); // mostrar e retirar o elemento do topo (cabeca) / show and erase the element on the top

        System.out.println(carros);
        System.out.println(carros.isEmpty()?"vazia / empty":"não vazia / not empty");
    }
}
