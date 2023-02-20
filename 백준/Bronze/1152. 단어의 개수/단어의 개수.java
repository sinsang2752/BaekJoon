import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String word = sc.nextLine();
		List<String> arr = new ArrayList<>();

		String [] splitWord = word.split(" ");

		for (int i=0; i<splitWord.length; i++) {
			if (splitWord[i].length() != 0)
				arr.add(splitWord[i]);
		}
		System.out.print(arr.size());

		sc.close();
	}
}