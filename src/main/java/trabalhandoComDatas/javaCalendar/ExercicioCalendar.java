package trabalhandoComDatas.javaCalendar;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class ExercicioCalendar {
    /*
    Exercício: Caso o dia do vencimento da data passada caia em um sábado ou domingo
    o cliente poderá pagar na segunda seguinte.
    */

    public static void main(String[] args) throws ParseException {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite a data de vencimento: ");
        String dataRecebida = s.nextLine();

        Locale.setDefault (new Locale("pt", "BR"));
        DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date date = formatter.parse(dataRecebida);
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);

        cal.add(Calendar.DATE,10);
        switch (cal.get(Calendar.DAY_OF_WEEK)) {
            case Calendar.SUNDAY:
                cal.add(Calendar.DATE,1);
                break;
            case Calendar.SATURDAY:
                cal.add(Calendar.DATE,2);
                break;
        }

        System.out.printf("%tc\n", cal);
    }
}
