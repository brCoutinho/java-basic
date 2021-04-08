package trabalhandoComDatas.javaLocalDate;

import java.time.LocalDateTime;

public class ExemploLocalDateTime {
    public static void main(String[] args) {
        LocalDateTime agora = LocalDateTime.now();
        LocalDateTime futuro = agora.plusDays(14).plusHours(1).plusSeconds(31);

        System.out.println(agora);
        System.out.println(futuro);
    }
}
