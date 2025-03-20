package Academy.DevDojo.EstruturasCondicionais.IfElse;

public class Logica {
    public static void main(String[] args){
        int idade = 19;
        boolean carteiraCNH = false;
        if (idade < 19 || !carteiraCNH)
            System.out.println("Pode dirigir não");
        else
            System.out.println("Ta liberado para dirigir");
    }
}
