import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir not girin:");
        int not = scanner.nextInt();

        if (scanner.hasNextInt()) {
            int not = scanner.nextInt();
            System.out.println("Doğru giriş yapıldı.");
        }
        else if (not < 0 || not > 100) {
            System.out.println("Hatalı giriş yaptınız");
        } else if (not >= 70) {
            System.out.println("Notunuz A");
        } else if (not >= 50) {
            System.out.println("Notunuz B");
        } else if (not >= 35) {
            System.out.println("Notunuz C");
        } else  {
            System.out.println("Notunuz D");
        }
    }
}