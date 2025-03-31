import java.util.Scanner;

public class atv4 {
    public static void main(String[] args) {
        Scanner Gasolina = new Scanner(System.in);
        System.out.println("Litros por cliente :");
        float litrosGasolina = Gasolina.nextFloat();

        float precoGasolina = 6.35f;
        float valor = litrosGasolina * precoGasolina;

        System.out.println("O valor total a pagar é :" + valor);

        Gasolina.close();
    }
}
