import java.lang.Math;

/**
 * Zolkin Andrii , #6
 */
public class Java_lab1 {
    private static void mytasks() {
        int k = 1;
        int variant = 6;
        int result;
        while (k < 6) {
            result = (24 + variant + (k - 1) * 25) + 1;
            System.out.println("task: " + result);
            k++;
        }
    }

    /**
     * Даны вещественное число а и натуральное число n. Вычислить .
     * S=(1/a)+(1/a^2)+(1/a^4)+...+(1/a^(2n-2))
     */
    private static void task31() {
        System.out.println("task 31 ");
        int n;
        double sum = 0;
        double result;
        double a;
        a = (int) (Math.random() * 10);
        System.out.println("a : " + a);
        n = (int) (Math.random() * 100);
        System.out.println("n : " + n);
        int limit = 2 * n - 2;
        int pow = 1;
        do {
            pow = pow * 2;
            sum = sum + 1 / (Math.pow(a, pow));
        } while (pow < limit / 2);

        result = sum + 1 / (Math.pow(a, limit));
        System.out.println("result : " + result);
    }

    /**
     * Вычислить сумму : 1+(1/3)+(1/3^2)+...+(1/3^8)
     * без возведения в степень.
     */
    private static void task56() {
        double sum = 1;
        double three_to_power = 1;
        for (int i = 1; i < 9; i++) {
            three_to_power *= 3;
            sum +=1/three_to_power;
            System.out.println("three to the power of "+i+" equals "+three_to_power+" .");
            System.out.println("subtotal : "+sum);
        }
        System.out.println("result : " + sum);
    }

    /**
     * Даны числа а1, a2, …, а10. Определить их сумму.
     */
    private static void task81() {

    }

    /**
     * Дана непустая последовательность натуральных чисел,
     * за которой следует 0. Составить программу поиска
     * в данной непустой последовательности порядкового
     * номера наибольшего элемента.
     */
    private static void task106() {

    }

    /**
     * Проверить, существует ли четырёхзначное целое число,
     * равное четвертой степени суммы своих цифр.
     */
    public static void task131() {

    }

    public static void main(String[] args) {
//          mytasks();
//          task31();
//          task56();
//          task81();
//          task106();
//          task131();
    }
}