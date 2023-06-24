import java.util.Scanner;

public class HomeWork{
    public static void main(String[] args) {
        System.out.println(readIntFromConsole("Введите число N: "));
    }
    
    // 1) Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
    //public static int[] sumAndMultiplication(int n) {
     //   return new int {1,1};
    //}
    //Функция ввода целого числа с проверкой
    public static int readIntFromConsole(String text)
    {
        System.out.print(text);
        Scanner input = new Scanner(System.in);
        while(!input.hasNextInt())
        {
            System.out.print("Ошибка ввода, повторите ввод: ");
            input.next();
        }
        int result = input.nextInt();
        input.close();
        return result;

    }
}