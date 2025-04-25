package Academy.DevDojo.LacosDeRepeticao.whiles;

import java.util.Scanner;

public class NumeroAleatorio {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n = 10;
        int numeroUsuario = -1;
        int randomInt = (int) ((Math.random() * n) + 1);
        System.out.println("Digite um número de 1 à 10");
        while(numeroUsuario != randomInt){
            numeroUsuario = teclado.nextInt();
            if (numeroUsuario < randomInt){
                System.out.println("Seu número é menor");
            } else if (numeroUsuario > randomInt) {
                System.out.println("Seu número é maior");
            }
        }
        System.out.println("Acertou");
        teclado.close();
    }
}