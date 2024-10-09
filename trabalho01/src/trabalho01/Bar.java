package trabalho01;

import java.util.Scanner;

public class Bar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char sexo;
        while (true) {
            System.out.print("-> Sexo (F ou M): ");
            sexo = sc.next().toUpperCase().charAt(0);
            if (sexo == 'F' || sexo == 'M') {
                break;
            } else {
                System.out.println("Erro: Sexo inválido. Informe F ou M.");
            }
        }

        System.out.print("-> Quantidade de cervejas: ");
        int qtdCervejas = sc.nextInt();

        System.out.print("-> Quantidade de refrigerantes: ");
        int qtdRefrigerantes = sc.nextInt();

        System.out.print("-> Quantidade de espetinhos: ");
        int qtdEspetinhos = sc.nextInt();

        double precoCerveja = 5.00;
        double precoRefrigerante = 3.00;
        double precoEspetinho = 7.00;
        double couvertArtistico = 4.00;

        double ingresso = (sexo == 'F') ? 8.00 : 10.00;

        double consumo = (qtdCervejas * precoCerveja) + (qtdRefrigerantes * precoRefrigerante) + (qtdEspetinhos * precoEspetinho);

        double couvert = (consumo > 30.00) ? 0.00 : couvertArtistico;

        double valorTotal = consumo + couvert + ingresso;

        System.out.println("\n=-=- Relatório Final: -=-=\n");
        System.out.printf("Consumo = R$ %.2f%n", consumo);
        if (couvert == 0.00) {
            System.out.println("Couvert = isento");
        } else {
            System.out.printf("Couvert = R$ %.2f%n", couvert);
        }

        System.out.printf("Ingresso = R$ %.2f%n", ingresso);
        System.out.printf("VALOR TOTAL A PAGAR = R$ %.2f%n", valorTotal);

        sc.close();
    }
}
