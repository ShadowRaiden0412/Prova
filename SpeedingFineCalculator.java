import java.util.Scanner;

public class SpeedingFineCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a velocidade do veículo em Km/h: ");
        int velocidade = scanner.nextInt();

        if (velocidade > 80) {
            int diff = velocidade - 80;
            int multa = 0;

            if (diff <= 10) {
                multa = 150;
            } else if (diff <= 30) {
                multa = 250;
            } else {
                multa = 400;
            }

            System.out.println("Você ultrapassou a velocidade permitida. Multa a ser paga: " + multa + " reais.");
        } else {
            System.out.println("Você está dentro do limite de velocidade. Não há multa a ser paga.");
        }

        scanner.close();
    }
}