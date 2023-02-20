
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int result = 0;
		int N = sc.nextInt();
		int[] a = new int[N];
		int[] b = new int[N];

		for (int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
		}

		for (int i = 0; i < N; i++) {
			b[i] = sc.nextInt();
		}

		Arrays.sort(a);
		Arrays.sort(b);

		for (int i = 0; i < N; i++) {
			result += a[i] * (b[N - 1 - i]);
		}

		System.out.print(result);

		sc.close();
	}

}