package Academy.DevDojo.EstruturasCondicionais.IfElse;

import java.util.Scanner;

public class IdadeUsuarioPiscina {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String nome = input.next();
        System.out.println("Enter your age: ");
        int idade = input.nextInt();
        if (idade <= 10){
            System.out.println(nome + " é da categoria: Infantil");
        }
        else if (idade > 10 && idade <= 15){
            System.out.println(nome + " é da categoria: Juvenil");
        }
        else if (idade > 15 && idade <= 19){
            System.out.println(nome + " é da categoria: Pré-Adulto");
        }
        else {
            System.out.println(nome + " é da categoria: Adulto");
        }
    }
}
