package trabalhandoComDatas.javaCalendar;

import java.util.Calendar;

public class Exemplo005 {
    public static void main(String[] args) {
        Calendar agora = Calendar.getInstance();
        System.out.println(agora.getTime());

        agora.add(Calendar.DATE,-4);
        agora.add(Calendar.MONTH,-2);
        agora.add(Calendar.YEAR,-24);

        System.out.println("Meu nascimento foi em: " + agora.getTime());
    }
}
