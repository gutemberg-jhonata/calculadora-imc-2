import java.util.Scanner;

class CalculadoraIMC {
    static final double NO_PESO_LIMITE_INFERIOR_FEMININO = 19.1;
    static final double NO_PESO_LIMITE_SUPERIOR_FEMININO = 25.8;
    static final double UM_POUCO_ACIMA_PESO_LIMITE_INFERIOR_FEMININO = 25.9;
    static final double UM_POUCO_ACIMA_PESO_LIMITE_SUPERIOR_FEMININO = 27.3;
    static final double ACIMA_PESO_LIMITE_INFERIOR_FEMININO = 27.4;
    static final double ACIMA_PESO_LIMITE_SUPERIOR_FEMININO = 32.3;

    static final double NO_PESO_LIMITE_INFERIOR_MASCULINO = 20.8;
    static final double NO_PESO_LIMITE_SUPERIOR_MASCULINO = 26.4;
    static final double UM_POUCO_ACIMA_PESO_LIMITE_INFERIOR_MASCULINO = 26.5;
    static final double UM_POUCO_ACIMA_PESO_LIMITE_SUPERIOR_MASCULINO = 27.8;
    static final double ACIMA_PESO_LIMITE_INFERIOR_MASCULINO = 27.9;
    static final double ACIMA_PESO_LIMITE_SUPERIOR_MASCULINO = 31.1;

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
            if (imc < NO_PESO_LIMITE_INFERIOR_FEMININO) {
                System.out.println("Abaixo do peso");
            } else if (imc >= NO_PESO_LIMITE_INFERIOR_FEMININO && imc <= NO_PESO_LIMITE_SUPERIOR_FEMININO) {
                System.out.println("No peso ideal");
            } else if (imc >= UM_POUCO_ACIMA_PESO_LIMITE_INFERIOR_FEMININO && imc <= UM_POUCO_ACIMA_PESO_LIMITE_SUPERIOR_FEMININO) {
                System.out.println("Um pouco acima do peso");
            } else if (imc >= ACIMA_PESO_LIMITE_INFERIOR_FEMININO && imc <= ACIMA_PESO_LIMITE_SUPERIOR_FEMININO) {
                System.out.println("Acima do peso ideal");
            } else {
                System.out.println("Obeso");
            }
        } else {
            if (imc < NO_PESO_LIMITE_INFERIOR_MASCULINO) {
                System.out.println("Abaixo do peso");
            } else if (imc >= NO_PESO_LIMITE_INFERIOR_MASCULINO && imc <= NO_PESO_LIMITE_SUPERIOR_MASCULINO) {
                System.out.println("No peso ideal");
            } else if (imc >= UM_POUCO_ACIMA_PESO_LIMITE_INFERIOR_MASCULINO && imc <= UM_POUCO_ACIMA_PESO_LIMITE_SUPERIOR_MASCULINO) {
                System.out.println("Um pouco acima do peso");
            } else if (imc >= ACIMA_PESO_LIMITE_INFERIOR_MASCULINO && imc <= ACIMA_PESO_LIMITE_SUPERIOR_MASCULINO) {
                System.out.println("Acima do peso ideal");
            } else {
                System.out.println("Obeso");
            }
        }
    }
}