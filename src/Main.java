import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

            try {
                System.out.println("Qual a temperatura em graus celsius? ");
                Scanner myCelciusTemperature = new Scanner(System.in);
                double tempCelsius;
                tempCelsius = myCelciusTemperature.nextDouble();

                double fahrenheit = (tempCelsius * 1.8) + 32;

                int fahrenheitInteiro = (int) fahrenheit;

                System.out.println("Temperatura em fahrenheit: " + fahrenheitInteiro );
            } catch (Exception error) {
                System.out.println("Ocorreu um erro: " + error);
            }


    }
}

