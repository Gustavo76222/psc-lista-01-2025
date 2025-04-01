import java.util.Scanner;

    public class atv1 {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        System.out.println("Escolha um número :");

        int seuNumero = numero.nextInt();
        System.out.println("Seu número é :" + seuNumero);

        numero.close();
    }
    }