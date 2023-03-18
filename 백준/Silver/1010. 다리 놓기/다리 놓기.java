import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int [][] dp = new int[30][30];

        for(int i=0; i<30; i++) {
            dp[i][i] = 1;
            dp[i][0] = 1;
        }

        for(int i=2; i<30; i++) {
            for(int z=1; z<30; z++) {
                dp[i][z] = dp[i-1][z-1] + dp[i-1][z];
            }
        }

        int T = Integer.parseInt(br.readLine());

        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<T; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            sb.append(dp[M][N]).append('\n');
        }

        System.out.println(sb);
    }

}