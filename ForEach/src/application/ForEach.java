package application;

public class ForEach {
    public static void main(String[] args) {
        String[] vect = new String[] {"Maria", "Bob", "Alex"};

        // Chamada comum com for tradicional, percorrendo pelos itens do vetor
        for (int i = 0; i < vect.length; i++) {
            System.out.print(vect[i] + "\n");
        }

        // Forma de escrever o foreach em java
        System.out.print("Chamada com foreach: \n");
        for (String obj : vect) {
            System.out.println(obj);
        }
    }
}
