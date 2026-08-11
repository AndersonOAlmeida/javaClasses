package aulas;

// import usada para criação de listas
import java.util.List;

// import do arraylist
import java.util.ArrayList;
import java.util.stream.Collectors;

public class aula1 {
    public static void main(String[] args) {
        /* Listas e vetores se parecem um pouco, são ambas estruturas para guardarem mais de um valor em apenas uma variável.
        * Ambos armazenam apenas dados do mesmo tipo, ordenados por posições. A diferença entre vetor e lista é: quando no vetor você
        * iniciava o vetor especificando a quantidade de elementos que ele tem, na lista você inicia ela vazia e vai preenchendo conforme
        * a demanda de dados a serem inseridos. */

        // Vantagens: tamanho variável, facilidade para fazer inserções
        // Desvantagens: Acesso sequencial aos elementos (dependendo da implementação da lista, a navegação pelos itens é otimizada)
        // Com a classe ArrayList, a lista é otimizada e se mistura lista e vetor em um item, minimizando a desvantagem de acesso

        // Abaixo, a forma de se criar e instanciar uma lista, utilizando wrapper classes, pois listas não aceitam valores primitivos
        // Para instanciar um tipo que seja uma interface, eu tenho que instanciar uma classe que implementa a interface.
        List<String> list = new ArrayList<>();

        // A seguir, algumas formas de manipular a lista
        // forma de adicionar itens na lista
        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");

        // forma de adicionar itens em um índice específico, passando primeiro o índice e depois o valor a ser adicionado
        list.add(2, "Marco");
        list.add(4, "Anderson");

        // forma de ver o tamanho da lista
        System.out.println(list.size());

        // foreach para percorrer os itens inseridos na lista
        for (String x : list) {
            System.out.println(x);
        }
        System.out.println("---------  //  ---------");

        // forma de remover itens da lista
        // por comparação de valores
        list.remove("Anderson");

        // por índice
        // list.remove(1);

        // para remover itens de uma forma específica, é necessário lógica para isso, da seguinte forma:
        // ex: desejo remover todos os itens que iniciam com a letra M
        list.removeIf(x -> x.charAt(0) == 'M');

        // foreach para percorrer os itens inseridos na lista
        for (String x : list) {
            System.out.println(x);
        }
        System.out.println("---------  //  ---------");

        // para achar a posição de alguém na lista, é necessário usar o indexOf, e passar o parâmetro que gostaríamos de encontrar
        System.out.println("Index of Bob: " + list.indexOf("Bob"));
        // caso tentemos buscar um item que não existe na lista, ele retorna como -1 no console. ex
        System.out.println("Index of Marco: " + list.indexOf("Marco"));
        System.out.println("---------  //  ---------");

        /* Para filtrarmos os itens por um parâmetro específico, é necessário criarmos uma lista nova com esse filtro e retornarmos essa
        * nova lista */
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());

        /* O java não consegue fazer um filtro com predicado originalmente, para isso, devemos converter a lista em stream, filtrar
        * e retornar os valores na nova lista criada */

        for (String x : result) {
            System.out.println(x);
        }
        System.out.println("---------  //  ---------");

        /* Para encontrarmos o primeiro elemento que atende a um predicado, devemos fazer da seguinte forma */
        String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        System.out.println(name);
        /* nesta lógica de predicados da linha 81, ele transforma a lista em stream, filtra pelos nomes que iniciam com A,
        * encontra o primeiro e imprime, caso ele não ache, ele irá retornar null */
    }
}
