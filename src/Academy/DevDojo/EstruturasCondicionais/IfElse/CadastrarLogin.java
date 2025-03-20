package Academy.DevDojo.EstruturasCondicionais.IfElse;

import java.util.Scanner;

public class CadastrarLogin {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Cadastre seu nome de usuário");
        String nome = input.next();
        if (nome == null || nome.equalsIgnoreCase("admin") || nome.equalsIgnoreCase("administrador")){
            System.out.println("O nome de usuário está invalido");
        } else {System.out.println(nome + " Cadastrado com succeso");}
    }
}
