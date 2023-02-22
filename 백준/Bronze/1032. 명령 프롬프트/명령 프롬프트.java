import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());

        ArrayList<String> strArray = new ArrayList<String>();


        for(int i=0; i<a; i++) {
            String str = br.readLine();
            strArray.add(str);
        }

        String fistString = strArray.get(0);

        char [] chars = fistString.toCharArray();

        for(int i=0; i<strArray.size(); i++) {
            for(int z=0; z<fistString.length(); z++) {
                if(i != 0) {
                    if(strArray.get(i).charAt(z) != strArray.get(i-1).charAt(z))
                        chars[z] = '?';
                }
            }
        }
        String result = String.valueOf(chars);
        System.out.println(result);
    }
}