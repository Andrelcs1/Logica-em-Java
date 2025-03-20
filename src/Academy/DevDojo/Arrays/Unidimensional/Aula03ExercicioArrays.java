package Academy.DevDojo.Arrays.Unidimensional;

public class Aula03ExercicioArrays {
    public static void main(String[] args){
        int[] valor01 = {1,2,3,4,5,6,7,8,9};
        int[] valor02 = {2,3,4,5,6,7,8,9,0};
        int[] valorResultado = new int[9];
        System.out.println("Valor da multiplicação do valor01 e do valor02:");
        for (int i = 0; i < valorResultado.length; i++){
            valorResultado[i] = valor01[i] * valor02[i];
            System.out.println("Valor de [" + i + "]: " + valorResultado[i]);
        }
    }
}
