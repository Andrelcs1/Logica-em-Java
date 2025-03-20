package Academy.DevDojo.EstruturasCondicionais.IfElse;

import java.util.Scanner;

/*Como secretário de alistamente militar eu gostaria que meu sistema aceitasse os
seguintes parâmetros
para que eu possa
agilizar o processo de cadastramento:
sexo, sendo válido apenas M ou F e idade.
for Masculino
a idade for maior ou igual a 18 o sistema deve imprimir alistamento obrigatório
Se o sexo for Masculino
e a idade for menor que 18 o sistema deve imprimir, alistamento não permitido
Se o sexo
for Feminino e a idade for maior igual a 18 o sistema deve perguntar se a pessoa deseja
se alistar
Se o sexo for Feminino e a idade for menor que 18 o sistema deve imprimir, alistamento
não permitido
*/
public class AlistamentoMilitar {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Sexo (M ou F)?");
        char sexo = Character.toUpperCase(input.next().charAt(0));

        if (sexo != 'M' && sexo != 'F') {
            System.out.println("Falha ao cadastrar o gênero");
            return;
        }{

        System.out.println("Idade:");
        int idade = input.nextInt();

            if (idade >= 18 && sexo == 'M'){
                System.out.println("Alistamento obrigatório");
            } else if (idade < 18 && sexo == 'M') {
                System.out.println("Alistamento não permitido");
            } else if (idade >= 18 && sexo == 'F') {
                System.out.println("Gostaria de se alistar? (S ou N)");
                char verificacao = Character.toUpperCase(input.next().charAt(0));

                if (verificacao == 'S'){
                    System.out.println("Bem-vinda!");
                } else {
                    System.out.println("Cadastro não realizado");
                }
            }
        }
        input.close();
    }
}



