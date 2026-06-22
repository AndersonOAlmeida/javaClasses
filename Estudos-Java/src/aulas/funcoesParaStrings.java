package aulas;

public class funcoesParaStrings {
	public static void main(String[] args) {
		// algumas funções interessantes para tratamento de strings no java e como funcionam
		
		// primeiro, vamos declarar uma variavel com uma frase original
		String original = "Três Pratos de Trigo para Três Tigres Tristes        ";
		// ja vc entende o pq dos espaços, cauma
		
		/* Agora, para poder tratar essas strings, a gente precisa declarar outras variávveis, puxando a
		variavel original e tratando com o método que nós queremos, por que não da pra usar os metodos
		diretamente no código */
		
		// para deixar todos os caracteres em minúsculo
		String s01 = original.toLowerCase();
		
		// para deixar todos os caracteres em maiúsculo
		String s02 = original.toUpperCase();
		
		// para remover os espaços no fim da frase
		String s03 = original.trim();
		
		// para pegar de um caractere específico até o final da frase
		String s04 = original.substring(4);
		
		/* para pegar de um caractere específico até outro específico, mas no seguinte funcionamento
		ele vai inserir o primeiro parametro, mas excluir o ultimo, então no caso, ele pega do 4 até
		o 7, o caractere na posição 8, não entra */
		String s05 = original.substring(4, 8);
		
		/* para substituir um caractere na frase, no exemplo, todos os a minusculos serão substituídos
		por um x minúsculo, no outro, ele substitui toda uma palavra por outra */
		String s06 = original.replace('a', 'x');
		String s07 = original.replace("Três", "treis");
		
		/* Aqui ele pega a posição onde a palavra aparece, o indexOf pega a primeira e o last pega a 
		última posição */
		int i = original.indexOf("Três");
		int j = original.lastIndexOf("Três");
		
		System.out.println("-" + s01 + "-");
		System.out.println("-" + s02 + "-");
		System.out.println("-" + s03 + "-");
		System.out.println("-" + s04 + "-");
		System.out.println("-" + s05 + "-");
		System.out.println("-" + s06 + "-");
		System.out.println("-" + s07 + "-");
		
		// da tb pra transformar uma string em um array de palavras
		
		String s = "potato apple lemon";
		
		/* aqui no split eu to usando apenas o espaço em branco, porém, pode usar qualquer caractere,
		 como uma virgula, ponto e virgula, ponto */
		String[] array = s.split(" ");
		
		// para puxar essas palavras que foram separadas, só dar um print nos index do array
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
	}
}
