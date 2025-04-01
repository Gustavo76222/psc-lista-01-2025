import java.util.Scanner;

public class atv3 {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        System.out.println("Primeira nota :");
        double Num1 = numero.nextDouble();

        System.out.println("Segunda nota :");
        double Num2 = numero.nextDouble();

        System.out.println("Terceira nota :");
        double Num3 = numero.nextDouble();

        System.out.println("Quarta nota :");
        double Num4 = numero.nextDouble();

        double somaNotas = Num1 + Num2 + Num3 + Num4;
        double media = somaNotas / 4;

        System.out.println("A média das nótas é :" + media);

        numero.close();
    }
}
