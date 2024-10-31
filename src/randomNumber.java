import java.util.Scanner;
import java.util.Random;

public class randomNumber {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int numberRandom = new Random().nextInt(100);
        int guessedNumber = 0;
        int guessedNumberTries = 0;

        while (guessedNumber != numberRandom) {
            System.out.println("Adivinhe um número entre 1 e 100");
            guessedNumber = reader.nextInt();

            if (guessedNumber > numberRandom){
                System.out.println("O chute é maior que o número aleatório");
                guessedNumberTries++;
            } else if (guessedNumber < numberRandom) {
                System.out.println("O chute é menor que o número aleatório");
                guessedNumberTries++;
            }else{
                guessedNumberTries++;
                System.out.println("Parabéns você acertou com: " + guessedNumberTries + " tentativas!");
                break;
            }
        };

        }

    }

