public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(" " + i);
        }
        for (int i = 10; i > 0; i--) {
            System.out.println(" " + i);
        }
        for (int i = 0; i < 17; i = i + 2) {
            System.out.println(" " + i);
        }
        for (int i = 10; i >= -10; i--) {
            System.out.println(" " + i);
        }
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + " является високосным годом");
        }
        for (int i = 1; i <= 14; i++) {
            System.out.print((7 * i) + " ");
        }
        System.out.println(" ");
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
        int vklad = 29000;
        for (int i = 1; i <= 12; i++) {
            System.out.println("Месяц " + i + ", сумма накоплений равна " + (i*vklad));
        }
    }
}