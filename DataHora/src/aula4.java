import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.time.Duration;

public class aula4 {
    public static void main(String[] args) {
        /* Cálculos com data-hora */
        LocalDate d01 = LocalDate.parse("2022-07-20");
        LocalDateTime d02 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d03 = Instant.parse("2022-07-20T01:30:26Z");

        /* Em java, existem algumas funções que nos ajudam a adicionar e subtrair datas os itens LocalDate, LocalDateTime e Instant */

        // Adicionando dias em uma data:
        LocalDate nextWeek = d01.plusDays(7);
        // Adicionando meses:
        LocalDate nextMonth = d01.plusMonths(1);
        // Adicionando anos:
        LocalDate nextYear = d01.plusYears(1);

        System.out.println("d01 + 1 semana: " + nextWeek);
        System.out.println("d01 + 1 mês: " + nextMonth);
        System.out.println("d01 + 1 ano: " + nextYear);

        // Subtraindo dias em uma data:
        LocalDate lastWeek = d01.minusDays(7);
        // Subtraindo meses:
        LocalDate lastMonth = d01.minusMonths(1);
        // Subtraindo anos:
        LocalDate lastYear = d01.minusYears(1);

        System.out.println("d01 padrão: " + d01);
        System.out.println("d01 - 1 semana: " + lastWeek);
        System.out.println("d01 - 1 mês: " + lastMonth);
        System.out.println("d01 - 1 ano: " + lastYear);
        /* Nota: os métodos também se aplicam ao LocalDateTime, com o adicional de que pode adicionar e subtrair
        * horas (plusHours/minusHours), minutos (plusMinutes/minusMinutes), segundos (plusSeconds/minusSeconds) e
        * nanosegundos (plusNanos/minusNanos) */

        LocalDateTime subWeek = d02.minusDays(7);
        LocalDateTime addWeek = d02.plusDays(7);
        LocalDateTime addHour = d02.plusHours(3);
        LocalDateTime subHour = d02.minusHours(5);
        LocalDateTime addMin = d02.plusMinutes(15);
        LocalDateTime subMin = d02.minusMinutes(10);
        LocalDateTime addSecond = d02.plusSeconds(30);
        LocalDateTime subSecond = d02.minusSeconds(20);

        System.out.println("d02 padrão: " + d02);
        System.out.println("d02 + 3h: " + addHour);
        System.out.println("d02 - 5h: " + subHour);
        System.out.println("d02 + 15 min: " + addMin);
        System.out.println("d02 - 10 min: " + subMin);
        System.out.println("d02 + 30 seg: " + addSecond);
        System.out.println("d02 - 20 seg: " + subSecond);

        /* Para variáveis e objetos Instant, ele utiliza outra forma de operar o tempo, com outros métodos de manipulação */
        Instant addWeekInstant = d03.plus(2, ChronoUnit.DAYS);
        Instant subWeekInstant = d03.minus(2, ChronoUnit.DAYS);

        System.out.println("d03 padrão: " + d03);
        System.out.println("Instant d03 + 2 dias: " + addWeekInstant);
        System.out.println("Instant d03 - 2 dias: " + subWeekInstant);

        /* Duração entre duas data-horas */
        /* Com o objeto Duration, nós conseguimos calcular o tempo entre dois LocalDateTime's da seguinte forma: */
        Duration t1 = Duration.between(subWeek, d02);
        System.out.println("t1 dias: " + t1.toDays());

        /* Para operações com LocalDate, é necessário converter os LocalDate's para LocalDateTime's, da seguinte forma: */
        // Para uma hora específica:
        Duration t2 = Duration.between(lastWeek.atTime(0, 0), d01.atTime(0, 0));
        // Para o começo do dia
        Duration t3 = Duration.between(lastWeek.atStartOfDay(), d01.atStartOfDay());
        // Duration também funciona com objetos Instant
        Duration t4 = Duration.between(subWeekInstant, d03);
        // Nota²: caso eu coloque a data maior primeiro, ele fará a operação e retornará um valor negativo, como se tivesse voltado 2 dias, por exemplo

        System.out.println("t2 dias: " + t2.toDays());
        System.out.println("t3 dias: " + t3.toDays());
        System.out.println("t4 dias: " + t4.toDays());
    }
}