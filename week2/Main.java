package week2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Width: ");
        int width = in.nextInt();
        System.out.print("Height: ");
        int height = in.nextInt();

        int AreaRec = width * height;

        System.out.println(AreaRec);
    }
}
