import java.util.Scanner;

class CalculadoraIMC {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu sexo (M ou F): ");
        final String sexo = scanner.nextLine();
        System.out.print("Digite seu peso: ");
        final double peso = scanner.nextDouble();
        System.out.print("Digite sua altura: ");
        final double altura = scanner.nextDouble();
        scanner.close();

        final double imc = peso/(altura*altura);
       
        if (sexo == "F") {
            if (imc < 19.1) {
                System.out.println("Abaixo do peso");
            } else if (imc >= 19.1 && imc <= 25.8) {
                System.out.println("No peso ideal");
            } else if (imc >= 25.9 && imc <= 27.3) {
                System.out.println("Um pouco acima do peso");
            } else if (imc >= 27.4 && imc <= 32.3) {
                System.out.println("Acima do peso ideal");
            } else {
                System.out.println("Obeso");
            }
        } else {
            if (imc < 20.7) {
                System.out.println("Abaixo do peso");
            } else if (imc >= 20.8 && imc <= 26.4) {
                System.out.println("No peso ideal");
            } else if (imc >= 26.5 && imc <= 27.8) {
                System.out.println("Um pouco acima do peso");
            } else if (imc >= 27.9 && imc <= 31.1) {
                System.out.println("Acima do peso ideal");
            } else {
                System.out.println("Obeso");
            }
        }
    }
}