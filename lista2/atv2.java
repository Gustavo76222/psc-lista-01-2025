import java.util.Scanner;

public class atv2 {
    public static void main(String[] args) {
        Scanner numero1 = new Scanner(System.in);
        System.out.println("Escolha seu primeiro número :");
        double Num1 = numero1.nextDouble();
        
        Scanner numero2 = new Scanner(System.in);
        System.out.println("Escolha seu  segundo número :");
        double Num2 = numero2.nextDouble();

        double soma = Num1 + Num2;
        double subtracao = Num1 - Num2;
        double multiplicacao  = Num1 * Num2;

        System.out.println("A soma dos números :" + soma);
        System.out.println("A subtração dos números :" + subtracao);
        System.out.println("A multiplicação dos números :" + multiplicacao);

        numero1.close();
        numero2.close();

    }
}
