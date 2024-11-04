import java.util.ArrayList;
import java.util.Scanner;

public class Inteiros {
    public static void main(String[] args) {
        ArrayList<Integer> listaNumeros = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira 10 números inteiros:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            int numero = scanner.nextInt();
            listaNumeros.add(numero);
        }

        // COmmit
        System.out.println("\nLista inicial: " + listaNumeros);

        String continuar;
        do {
            System.out.print("Informe a posição (0 a " + (listaNumeros.size() - 1) + ") do número que deseja remover: ");
            int posicao = scanner.nextInt();

            if (posicao >= 0 && posicao < listaNumeros.size()) {
                listaNumeros.remove(posicao);
                System.out.println("Número removido.");
            } else {
                System.out.println("Posição inválida.");
            }

            System.out.println("Tamanho atual da lista: " + listaNumeros.size());
            System.out.println("Números restantes: " + listaNumeros);

            System.out.print("Deseja remover outro número? (s/n): ");
            continuar = scanner.next();
        } while (continuar.equalsIgnoreCase("s") && !listaNumeros.isEmpty());

        System.out.println("\nTamanho final da lista: " + listaNumeros.size());
        System.out.println("Números que permaneceram na lista: " + listaNumeros);

        scanner.close();
    }
}
