import java.util.Scanner;

public class VerificaFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um número: ");
        int numeroInformado = scanner.nextInt();
        scanner.close();

        if (verificaFibonacci(numeroInformado)) {
            System.out.println("O número " + numeroInformado + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numeroInformado + " não pertence à sequência de Fibonacci.");
        }
    }

    public static boolean verificaFibonacci(int numero) {
        int a = 0, b = 1;
        while (b < numero) {
            int temp = b;
            b = a + b;
            a = temp;
        }
        return b == numero;
    }
}