import java.util.Scanner;

public class atv5 {
    public static void main(String[] args) {
        Scanner viagem = new Scanner(System.in);

        System.out.println("Digite o preço por pessoa para a viagem à Alemanha:");
        double precoAlemanha = viagem.nextDouble();
        System.out.println("Digite a quantidade de pessoas que irão à Alemanha:");
        int pessoasAlemanha = viagem.nextInt();

        System.out.println("Digite o preço por pessoa para a viagem a Portugal:");
        double precoPortugal = viagem.nextDouble();
        System.out.println("Digite a quantidade de pessoas que irão a Portugal:");
        int pessoasPortugal = viagem.nextInt();

        System.out.println("Digite o preço por pessoa para a viagem à Itália:");
        double precoItalia = viagem.nextDouble();
        System.out.println("Digite a quantidade de pessoas que irão à Itália:");
        int pessoasItalia = viagem.nextInt();

        double custoTotalAlemanha = precoAlemanha * pessoasAlemanha;
        double custoTotalPortugal = precoPortugal * pessoasPortugal;
        double custoTotalItalia = precoItalia * pessoasItalia;

        double custoTotalViagem = custoTotalAlemanha + custoTotalPortugal + custoTotalItalia;

        System.out.println("O custo total da viagem é: " + custoTotalViagem);

        viagem.close();
    }
}