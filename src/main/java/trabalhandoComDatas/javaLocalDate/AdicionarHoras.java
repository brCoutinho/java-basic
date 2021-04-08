package trabalhandoComDatas.javaLocalDate;

import java.time.LocalTime;

public class AdicionarHoras {
    public static void main(String[] args) {
        LocalTime agora = LocalTime.now();
        LocalTime daquiUmaHora = agora.plusHours(1);
        System.out.println(agora);
        System.out.println(daquiUmaHora);
    }
}
