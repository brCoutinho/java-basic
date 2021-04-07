package trabalhandoComDatas.javaDateFormat;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ExercicioFormatacao {

    //Converter data atual para formato com minutos, segundos e milésimos
    public static void main(String[] args) {
        Date agora = new Date();

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy' 'HH:mm:ss:SSS");
        String dataFormatada = formatter.format(agora);
        System.out.println(dataFormatada);
    }
}
