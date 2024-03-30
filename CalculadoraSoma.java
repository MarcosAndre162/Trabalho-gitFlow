import java.util.Scanner;

public class CalculadoraSoma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Bem-vindo ao programa de soma de números!");
        
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextInt();
        
        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextInt();
        
        double soma = num1 + num2;
        
        System.out.println("A soma de " + num1 + " + " + num2 + " é igual a: " + soma);
        
        scanner.close();
    }
}