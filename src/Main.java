public class Main {
    public static void main(String[] args) {
        int contribution = 15000;
        int total = 0;
        int i = 0;
            while (total < 2_459_000) {
                total = total + total / 100;
                total = total + contribution;
                i = i +1;


                System.out.println("Месяц " + i + " ,cумма накоплений равна " + total + "рублей.");
            }
        }
    }
