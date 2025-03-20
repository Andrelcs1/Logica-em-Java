package Academy.DevDojo.EstruturasCondicionais.IfElse;

public class NumeroImparEPar {
    public static void main(String[] args){
        int numero = 7;
        if (numero % 2 == 0) {
            System.out.println("O número é Par: " + numero);
        }else{ System.out.println("O número é Impar: " + numero);
        }
    }
}