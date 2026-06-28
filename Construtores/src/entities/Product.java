package entities;

public class Product {
	// atributos
	/*
	 * Existem boas práticas para proteção de dados no código, para podermos
	 * proteger os dados, precisamos encapsula-los, de forma que o acesso dele seja
	 * restrito e não cause inconsistências nas informações da classe, dessa forma,
	 * podemos setar os atributos da classe como private, invés de public
	 */
	private String name;
	private double price;
	private int quantity;

	// construtores
	/*
	 * Posicionando o construtor sempre antes dos métodos e depois dos atributos, o
	 * construtor é setado igual a um método, porém ele não retorna nenhum dado, por
	 * isso não recebe nenhuma tipagem, como void, double/int ou String ou static.
	 * Caso eu precise de um construtor para setar como um objeto, eu posso criar um
	 * construtor vazio, que funciona igual a classe funcionava sem o construtor,
	 * setando os valores como null e/ou 0
	 */
	public Product() {
	}

	public Product(String name, double price, int quantity) {
		/*
		 * a palavra this. referencia aos atributos externos ao construtor, ao construir
		 * o construtor, caso eu coloque o atributo sem o this., ele referencia a
		 * variavel local, e não aos atributos da entidade (variáveis locais são as
		 * variáveis que estão dentro do parenteses no construtor/metodo, e os atributos
		 * externos são os setados no início do código)
		 */
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	/*
	 * Eu posso também sobrecarregar esse construtor, no exemplo em questão, caso eu
	 * precise cadastrar um produto que não tenha estoque, eu posso criar um
	 * construtor que colete apenas o nome e o preço do item. Essa múltipla criação
	 * de construtores no java é chamada de sobrecarga, eu sobrecarrego a classe
	 * Product com vários construtores
	 */
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
		// lembrando que o construtor ja seta os valores como 0 ou null
	}

	// métodos
	/*
	 * Para podermos alterar as informações dos atributos, devemos criar métodos
	 * para podermos alterá-los, em um sistema robusto nenhum sistema deixa seus
	 * atributos abertos para edição direta no código, e sim métodos para alterar.
	 * Por padrão, setamos os nomes desses métodos com a regra do camel case, e com
	 * as palavras 
	 */

	// métodos para consultar e definir os nomes
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// métodos para consultar e definir os preços
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	public String toString() {
		return "Product data: " + name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());
		/*
		 * String.format converte uma variável em string e formata ela pra deterrminado
		 * tipo de variável, utilizando primeiro a máscara e depois a variável ou método
		 * a ser convertido
		 */
	}
}