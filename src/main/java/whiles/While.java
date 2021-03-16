package whiles;

public class While {
    public static void main(String[] args) {
        var x = 0;

        //Testa condição antes
        while(x < 1){
            System.out.println(x);
            x++;
        }

        //Testa a condição depois
        var y = 0;

        do{
            System.out.println(y);
        } while (y++ < 1);
    }
}
