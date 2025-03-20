package Academy.DevDojo.Arrays.Unidimensional;

import java.util.Scanner;

public class Aula03ExercicioArraysDiferente {
    public static void main(String[] args){
        int[] valor01 = new int[3];
        int[] valor02 = new int[3];
        int[] valorResultado = new int[3];
        Scanner scanner = new Scanner(System.in);
        String resultadoMultiplicacaoArrays = "";
        for (int i = 0; i < valor01.length; i++){
            System.out.println("Vetor 1, posição " + i + ": ");
            valor01[i] = scanner.nextInt();
            System.out.println("Vetor 2, posição " + i + ": ");
            valor02[i] = scanner.nextInt();
            valorResultado[i] = valor01[i] * valor02[i];
            resultadoMultiplicacaoArrays = resultadoMultiplicacaoArrays + valorResultado[i] + " ";
        }
        System.out.println(resultadoMultiplicacaoArrays);
    }
}
