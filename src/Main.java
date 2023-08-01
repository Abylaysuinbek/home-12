import java.util.Scanner;

public class Main {


    //12.1
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int num1 = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt();

        int sum = num1 + num2;
        int multiply = num1 * num2;
        int subtract = num1 - num2;
        int divide = num1 / num2;
        int remainder = num1 % num2;

        System.out.println("Сумма: " + sum);
        System.out.println("Умножение: " + multiply);
        System.out.println("Вычитание: " + subtract);
        System.out.println("Деление: " + divide);
        System.out.println("Остаток: " + remainder);

        scanner.close();

//12.2
        for (int i = 1; i <= 20; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

        //  12.3
        int a = 5;
        int b = 10;

        System.out.println("Исходные значения:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("Меняем значения переменных:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);


//12.6
        String str = "abracadabra";
        String replacedStr = str.replace('a', 'b');
        System.out.println(replacedStr);
//12.7
        int[] numbers = {5, 10, 15, 20, 25};
        int sum1 = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum1 += numbers[i];
        }
        System.out.println("Сумма: " + sum);

//12.8
        int[] numbers2 = {5, 10, 15, 20, 25};
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < numbers2.length; i++) {
            if (numbers2[i] > max) {
                secondMax = max;
                max = numbers2[i];
            } else if (numbers2[i] > secondMax && numbers2[i] < max) {
                secondMax = numbers2[i];
            }
        }
        System.out.println("Второе по величине число: " + secondMax);



    }
    }


