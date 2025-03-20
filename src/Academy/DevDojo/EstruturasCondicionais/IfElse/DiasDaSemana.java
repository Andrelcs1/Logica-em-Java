package Academy.DevDojo.EstruturasCondicionais.IfElse;

import java.util.Scanner;

public class DiasDaSemana {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Numero do dia que você deseja saber");
        int diaDaSemana = input.nextInt();
        if (diaDaSemana == 1){
            System.out.println("Segunda-Feira");
        } else if (diaDaSemana == 2) {
            System.out.println("Terça-Feira");}
        else if (diaDaSemana == 3) {
            System.out.println("Quarta-Feira");}
        else if (diaDaSemana == 4) {
            System.out.println("Quinta-Feira");}
        else if (diaDaSemana == 5) {
            System.out.println("Sexta-Feira");}
        else if (diaDaSemana == 6) {
            System.out.println("Sábado");}
        else if (diaDaSemana == 7) {
            System.out.println("Domingo");}
        else {
            System.out.println("Número inválido");
        }
        input.close();
    }
}
