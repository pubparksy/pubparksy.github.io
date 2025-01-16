import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 첫 번째 줄 입력: 배열 A의 크기 N과 배열 B의 크기 M
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] A = new int[N];
        int[] B = new int[M];

        // 배열 A 입력
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        // 배열 B 입력
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            B[i] = Integer.parseInt(st.nextToken());
        }

        // 투 포인터를 이용하여 두 배열 합치기
        int i = 0, j = 0;
        StringBuilder sb = new StringBuilder();
        while (i < N && j < M) {
            if (A[i] <= B[j]) {
                sb.append(A[i++]).append(' ');
            } else {
                sb.append(B[j++]).append(' ');
            }
        }

        // 남은 요소 처리
        while (i < N) {
            sb.append(A[i++]).append(' ');
        }
        while (j < M) {
            sb.append(B[j++]).append(' ');
        }

        // 결과 출력
        bw.write(sb.toString().trim());
        bw.flush();
        bw.close();
        br.close();
    }
}