import java.util.List;
import java.util.Scanner;

/*
 Criação de um grafo com X vértices (o número de vértices deve ser inserido pelo usuário).
Inserção e remoção de arestas. X
Ponderação e rotulação de vértices. X
Ponderação e rotulação de arestas. X
--------------------------------
Adjacência entre vértices. ?
Vizinhança do vértice. ?
Grau do vértice. ?
Grafo completo. ?
Grafo regular.  ?
Grafo conexo. ?
Grafo acíclico. ?
Grafo euleriano. ?
Busca em profundidade. ?
Busca em largura. ?
Calcular a menor distância de uma origem para todos os outros vértices (Usar Dijkstra). ?
Calcular a menor distância de todos para todos (Usar Floyd-Warshall). ?
 */

public class App {
    public static void menu() {
        System.out.println("\n=== Menu Principal ===");
        System.out.println("1 - Arestas");
        System.out.println("2 - Ponderar arestas ");
        System.out.println("3 - Verificações simples");
        System.out.println("4 - Eplicar algortimos");
        System.out.println("9 - Ver grafo");
        System.out.println("0 - Sair");
        System.out.println("==================");
    }

    public static void functions(Grafo grafo){
        Scanner scan = new Scanner(System.in);
        System.out.println("1 - Adjacencia");
        System.out.println("2 - Vizinhança do vertice");
        System.out.println("3 - Grau do vertice ");
        System.out.println("4 - Grafo completo");
        System.out.println("5 - Grafo regular");
        System.out.println("6 - Grafo conexo");
        System.out.println("7 - Grafo completo");
        System.out.println("8 - Grafo aciclico");
        System.out.println("9 - Grafo euleriano");
        System.out.println("0 - Sair");
        int opção = scan.nextInt();

        switch (opção) {
            case 1: // Adjacência
                System.out.print("Informe os índices dos dois vértices (ex: 0 1): ");
                int v1 = scan.nextInt();
                int v2 = scan.nextInt();
                if (grafo.isAdjacente(v1, v2)) {
                    System.out.println("Os vértices são adjacentes.");
                } else {
                    System.out.println("Os vértices não são adjacentes.");
                }
                break;

            case 2: // Vizinhança
                System.out.print("Informe o índice do vértice: ");
                int v = scan.nextInt();
                List<Vertice> vizinhos = grafo.getVizinhos(v);
                System.out.println("Vizinhos do vértice " + v + ": " + vizinhos);
                break;

            case 3: // Grau
                System.out.print("Informe o índice do vértice: ");
                int vertice = scan.nextInt();
                int grau = grafo.getGrau(vertice);
                System.out.println("Grau do vértice " + vertice + ": " + grau);
                break;

            case 4: // Grafo completo
                if (grafo.isCompleto()) {
                    System.out.println("O grafo é completo.");
                } else {
                    System.out.println("O grafo não é completo.");
                }
                break;

            case 5: // Grafo regular
                if (grafo.isRegular()) {
                    System.out.println("O grafo é regular.");
                } else {
                    System.out.println("O grafo não é regular.");
                }
                break;

            case 6: // Grafo conexo
                if (grafo.isConexo()) {
                    System.out.println("O grafo é conexo.");
                } else {
                    System.out.println("O grafo não é conexo.");
                }
                break;

            case 7: // Grafo acíclico
                if (grafo.isAciclico()) {
                    System.out.println("O grafo é acíclico.");
                } else {
                    System.out.println("O grafo não é acíclico.");
                }
                break;

            case 8: // Grafo euleriano
                if (grafo.isEuleriano()) {
                    System.out.println("O grafo é euleriano.");
                } else {
                    System.out.println("O grafo não é euleriano.");
                }
                break;

            case 0: // Voltar
                System.out.println("Voltando ao menu principal...");
                break;

            default:
                System.out.println("Opção inválida. Tente novamente.");
                break;
        }
    }
    
