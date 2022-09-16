import java.util.Scanner;

public class str {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первую строку: ");
        String a = in.nextLine();
        System.out.print("Введите вторую строку: ");
        String b = in.nextLine();
        int len_a = a.length();
        System.out.println("Длина строки a: "+ len_a );
        int len_b = b.length();
        System.out.println("Длина строки b: "+ len_b );
        String d = a.concat(b);
        System.out.println("Объединение строк a и b: " + d);
        System.out.println("Сравнение строк: "+ a.equals(b));



    }
}
