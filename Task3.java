// 3) Реализовать простой калькулятор

import java.util.Scanner;

public class Task3{
    public static void main(String[] args) {
        //float a = readIntFromConsole("Введите первое число: ");
        String operator = readOperatorFromConsole();
        //float b = readIntFromConsole("Введите второе число: ");

    }

    //Функция ввода  числа с проверкой
    public static float readIntFromConsole(String text)
    {
        System.out.print(text);
        Scanner input = new Scanner(System.in);
        while(!input.hasNextFloat())
        {
            System.out.println("\nОшибка ввода, повторите ввод: ");
            input.next();
        }
        float result = input.nextFloat();
        return result;

    }

    public static String readOperatorFromConsole() {
        System.out.print("Введите оператор выражения(/*+-): ");
        Scanner input = new Scanner(System.in);
        String operator = input.nextLine();
        while( !(operator.equals("+") || operator.equals("-") || operator.equals("*") ||operator.equals("/")) )
        {
            System.out.print("Ошибка ввода, повторите: ");
            operator = input.nextLine();
        }
        return operator;
    }
}