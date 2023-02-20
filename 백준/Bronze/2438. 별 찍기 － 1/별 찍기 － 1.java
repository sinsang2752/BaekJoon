import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i = 0; i < a; i++) {
            for(int z = 0; z < i + 1; z++)
                System.out.print("*");
            System.out.println();
        }
    }
}