package Academy.DevDojo.LacosDeRepeticao.whiles;

import java.util.Scanner;

public class Aula02ExerciciosImpares {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor desejado: ");
        int numero = teclado.nextInt();
        int i = 0;
        while (i <= numero){
            if (i % 2 != 0)
            {System.out.println("Contador: " + i);}
            i = i + 1;
        }
    }
}
