package arrays;

public class ArraySimples {
    public static void main(String[] args) {

        int[] meuPrimeiroArray = new int[7];
        int[] meuSegundoArray = {12,32,12,6,8,89,64};

        System.out.println(meuPrimeiroArray[2]);
        System.out.println(meuSegundoArray[2]);

        meuSegundoArray[2] = 10;
        System.out.println(meuSegundoArray[2]);

        System.out.println(meuSegundoArray.length);
    }
}
