package listacircular;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListaCircular lista = new ListaCircular();
        int opt = -1;
        while (opt != 0) {
            System.out.println("\n=== Lista Encadeada Circular ===");
            System.out.println("1. Inserir no início");
            System.out.println("2. Inserir no fim");
            System.out.println("3. Buscar");
            System.out.println("4. Remover");
            System.out.println("5. Listar");
            System.out.println("0. Sair");
            System.out.print("Escolha: ");
            try {
                opt = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                opt = -1;
            }
            switch (opt) {
                case 1 -> {
                    System.out.print("Valor: ");
                    int v = Integer.parseInt(sc.nextLine());
                    lista.insertAtBeginning(v);
                    System.out.println("=> Inserido no início.");
                }
                case 2 -> {
                    System.out.print("Valor: ");
                    int v = Integer.parseInt(sc.nextLine());
                    lista.insertAtEnd(v);
                    System.out.println("=> Inserido no fim.");
                }
                case 3 -> {
                    System.out.print("Valor a buscar: ");
                    int v = Integer.parseInt(sc.nextLine());
                    System.out.println(lista.contains(v) ? "Encontrado." : "Não encontrado.");
                }
                case 4 -> {
                    System.out.print("Valor a remover: ");
                    int v = Integer.parseInt(sc.nextLine());
                    System.out.println(lista.remove(v) ? "Removido." : "Valor não existe.");
                }
                case 5 -> System.out.println("Lista: " + lista.listAll());
                case 0 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida.");
            }
        }
        sc.close();
    }
}
