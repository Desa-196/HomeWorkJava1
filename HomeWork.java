import java.util.Scanner;

public class HomeWork{
    public static void main(String[] args) {
        
        // 1) Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
        int N = readIntFromConsole("Введите число N: ");
        System.out.println("Сумма чисел от 1 до " + N + " равна: " + sum(N) );

        Integer multi = multiplication(N);
        if(multi == null) System.out.println("Факториала для числа "+N+" не существует!");
        else System.out.println("Факториал числа " + N + " равен: " + multi);
    }
    
    //Функция вычисляет сумму чисел от 1 до n, правда в условии не сказано что n только положительное, по этому сделал и для отрицательного n до еденицы
    public static int sum(int n) {
        if(n == 1) return 1;
        if(n > 0) return n += sum(n - 1);
        else return n += sum(n + 1);
    }
    //Функция считает факториал при больших значениях n произойдет переполнение Integer и она вернет 0
    public static Integer multiplication(int n){
       if(n < 0) return null;
       if(n == 0) return 1;
       return n * multiplication(n-1);
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