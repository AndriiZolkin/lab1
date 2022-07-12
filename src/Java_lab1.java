public class Java_lab1 {
    private static void mytasks() {
    int k = 1;
    int variant = 6;
    int result;
    while (k<6) {
        result = (24+variant+(k-1)*25)+1;
        System.out.println("task: "+result);
                k++;
    }
    }
    /*
    * Даны вещественное число а и натуральное число n. Вычислить .
    * S=(1/a)+(1/a^2)+(1/a^4)+...+(1/a^(2n-2))
     */
    private static void task31() {
        double result = 0;
        int n =0;
        int a ;
        int x = 2*n-2;
        int j = 0;
        double final_result ;
        for (double i = 1; i <= x; i*=2) {
            System.out.println(i);
            result += i;

            }
        System.out.println(result);

    }
    private static void task56() {

    }

    private static void task81() {

    }

    private static void task106() {

    }

    public static void task131() {

    }
    public static void main(String[] args) {
            mytasks();
        //  task31();
//          task56();
//          task81();
//          task106();
//          task131();
        }
}