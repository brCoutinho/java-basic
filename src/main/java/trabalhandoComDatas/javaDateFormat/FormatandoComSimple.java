package trabalhandoComDatas.javaDateFormat;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatandoComSimple {
    public static void main(String[] args) {
        Date agora = new Date();

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String dataFormatada = formatter.format(agora);
        System.out.println(dataFormatada);
    }
}
