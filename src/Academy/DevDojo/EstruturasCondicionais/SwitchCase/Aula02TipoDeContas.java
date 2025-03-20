package Academy.DevDojo.EstruturasCondicionais.SwitchCase;

import java.util.Scanner;

public class Aula02TipoDeContas {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Que tipo de conta você gostaria de saber os juros? Conta Poupança, Conta Corrente ou Conta Investimento?");
        String conta = input.nextLine();
        switch (conta.toLowerCase()) {
            case "conta poupança":
                System.out.println("0.05%");
                break;
            case "conta corrente":
                System.out.println("0.02%");
                break;
            case "conta investimento":
                System.out.println("0.01%");
                break;
            default:
                System.out.println("Conta Inválida");
        }
    }
}
