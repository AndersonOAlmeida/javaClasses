package entities;

public class Triangle {

	public double a;
	public double b;
	public double c;
	
	/* public quer dizer que esse método pode ser acessado por outros arquivos dentro do projeto,
	desde que for importado da forma certa, pode ser setado como private, que significa que apenas
	o arquivo atual pode acessar o método */
	/* esse double significa que o método irá retornar um valor double, pode ser setado como int,
	 * String ou qualquer outro tipo, desde que ele vá retornar esse tipo de dado, caso o método
	 * não vá retornar nada, é utilizado o void */
	/* o ultimo é o nome do método, ele tem o nome do seguido dos parametros que ele irá usar */
	public double area() {
		double p = (a + b + c) / 2.0;
		double result = Math.sqrt(p * p-a * p-b * p-c);
		return result;
	}
}
