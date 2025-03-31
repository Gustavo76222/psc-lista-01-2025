import java.util.Scanner;

public class atv4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Nome
       System.out.println("Escreva seu nome :");
       String seuNome = scanner.nextLine();
       System.out.println("Seu nome é :" + seuNome);

       //Idade
       System.out.println("Escreva sua idade :");
       int suaidade = scanner.nextInt();
       System.out.println("Sua idade é :" + suaidade);

       //Altura
       System.out.println("Escreva sua altura :");
       float suaAltura = scanner.nextFloat();
       System.out.println("Sua altura é :" + suaAltura);

       scanner.close();
    }
}
