import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in); // Scanner object үүсгэж байна

        System.out.print("Нэрээ оруулна уу: ");
        String name = input.nextLine(); // text авах

        System.out.print("Насаа оруулна уу: ");
        int age = input.nextInt();       // тоо авах

        System.out.println("Сайн байна уу, " + name + "!");
        System.out.println("Таны нас: " + age);
    }
}
