package Task9;

import java.util.Random;
import java.util.Scanner;

public class Poker {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int n;

        // Вводим количество игроков
        do {
            System.out.print("Введите количество игроков (1-10): ");
            n = scanner.nextInt();

            if (n < 1 || n > 10) {
                System.out.println("Ошибка! Введите число от 1 до 10.");
            }

        } while (n < 1 || n > 10);

        String[] suits = {"Черви", "Бубны", "Крести", "Пики"};

        String[] ranks = {
                "2", "3", "4", "5", "6", "7", "8", "9",
                "10", "Валет", "Дама", "Король", "Туз"
        };

        // Создаем колоду из 52 карт
        String[] deck = new String[52];

        int index = 0;

        for (int i = 0; i < suits.length; i++) {

            for (int j = 0; j < ranks.length; j++) {

                deck[index] = ranks[j] + " " + suits[i];
                index++;
            }
        }

        // Перемешиваем карты
        for (int i = 0; i < deck.length; i++) {

            int randomIndex = random.nextInt(deck.length);

            String temp = deck[i];
            deck[i] = deck[randomIndex];
            deck[randomIndex] = temp;
        }

        // Раздаем по 5 карт каждому игроку
        index = 0;

        for (int player = 1; player <= n; player++) {

            System.out.println("Игрок " + player + ":");

            for (int card = 0; card < 5; card++) {

                System.out.println(deck[index]);
                index++;
            }

            System.out.println();
        }
    }
}