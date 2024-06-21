package quiz20;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class FileQuiz03 {
	
	public static void main(String[] args) {
		
		/*
		 * 상혁이가 입사한 회사에서 매일 오전 아침 7시에 연계사(회사)로 날짜유형의 CSV파일을 매일 전송해줍니다
		 * 
		 * ex) 2024_06_04_data.csv
		 * 
		 * 주의할 점은 내일이 되면 2024_06_05_data.csv
		 * 
		 * 그래서 아침마다 csv 파일을 읽어서 우리의 데이터베이스에 저장하는 프로그램 코드를 생성해야 합니다
		 * 
		 * 1. buffered를 사용해서 오늘날짜패턴_data.csv 파일을 읽어서 한 줄에 하나씩 출력을 하세요
		 * 2. 읽은 데이터는 , 구분자로 만들어져 있는데 , 기준으로 데이터를 분리해서 
		 * 	  getter, setter를 가지는 Data 클래스에 저장하고 이 객체를 리스트에 저장하면 됩니다
		 * 
		 * 힌트)
		 * Data, Data객체는 본인이 생성, ArrayList 사용 
		 */
		
//		LocalDate date = LocalDate.now();
//		String now = date.format(DateTimeFormatter.ofPattern("yyyy_MM_dd")); // 문자열
		
		// 날짜
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy_MM_dd");
		String date = sdf.format(new Date());
		
		// 경로
		String path = "C:\\Users\\user\\Desktop\\course\\upload\\" + date + "_data.csv";
		
		BufferedReader br = null; // 입력
		
		List<Data> list = new ArrayList<>(); // 값을 정리할 리스트 생성
		
		try {
			br = new BufferedReader( new FileReader( path ) );
			
			String str; 
			while( (str = br.readLine()) != null ) {
				
				String[] datalist = str.split(","); // 데이터 분리
				
				System.out.println(Arrays.toString(datalist));
				
				list.add(new Data(datalist[0], datalist[1], datalist[2], datalist[3]));
			}
			
			int i = 0;
			while(i < list.size()) {
				System.out.println(list.get(i));
				i++;
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				System.out.println("모든 정보를 출력하였습니다");
				br.close();
			} catch (Exception e2) {
			}
		}
		
		
	}

}
