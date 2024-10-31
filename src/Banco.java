import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Digite seu nome");
        String name = reader.nextLine();

        System.out.println("Digite seu valor no banco");
        double currentBalance = reader.nextDouble();
        reader.nextLine();

        System.out.println("Digite seu tipo de conta");
        String balanceName = reader.nextLine();

        String output = String.format("""
                ********************
                Seu nome é: %s
                Seu saldo é: %.2f
                Sua conta é: %s
                ********************
                """, name, currentBalance, balanceName);
        System.out.println(output);

        int decisionNumber = 0;
        while (decisionNumber != 4) {
            System.out.println("""
                    Selecione uma opção para prosseguir:
                    
                    1 - Ver saldo
                    2 - Depositar
                    3 - Transferir
                    4 - Sair
                    
                    """);


            if (reader.hasNextInt()) {
                decisionNumber = reader.nextInt();



                if (decisionNumber == 1) {
                    System.out.println(currentBalance);
                } else if (decisionNumber == 2) {
                    double newBalance = 0;

                    System.out.println("Quanto quer depositar?");
                    newBalance = reader.nextDouble();

                    currentBalance += newBalance;

                    System.out.println("O novo saldo é de: " + currentBalance);
                } else if (decisionNumber == 3) {

                    double newNegativeBalance = 0;

                    System.out.println("Quanto quer transferir?");
                    newNegativeBalance = reader.nextDouble();

                    if(newNegativeBalance > currentBalance){
                        System.out.println("Não há como transferir");
                    }else {
                        currentBalance -= newNegativeBalance;
                    }

                    System.out.println("O novo saldo é de: " + currentBalance);
                } else if (decisionNumber == 4) {
                    break;
                } else {
                    System.out.println("Número inválido");
                }

            }

        }
    }
}
