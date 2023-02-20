import java.util.*;

public class Main {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

		double sum = 0;

		String str = sc.nextLine();

		String temp[] = str.split(" ");

		int a = Integer.parseInt(temp[0]);
		double b = Integer.parseInt(temp[1]);

		sum = a / b;

		System.out.println(sum);
    }
}