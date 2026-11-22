public class Main {
    public static void main(String[] args) {

        double[] vendas = {50000.00, 800.00, 450.00, 900.00, 600.00};

        double total = 0;

        for (double valor : vendas) {
            total += valor;
        }

        double media = total / vendas.length;

        System.out.println("Total vendido: R$ " + total);

        System.out.println("Media diaria: R$ " + media);
    }
}