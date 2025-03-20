package Academy.DevDojo.Arrays.Multidimensionais;

public class Aula01IntroducaoArraysMultidimensionais {
    public static void main(String[] args){
        int[][] arrayMulti1 = new int[2][2];
        arrayMulti1[0][0] = 22;
        arrayMulti1[0][1] = 95;
        arrayMulti1[1][0] = 32;
        arrayMulti1[1][1] = 40;
        for (int i = 0; i < 2; i++){
            System.out.println(arrayMulti1[i][0]);
            System.out.println(arrayMulti1[i][1]);
        }
    }
}
