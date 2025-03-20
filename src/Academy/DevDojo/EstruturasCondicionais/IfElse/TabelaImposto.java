package Academy.DevDojo.EstruturasCondicionais.IfElse;

public class TabelaImposto {
    public static void main(String[] args){
        double salario = 1904.23;
        if (salario <= 1903.98){
            System.out.println("Ta livre de imposto");
        }
        else if (salario >= 1903.99 && salario <= 2826.65){
            System.out.printf("7,5%% de %.2f é igual a: %.2f\n", salario, salario * 0.075);

        } else if (salario >= 2826.66 && salario <= 3751.05){
            System.out.println("15% de " + salario + " É igual à: " + (salario * 0.15));
        } else if (salario >= 3751.06 && salario <= 4664.68){
            System.out.println("25% de " + salario + " É igual à: " + (salario * 0.225));
        } else {
            System.out.println("27,5% de " + salario + " É igual à: "+ (salario * 0.275));
        }

    }
}
