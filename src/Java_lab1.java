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
        double a ;
        int n ;
        double sum = 0;
        double result ;
        a = Math.random();
        n = (int)(Math.random()*100);
        System.out.println(a);
        System.out.println(n);
        int limit = 2*n-2;
        for (double pow = 1;pow<limit; pow*= 2){
            if (pow<(double)limit) {
            System.out.println(pow+" pow");
            } else
                System.out.println();
        }
        result = 1+sum+1/(Math.pow(a,limit)) ;
        System.out.println(result);

       /* double result = 0;
        int n = 0;
        int a;
        int x = 2 * n - 2;
        int j = 0;
        double final_result;
        for (double i = 1; i <= x; i *= 2) {
            System.out.println(i);
            result += i;

        }
        System.out.println(result);
*/
    }

    /**
     * Вычислить сумму : 1+(1/3)+(1/3^2)+...+(1/3^8)
     * без возведения в степень.
     */
    private static void task56() {

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
          task31();
//          task56();
//          task81();
//          task106();
//          task131();
    }
}