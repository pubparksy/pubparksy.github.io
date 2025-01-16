import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    // 첫 번째 줄 입력: 초기 크기, 추가 명령 수, 삭제 명령 수
    String[] firstLine = br.readLine().split(" "); // '정수 공백 정수 공백 정수'를 입력받아서 배열에 저장.
    int initialSize = Integer.parseInt(firstLine[0]); // split return이 String[]라서 Int로 변환
    int addCommands = Integer.parseInt(firstLine[1]);
    int removeCommands = Integer.parseInt(firstLine[2]);

    int currentSize = 0;
    int maxSize = initialSize;

    // 두 번째 줄 입력: 명령어 리스트 처리
    for (int i = 0; i < addCommands + removeCommands; i++) {
      int command = Integer.parseInt(br.readLine());

      if (command == 1) { // 추가 명령
        if (currentSize == maxSize) {
          maxSize *= 2; // 배열 크기 두 배로 확장
        }
        currentSize+=1;
      } else if (command == 0) { // 삭제 명령
        if (currentSize > 0) {
          currentSize-=1;
        }
      }
      
    }

    // 결과 출력
    bw.write(String.valueOf(maxSize));
    bw.newLine();

    // 외부 자원 (파일, 입출력 등) 닫기
    br.close();
    bw.close();
  }
}