import java.util.Scanner;

public class atv3 {
    public static void main(String[] args) {
        //Nome
       Scanner nome = new Scanner(System.in);
       System.out.println("Escreva seu nome :");
       String seuNome = nome.nextLine();
       System.out.println("Seu nome é :" + seuNome);

       //Idade
       Scanner idade = new Scanner(System.in);
       System.out.println("Escreva sua idade :");
       int suaidade = idade.nextInt();
       System.out.println("Sua idade é :" + suaidade);

       //Altura
       Scanner altura = new Scanner(System.in);
       System.out.println("Escreva sua altura :");
       float suaAltura = altura.nextFloat();
       System.out.println("Sua altura é :" + suaAltura);
       
       nome.close();
       idade.close();
       altura.close();

    }
}
