package Academy.DevDojo.LacosDeRepeticao.fors;

public class Aula03ForAninhado {
    public static void main(String[] args){
        for (int i = 1; i <= 10; i++) {
            System.out.println("Taboada de "+ i);
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + "x" + j + "=" + i*j);
            }
        }
    }
}
