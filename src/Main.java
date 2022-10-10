public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        int population = 12000000;
        int birthRate = 17 * population / 1000;
        int deathRate = 8 * population / 1000;

        for (int i = 1; i <= 10; ++i) {
            population += population;
            population -= deathRate;
            System.out.printf("Год %d , численность %d \n", i, population);
        }


        System.out.println("Задание №4");
        int contribution = 15000;
        int monthNum = 1;
        while (contribution < 12000000) {
            contribution *= 1.07;
            System.out.printf("Месяц %d , сумма %d \n", monthNum, contribution);
            monthNum++;
        }
    }

    public static void task5() {
        System.out.println("Задание №5");
        int contribution = 15000;
        int monthNum = 1;
        while (contribution < 12000000) {
            contribution *= 1.07;
            if (monthNum % 6 == 0)
                System.out.printf("Месяц %d , сумма %d \n", monthNum, contribution);
            monthNum++;
        }
    }

    public static void task6() {
        System.out.println("Задание №6");
        int contribution = 15000;
        int monthNum = 1;
        while (contribution < 12000000) {
            contribution *= 1.07;
            if (monthNum % 6 == 0)
                System.out.printf("Месяц %d , сумма %d \n", monthNum, contribution);
            monthNum++;

        }
    }

    public static void task7() {
        System.out.println("Задание №7");
        int firstFriday = 3;
        for (int currentFriday = firstFriday; currentFriday <= 31; currentFriday += 7) {
            System.out.println("Сегодня пятница, " + currentFriday + "ое число. Необходимо подготовить отчёт. ");
        }

    }

    public static void task8() {
        System.out.println("Задание №8");
        int currentYear = 2022;
        int beginning = currentYear - 200;
        int ending = currentYear + 100;
        for (int i = beginning; i < ending; i++) {
            if (i % 79 == 0) {
                System.out.println(i);
            }
        }
    }
        public static void task9() {
            System.out.println("Задание №9");
for (int i = 1; i < 10; i++) {
    System.out.println("2*" + i + "= " + 2 * i);
}
        }
    }


