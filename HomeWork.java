import java.util.Scanner;

public class HomeWork{
    public static void main(String[] args) {
        
        // 1) Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
        int N = readIntFromConsole("Введите число N: ");
        System.out.print("Сумма чисел от 1 до " + N + " равна: " + sum(N) );
        System.out.print("Произведение чисел от 1 до " + N + " равно: " + multiplication(N) );
    }
    
    
    public static int sum(int n) {
        if(n == 1) return 1;
        if(n > 0) return n += sum(n - 1);
        else return n += sum(n + 1);
    }
    public static int multiplication(int n) {
       return 1;
    }
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