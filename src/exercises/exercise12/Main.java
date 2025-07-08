package exercises.exercise12;

import java.util.Scanner;

public class Main {

    /*
    12 - Faça um algoritmo que leia o valor de um produto e determine o valor que deve ser pago,
    conforme a escolha da forma de pagamento pelo comprador e imprima na tela o valor final do produto a ser pago.
    Utilize os códigos da tabela de condições de pagamento para efetuar o cálculo adequado.

    Tabela de Código de Condições de Pagamento

    1 - À Vista em Dinheiro ou Pix, recebe 15% de desconto

    2 - À Vista no cartão de crédito, recebe 10% de desconto

    3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros

    4 - Parcelado no cartão em três vezes ou mais, preço normal do produto mais juros de 10%
    */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do produto: R$");
        double value = scanner.nextDouble();

        System.out.println("Formas de Pagamentos");
        System.out.println("1 - À Vista em Dinheiro ou Pix, recebe 15% de desconto");
        System.out.println("2 - À Vista no cartão de crédito, recebe 10% de desconto");
        System.out.println("3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros");
        System.out.println("4 - Parcelado no cartão em três vezes ou mais, preço normal do produto mais juros de 10%");

        System.out.print("Opção: ");
        int option = scanner.nextInt();

        double finalValue;

        switch (option) {
            case 1:
                finalValue = value * 0.85;
                System.out.println("O valor final do produto a ser pago é R$" + finalValue);
                break;
            case 2:
                finalValue = value * 0.90;
                System.out.println("O valor final do produto a ser pago é R$" + finalValue);
                break;
            case 3:
                finalValue = value;
                System.out.println("O valor final do produto a ser pago é R$" + finalValue);
                break;
            case 4:
                finalValue = value * 1.1;
                System.out.println("O valor final do produto a ser pago é R$" + finalValue);
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }

        scanner.close();
    }
}
