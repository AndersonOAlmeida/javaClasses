import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class aula2 {
    public static void main(String[] args) {
        /* No arquivo aula1, vimos como formatar um formato de data para o ISO8601, nessa aula vamos ver como fazer o inverso, usaremos
        * um valor de data no formato ISO8601, formatado para a data que utilizamos. */

        LocalDate d01 = LocalDate.parse("2022-07-20");
        LocalDateTime d02 = LocalDateTime.parse("2022-07-20T01:30");
        Instant d03 = Instant.parse("2022-07-20T01:30:26Z");

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        /* com o metodo format do java, conseguimos formatar uma data do padrão ISO8601 para o padrão definido anteriormente no Formatter
         * As formas de formatar a data são: */
        System.out.println("d01: " + d01.format(fmt1));
        System.out.println("d01: " + fmt1.format(d01));
        System.out.println("d01: " + d01.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        // Nota: todas essas 3 formas de formatar resultarão no mesmo resultado de output

        System.out.println("d02: " + d02.format(fmt2));
        System.out.println("d02: " + fmt2.format(d02));
        System.out.println("d02: " + d02.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")));
        // Nota: todas essas 3 formas de formatar resultarão no mesmo resultado de output
        System.out.println("d02: " + d02.format(fmt1));
        // Nota²: é possível utilizar o fmt1 para formatar datas com horas, porém ele não trará as horas (o contrário não é possível)

        /* O método format só é utilizado em datas locais, com o Instant, não é possível utilizar, é necessário outra forma de formatar
        * datas internacionais */

        // Primeiro eu crio um novo formatter, com o padrão normal de dia com hora, e adiciono o metodo withZone, com o ZoneId do sistema
        // Esse método apenas funciona com Instant, LocalDate e/ou LocalDateTime não funcionam nesses padrões.
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        System.out.println("d03: " + fmt3.format(d03));
    }
}
