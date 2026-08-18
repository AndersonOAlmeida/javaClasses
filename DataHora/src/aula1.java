import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class aula1 {
    public static void main(String[] args) {
        /* Conceitos: */
        /* Data-Hora Local: data-hora local é armazenada sem fuso horário, sendo a hora OPCIONAL (ano-mês-dia-[hora])
        * Data-Hora Global: data-hora global é armazenada com fuso horário, sendo a hora obrigatória (ano-mês-dia-hora)
        * Duração: também é possível saber o tempo decorrido entre duas data-hora */

        /* Data-Hora Global é importante para sistemas, bancos de dados e APIs que são usadas internacionalmente. Pois diversas
        * pessoas de diferentes lugares podem acessar o item, e o sistema conseguirá fazer o registro da hora correta para aquela
        * região */

        /* Data-Hora Local já é mais usual em sistemas locais, por exemplo, um sistema interno de uma loja ou empresa, que não
        * necessita a hora local de outro lugar, pois aquela data ficará apenas naquele sistema. Ou para guardar informações como
        * data de nascimento e afins. */

        /* Timezones / Fuso Horários */
        /* GMT - Greenwich Mean Time
        * Equivalente ao horário de Londres, usa o padrão de horário UTC - Coordinated Universal Time, e também é chamado de Z time */
        /* A medida de horario em GMT é utliziada pela referência do Meridiano de Greenwich, que marca a hora 0, e vai aumentando ou
        * diminuindo conforme a localidade. Ex: O horário de São Paulo usa o GMT-3, por estar 3 horas atrasados em referência ao
        * Meridiano, que se encontra em Londres.
        * Algumas linguagens usam o horário setando pela localidade, por exemplo, o php usa a forma America/Sao_Paulo para setar
        * o horário utilizado em São Paulo. */

        /* Padrão ISO 8601 */
        /* O padrão ISO 8601 consiste em inserir os horários em um padrão definido. O padrão é o seguinte:
        * Ano-mês-diaTHora:minuto:segundo
        * Exemplo: hoje (17/08/02026 às 13:29) seria escrito 2026-08-17T13:29:3.049 */

        /* Operações com data-hora */
        /* Instanciação: */

        // Instanciando a data de forma local sem horário
        LocalDate d01 = LocalDate.now();
        // Instanciando a data de forma local com horário
        LocalDateTime d02 = LocalDateTime.now();
        // Instanciando a data de forma global, com base (por padrão) no GMT de Londres
        Instant d03 = Instant.now();

        /* O método estático .now() pega o horário no instante que a variável é criada. */

        System.out.println("d01: " + d01);
        System.out.println("d02: " + d02);
        System.out.println("d03: " + d03);

        /* Formatando horários para o padrão ISO 8601 */
        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
        Instant d07 = Instant.parse("2022-07-20T01:30:26-03:00");

        // O método parse converte uma string de texto para um objeto LocalDateTime ou Instant
        /* O java por padrão já converte os valores data-hora para o padrão ISO 8601 utilizando por padrão o .toString, caso precise
         * fazer essa conversão, de um horário normal para a ISO 8601, fazendo a chamada do .toString(), ele consegue converter
         * automáticamente o horário inserido */

        System.out.println("d04: " + d04);
        System.out.println("d05: " + d05);
        System.out.println("d06: " + d06);
        System.out.println("d07: " + d07);

        /* Formatando os tipos de data-hora em java, transformando um jeito de inserir datas no padrão ISO 8601 */
        // Formatando apenas dia
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate d08 = LocalDate.parse("20/07/2022", fmt1);

        // Inserindo dia e hora formatado
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30", fmt2);

        /* Fomra de inserir data separadamente, sendo um atributo por vez */
        // Inserindo apenas o dia
        LocalDate d10 = LocalDate.of(2022, 07, 20);
        // Inserindo o dia com as horas
        LocalDateTime d11 = LocalDateTime.of(2022, 07, 20, 01, 30);

        System.out.println("d08: " + d08);
        System.out.println("d09: " + d09);
        System.out.println("d10: " + d10);
        System.out.println("d11: " + d11);
    }
}
