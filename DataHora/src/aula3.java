import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.Instant;
import java.time.ZoneId;

public class aula3 {
    public static void main(String[] args) {
        /* Convertendo data-hora local para global */
        LocalDate d01 = LocalDate.parse("2022-07-02");
        LocalDateTime d02 = LocalDateTime.parse("2022-07-02T01:30:26");
        Instant d03 = Instant.parse("2022-07-02T01:30:26Z");

        /* O ZoneId tem como listar os horários disponíveis no java com o getAvailableZoneIds(), para listar, podemos fazer o seguinte
        * for */
        // for (String s : ZoneId.getAvailableZoneIds()) {
        //     System.out.println(s);
        // }
        /* São mais de 600 fusos diferentes */

        /* Para converter horários globais em horários locais do sistema que o programa roda, é necessário utilizar um método
         * do LocalDate/LocalDateTime junto ao ZoneId, da seguinte forma: */
        LocalDate r1 = LocalDate.ofInstant(d03, ZoneId.systemDefault());
        LocalDateTime r2 = LocalDateTime.ofInstant(d03, ZoneId.systemDefault());
        System.out.println("r1: " + r1);
        System.out.println("r2: " + r2);
        // Nota: o método funciona com LocalDate e LocalDateTime também

        /* Para converter em horários específicos, de países específicos, é da seguinte forma: */
        LocalDateTime r3 = LocalDateTime.ofInstant(d03, ZoneId.of("Europe/Moscow"));
        LocalDateTime r4 = LocalDateTime.ofInstant(d03, ZoneId.of("Portugal"));
        System.out.println("r3 (Horário de Moscou): " + r3);
        System.out.println("r4 (Horário de Portugal): " + r4);

        /* Existe também uma forma de extrair apenas o dia, o mês e o ano, separadamente: */
        System.out.println("d01 (dia): " + d01.getDayOfMonth());
        System.out.println("d01 (mês): " + d01.getMonthValue());
        System.out.println("d01 (ano): " + d01.getYear());
        // Nota²: o método funciona com LocalDate e LocalDateTime também

        /* Assim como também é possível extrair apenas a hora e os minutos separadamente: */
        System.out.println("d02 (hora): " + d02.getHour());
        System.out.println("d02 (minutos): " + d02.getMinute());
        System.out.println("d02 (segundos): " + d02.getSecond());
    }
}