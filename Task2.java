// 2) Вывести все простые числа от 1 до 1000

public class Task2{
    public static void main(String[] args) {
        //Проходимся по всем числам от 2 до 1000 и выводим только простые
        for(int i = 2; i<=1000; i++)
        {
            if(isPrime(i)) System.out.println(i);
        }
        
    }
    //Функция проверяет, является ли число простым
    public static boolean isPrime(int n)
    {
        if(n <= 1) return false;

        for(int i = n - 1; i > 1; i--)
        {
            if(n % i == 0) return false;
        }
        return true;
    }
}