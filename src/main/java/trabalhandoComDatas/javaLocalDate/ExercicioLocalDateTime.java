package trabalhandoComDatas.javaLocalDate;

import java.time.LocalDateTime;

public class ExercicioLocalDateTime {
    public static void main(String[] args) {
        LocalDateTime data = LocalDateTime.of(2010,5,15,10,0,0,0);
        System.out.println(data);

        LocalDateTime dataAdicionada = data.plusYears(4).plusMonths(6).plusHours(13);
        System.out.println(dataAdicionada);
    }
}
