package JavaBasics.Sesi1;

import java.util.Scanner;

public class BasicInput {
    public static void main(String[] args) {
        System.out.print("Masukka nama anda: ");
        
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.println("Selamat datang " + name);
        scanner.close();
    }
}
