package quiz18;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class QueueQuiz02 {
	
	public static void main(String[] args) {
		
		/*
		롤 큐 만들기
		 */
		
		String[] tiers = {"브론즈", "실버", "골딱이"};
		Random random = new Random();

		Queue<Member> member = new LinkedList<>();
		
		for (int i = 0; i < 300; i++) {
			int id = member.hashCode(); // ID는 고유한 해시코드값
			
			String tier = tiers[random.nextInt(tiers.length)];
			member.add(new Member(id, tier));
		}
		
		///////////////////////////////////////////////////////////
		/////////////////////////여기서 부터 문제/////////////////////
		System.out.println("========현재 게임을 신청한 순서=======");
		System.out.println(member);
		/*
		 * member큐에는 게임을 신청한 순서대로 값이 담기게 됩니다.
		 * 게임은 동일한 tier를 가지는 5명씩 한팀을 이루게 됩니다.
		 * 예를들어
		 * 실버, 골드, 골드, 골드, 브론즈, 골드, 골드 ... 로 신청되었다면
		 * 골드 5명이 먼저 한팀으로 먼저 소비 되어야 합니다.
		 * 실버, 골드, 골드, 골드, 브론즈, 골드, 골드, 실버, 실버, 브론즈, 실버, 실버 ... 로 신청되었다면
		 * 골드 5명 -> 실버 5명이 소비 되어야 합니다
		 * 랜덤한 member큐 가 주어질 때, 먼저 소비되어야 하는 팀별로 매칭 팀을 출력해주면 됩니다.
		 */
		
		Queue<Member> gold = new LinkedList<>();
		Queue<Member> silver = new LinkedList<>();
		Queue<Member> bronze = new LinkedList<>();
		
		// 원본큐를 전부 소비할 때까지 반복
//		int match = 1;
//		while(member.isEmpty() == false) {
//			Member m = member.poll();
//			
//			if(m.getTier().equals("골딱이")) { // 멤버의 티어를 확인
//				gold.offer(m);
//				if(gold.size() == 5) {
//					matchig(match, gold);
//					match++;;
//				}
//			} else if(m.getTier().equals("실버")) {
//				silver.offer(m);
//				if(silver.size() == 5) {
//					matchig(match, silver);
//					match++;;
//				}
//			} else if(m.getTier().equals("브론즈")) {
//				bronze.offer(m);
//				if(bronze.size() == 5) {
//					matchig(match, bronze);
//					match++;;
//				}
//			}
//			
//			System.out.println(m);
//		}
		
		while(member.isEmpty() == false) {
			
			Member a = member.peek();
			
			if(a.getTier().equals("골딱이")) {
				gold.add(member.poll());			
			} else if(a.getTier().equals("실버")) {
				silver.add(member.poll());
			} else if(a.getTier().equals("브론즈")) {
				bronze.add(member.poll());
			}
			
		}
		
		System.out.println("원본 큐" + member);
		System.out.println("골드 큐" + gold);
		System.out.println("실버 큐" + silver);
		System.out.println("브론즈 큐" + bronze);
		
		int team = 0;
		
		while(gold.size() > 5) {
			team++;
			System.out.println("<" + team + "번째 팀>");
			for(int i = 1; i <= 5; i++) {
				System.out.println(gold.poll());
			}
		}
		
		while(silver.size() > 5) {
			team++;
			System.out.println("<" + team + "번째 팀>");
			for(int i = 1; i <= 5; i++) {
				System.out.println(silver.poll());
			}
		}
		
		while(bronze.size() > 5) {
			team++;
			System.out.println("<" + team + "번째 팀>");
			for(int i = 1; i <= 5; i++) {
				System.out.println(bronze.poll());
			}
		}
		
		System.out.println("남은 신청자는" + gold.toString() + silver.toString() + bronze.toString() + "입니다");
		
	}
	
	// 소비하는 메서드 (컬렉션을 매개변수로 받을 때 제네릭까지 써준다)
//	public static void matching(int match, Queue<Member> member) { // 5명이 찼을때만 전달됨
//		
//		System.out.println(match + "번째 팀");
//		while(member.isEmpty() == false) {
//			System.out.println(member.poll());
//		}
//		
//	}

}
