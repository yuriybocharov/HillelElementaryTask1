/**
 * Created by Ura on 02.08.2017.
 */
public class Task2 {
  public static void main(String[] args) {
//среднее арифметическое значение произвольного количества чисел.
        Scanner scanner = new Scanner (System.in);

        int a;
        double c = 0;
        double result, b;
        System.out.println ("Какое количество чисел вы хотите ввести: ");
        a = scanner.nextInt ();
        System.out.println ("Введите " + a + " чисел");

        for (int i = 0; i < a; i++) {
            System.out.print ("Введите " + (i + 1) + " число: ");
            b = scanner.nextDouble ();
            c += b;
        }
        result = c / a;
        System.out.println ("среднее арифметическое значение " + result);
    }

}
