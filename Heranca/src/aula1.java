public class aula1 {
    public static void main(String[] args) {
        /* Conceito */
        /* É um tipo de associação que permite que uma classe herde TODOS os dados e comportamentos de outra */

        /* Definições Importantes */
        /* Herança é uma definição é-um, ou seja, todas as subclasses que herdarem outra, ela é uma classe daquela, que pode ter coisas
        * a mais implementadas. No exemplo feito, uma Conta empresarial (BusinessAccount) é uma Conta (Account), pois herda e tem tudo
        * o que a conta normal tem. O conceito de generalização (classes genéricas) e especialização (classes específicas),
        * superclasses (classe base) e subclasses (classe derivada), ainda no exemplo feito, a Conta é uma classe genérica e uma
        * superclass, por ser uma conta base, que tem alguns atributos que serão eventualmente reutilizados por outras classes, e a
        * conta empresarial é uma subclasse e uma classe específica, por herdar tudo que a conta base tem, porém, com o adicional dos
        * seus próprios métodos e atributos */

        /* Vantagens */
        /* Reuso e Polimorfismo */

        /* Sintaxe */
        /* class A extends B */

        /* Sobreposição */
        /* O Java permite que os mesmos métodos possam ser reescritos nas subclasses e superclasses, o mesmo método da superclasse pode ser sobreposto
        * nas subclasses, por motivos diferentes. Dentro do nosso exemplo, imagine que o saque (withdraw) na Conta normal, deve ter um desconto de 5.00
        * porém, nas contas poupanças, esse desconto não deve ser aplicado, a forma que podemos fazer esse mesmo método na subclasse, é utilizando @Override
        * antes do método, para que o compilador consiga identificar qual método esta sendo sobrescrito, e consiga informar ao dev se tem alguma coisa errada
        * com o nome do método */
    }
}
