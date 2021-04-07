package trabalhandoComDatas.javaDate;

import java.time.Instant;
import java.util.Date;

public class Exemplo004 {
    public static void main(String[] args) {

        Long currentTimeMillis = System.currentTimeMillis();
        Date dataInicio = new Date(currentTimeMillis);

        Instant instant = dataInicio.toInstant();
        System.out.println(instant);
    }
}
