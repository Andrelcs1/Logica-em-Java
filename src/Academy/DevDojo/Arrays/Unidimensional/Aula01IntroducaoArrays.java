package Academy.DevDojo.Arrays.Unidimensional;

public class Aula01IntroducaoArrays {
    public static void main(String[] args){
        double[] notas = new double[5];
        notas[0] = 8;
        notas[1] = 3;
        notas[2] = 5;
        notas[3] = 7;
        notas[4] = 9;
        System.out.println("O tamanho da Arrays é: " + notas.length);
        for (int i = 0; i < notas.length; i++) {
            System.out.println(notas[i]);
        }
    }
}
