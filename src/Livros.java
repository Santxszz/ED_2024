import java.util.ArrayList;
import java.util.Scanner;

public class Livros {
    public static void main(String[] args) {
        ArrayList<String> listaLivros = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nMenu:");
            System.out.println("1) Adicionar livro");
            System.out.println("2) Verificar se um livro está na lista");
            System.out.println("3) Encontrar a posição de um livro");
            System.out.println("4) Exibir lista completa de livros");
            System.out.println("5) Remover um livro pelo nome");
            System.out.println("6) Exibir tamanho da lista e livros restantes");
            System.out.println("0) Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();  // Limpar o buffer

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do livro: ");
                    String livro = scanner.nextLine();
                    listaLivros.add(livro);
                    System.out.println("Livro adicionado.");
                    break;

                case 2:
                    System.out.print("Digite o nome do livro para verificar: ");
                    livro = scanner.nextLine();
                    if (listaLivros.contains(livro)) {
                        System.out.println("O livro está na lista.");
                    } else {
                        System.out.println("O livro não está na lista.");
                    }
                    break;

                case 3:
                    System.out.print("Digite o nome do livro para encontrar a posição: ");
                    livro = scanner.nextLine();
                    int posicao = listaLivros.indexOf(livro);
                    if (posicao != -1) {
                        System.out.println("O livro está na posição: " + posicao);
                    } else {
                        System.out.println("O livro não foi encontrado na lista.");
                    }
                    break;

                case 4:
                    System.out.println("Lista completa de livros:");
                    for (String l : listaLivros) {
                        System.out.println("- " + l);
                    }
                    break;

                case 5:
                    System.out.print("Digite o nome do livro para remover: ");
                    livro = scanner.nextLine();
                    if (listaLivros.remove(livro)) {
                        System.out.println("Livro removido.");
                    } else {
                        System.out.println("Livro não encontrado.");
                    }
                    break;

                case 6:
                    System.out.println("Tamanho atual da lista: " + listaLivros.size());
                    System.out.println("Livros restantes:");
                    for (String l : listaLivros) {
                        System.out.println("- " + l);
                    }
                    break;

                case 0:
                    System.out.println("Saindo do programa.");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 0);

        scanner.close();
    }
}
