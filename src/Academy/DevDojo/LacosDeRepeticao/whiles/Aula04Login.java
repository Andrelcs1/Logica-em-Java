package Academy.DevDojo.LacosDeRepeticao.whiles;

import java.util.Scanner;

public class Aula04Login {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String usuario = "André";
        int senha = 40028922;
        boolean exibirTelaLogin = true;
        while (exibirTelaLogin){
            System.out.println("Digite o nome de usuário:");
            String usuarioDigitado = input.nextLine();
            System.out.println("Digite a senha de usuário:");
            int senhaDigitada = input.nextInt();
            input.nextLine();
            if (usuario.equals(usuarioDigitado) && senha == senhaDigitada){
                System.out.println("ACESSO PERMITIDO");
                exibirTelaLogin = false;
            } else {
                System.out.println("ACESSO NEGADO");
            }
        }
    }
}
