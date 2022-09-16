import java.util.*;
public class Calculator {
    static Scanner scanner = new Scanner((System.in));
    public static void main(String[] args) {
        int num1 = getInt();
        int num2 = getInt();
        char operation = getSign();
        int result = calc(num1,num2,operation);
        System.out.println("Решение "+result);
    }
    public static int getInt(){
        System.out.println("Введите число");
        int num;
        if(scanner.hasNextInt()){
            num = scanner.nextInt();
        }else{
            System.out.println("Ошибка!");
            scanner.next();
            num = getInt();
        }
        return num;
    }
    public static char getSign(){
        System.out.println("Введите операцию");
        char sign;
        if(scanner.hasNext()){
            sign = scanner.next().charAt(0);
        }else{
            System.out.println("Ошибка!");
            scanner.next();
            sign = getSign();
        }
        return sign;
    }
    public static int calc(int num1, int num2, char operation){
        int result;
        switch (operation){
            case('+'):result = num1 + num2;
                break;
            case('-'):result = num1 - num2;
                break;
            case('*'):result = num1 * num2;
                break;
            case('/'):result = num1 / num2;
                break;
            default:
                System.out.println("Ошибка. Повторите");
                result = calc(num1, num2, getSign());
        }return result;
    }
}
