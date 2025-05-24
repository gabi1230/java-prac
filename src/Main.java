import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in); // Scanner object үүсгэж байна

        System.out.print("Нэрээ оруулна уу: ");
        String name = input.nextLine(); // text авах

        System.out.print("Насаа оруулна уу: ");
        int age = input.nextInt();
        input.nextLine();// тоо авах

        System.out.print("Хүйсээ оруулна уу (эрэгтэй/эмэгтэй): ");
        String gender = input.nextLine();

        System.out.println("Сайн байна уу, " + name + "!");

        if (age>= 18) {
            System.out.println("Та насанд хүрсэн байна.");
        } else {
            System.out.println("Та насанд хүрээгүй байна.");
        }
        if (gender.equalsIgnoreCase("Эрэгтэй")) {
            System.out.println("Та бол ноён" + name + ".");
        } else if (gender.equalsIgnoreCase("эмэгтэй")) {
            System.out.println("Та бол хатагтай" + name + ".");
        } else {
            System.out.println("Таны хүйс тодорхойгүй байна.");
        }
    }
}