    public static void algoritimos(Grafo grafo){
        Scanner scan = new Scanner(System.in);
        System.out.println("\n=== Algoritmos em Grafos ===");
        System.out.println("1 - Busca em profundidade (DFS)");
        System.out.println("2 - Busca em largura (BFS)");
        System.out.println("3 - Menor distância de uma origem para todos os outros vértices (Dijkstra)");
        System.out.println("4 - Menor distância entre todos os vértices (Floyd-Warshall)");
        System.out.println("0 - Voltar ao menu principal");
        System.out.print("Escolha uma opção: ");
        int opção = scan.nextInt();

        switch (opção) {
            case 1: // Busca em profundidade (DFS)
                System.out.print("Informe o índice do vértice de origem: ");
                int origemDFS = scan.nextInt();
                System.out.println("Busca em profundidade a partir do vértice " + origemDFS + ":");
                // grafo.buscaProfundidade(origemDFS);
                break;
    
            case 2: // Busca em largura (BFS)
                System.out.print("Informe o índice do vértice de origem: ");
                int origemBFS = scan.nextInt();
                System.out.println("Busca em largura a partir do vértice " + origemBFS + ":");
                // grafo.buscaLargura(origemBFS);
                break;
    
            case 3: // Dijkstra
                System.out.print("Informe o índice do vértice de origem: ");
                int origemDijkstra = scan.nextInt();
                System.out.println("Menores distâncias a partir do vértice " + origemDijkstra + " usando Dijkstra:");
                // grafo.dijkstra(origemDijkstra);
                break;
    
            case 4: // Floyd-Warshall
                System.out.println("Menores distâncias entre todos os vértices usando Floyd-Warshall:");
                // grafo.floydWarshall();
                break;
    
            case 0: // Voltar ao menu principal
                System.out.println("Voltando ao menu principal...");
                break;
    
            default:
                System.out.println("Opção inválida. Tente novamente.");
                break;
        }
    }
    
    public static void addRemov(Grafo grafo, Scanner scan) {
        System.out.println("1- Adicionar\n2- Remover");
        int op = scan.nextInt();
        if (op == 1) {
            System.out.println("Selecione 2 vértices para adicionar uma aresta:");
            System.out.println("Vértices disponíveis: ");
            for (int i = 0; i < grafo.getVertices().size(); i++) {
                System.out.println(i + ": " + grafo.getVertices().get(i).getNome());
            }
            System.out.print(": ");
            int index1 = scan.nextInt();
            System.out.print(": ");
            int index2 = scan.nextInt();

            if (index1 >= 0 && index1 < grafo.getVertices().size() && index2 >= 0
                    && index2 < grafo.getVertices().size()) {
                Vertice origem = grafo.getVertices().get(index1);
                Vertice destino = grafo.getVertices().get(index2);
                grafo.inserirAresta(origem, destino);
            } else {
                System.out.println("Índices inválidos. Tente novamente.");
            }
        } else if (op == 2) {
            System.out.println("Qual aresta irá remover?");
            for (int i = 0; i < grafo.getArestas().size(); i++) {
                System.out.println(i + ": " + grafo.getArestas().get(i).getNome());
            }
            System.out.print("Informe o índice da aresta a ser removida: ");
            int index = scan.nextInt();

            if (index >= 0 && index < grafo.getArestas().size()) {
                Aresta aresta = grafo.getArestas().get(index);
                grafo.removerAresta(aresta.getOrigem(), aresta.getDestino());
            } else {
                System.out.println("Índice inválido. Aresta não encontrada.");
            }
        } else {
            System.out.println("Opção inválida.");
        }
    }

    public static Grafo ponderarArestas(Grafo grafo, Scanner scan) {
        List<Aresta> arestas = grafo.getArestas();
        System.out.println(arestas);
        int i = 0;
        for (Aresta aresta : arestas) {
            System.out.println("Qual o peso da aresta " + aresta.getNome() + "?");
            int peso = scan.nextInt();
            aresta.setPeso(i); // Define o peso como o índice
            arestas.get(i).setPeso(peso);
            i++;
        }
        return grafo;
    }

    public static void main(String[] args) throws Exception {
        boolean saida = true;
        Scanner scan = new Scanner(System.in);

        System.out.println("Tamanho do grafo: ");
        int tamanho = scan.nextInt();

        Grafo grafo = new Grafo(tamanho);

        // mostrarListaAdj();

        // Menu principal
        while (saida) {
            System.out.println("Escolha uma opção: ");
            menu();
            int opção = scan.nextInt();
            switch (opção) {
                case 1:
                    addRemov(grafo, scan);
                    break;
                case 2:
                    ponderarArestas(grafo, scan);
                    break;
                case 3:
                    functions(grafo);
                    break;
                case 4:
                    algoritimos(grafo);
                    break;
                case 9:
                    System.out.println(grafo.toString());
                    break;
                case 0:
                    saida = false;
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
    }
}
