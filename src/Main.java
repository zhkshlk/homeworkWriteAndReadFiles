import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("users.txt");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int age = sc.nextInt();
        fileWriter.write("Введите имя пользователя: " + name +
                "\nВведите возраст пользователя: " + age);
        fileWriter.close();
        FileReader fileReader = new FileReader("users.txt");
        Scanner scReader = new Scanner(fileReader);
        while (scReader.hasNextLine()) {
            System.out.println(scReader.nextLine());
        }
    }
}