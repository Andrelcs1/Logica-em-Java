package Academy.DevDojo.EstruturasCondicionais.IfElse;

public class CalculadoraImportoSalario {
    public static void main(String[] args){
        float wage = 4700.50F;
        if (wage > 4500)
            System.out.println("30% of the wage is: " + wage * 0.3F);
        else System.out.println("15% of the wage is: " + wage * 0.15F);
    }
}
