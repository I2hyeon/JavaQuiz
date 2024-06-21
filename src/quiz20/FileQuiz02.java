package quiz20;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class FileQuiz02 {
	
	public static void main(String[] args) {
		
		/*
		 * 1. 빠른 입력을 통해서 사용자로부터 입력을 받습니다
		 * 2. 사용자가 "그만"을 적을때까지 입력받아주면 됩니다
		 * 3. 입력받을 내용을 BufferedWriter를 이용해서 파일을 쓰세요(파일명 랜덤)
		 * 4. 단 사용자가 엔터를 칠 때마다 데이터는 써져야 합니다
		 *
		 *inputStream, outputStream
		 *reader, Writer
		 */
		
		BufferedReader br = null; // 입력
		BufferedWriter bw = null; // 출력
		String path = "C:\\Users\\user\\Desktop\\course\\upload\\hi.txt";
		
		try {
			
			br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.print("입력 > ");
			String str = br.readLine();
			bw = new BufferedWriter(new FileWriter(path));
			
			while(true) {
				System.out.print("입력 > ");
				str = br.readLine(); // nextLine()
				
				if(str.equals("그만")) break;
				
				bw.write(str + "\n"); // 파일로 쓰기
				bw.flush();
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				System.out.println("프로그램 종료");
				br.close();
			} catch (Exception e2) {
			}
		}
		
	}

}
