import java.util.*;

public class Main {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
    
        String str = sc.nextLine();
    
        String temp [] = str.split(" ");
    
        int a = Integer.parseInt(temp[0]);
        int b = Integer.parseInt(temp[1]);
    
        if (a > b){
           System.out.print(">");
        } else if (a < b){
            System.out.print("<");
        } else if (a == b) {
            System.out.print("==");
        }
    }
}