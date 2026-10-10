package model.exceptions;

/* O java nos permite criar exceções personalizadas, que são separadas em dois tipos, elas podem
* extender uma Exception, que nos obriga a tratar a exceção no programa com o try/catch, ou
* RuntimeException, que nos permite deixar essa exceção se propagar, e o compilador não nos obriga
* a tratar. OBS: as exceções de RuntimeException não tratadas, quebrarão o programa */
public class DomainException extends Exception {
    /* Algumas classes de exceção são serializáveis, o processo de serialização consiste em congelar o estado atual do objeto e
     * transformar ele em um fluxo de bytes, que pode ser salvo em um arquivo, enviado pela rede ou compartilhado entre instâncias
     * do JVM. Quando essa classe é serializável, ele precisa ter uma versão, assim se é definida a versão: */
    private static final long serialVersionUID = 1L;

    /* Para que nossa exceção consiga nos retornar a mensagem de erro, é necessário usar o super, para que não seja necessário criar
    * método novo que chama o construtor da classe pai e retorne a mensagem, sendo que as classes pais já tem isso configurado por padrão */
    public DomainException(String msg) {
        super(msg);
    }
}
