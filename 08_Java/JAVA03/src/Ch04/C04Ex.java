package Ch04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

public class C04Ex {

	public static void main(String[] args) {
		
		
		
		//1) 1 ~ 45 까지 숫자를 6개 랜덤으로 받아 (Random 클래스를 이용) set에 저장 / 출력
		
		Set<Integer> set = new HashSet();
		
		Random rnd = new Random();
		
		while(set.size()<6) {
			set.add(rnd.nextInt(45)+1);
//			Thread.sleep(500);
		}
		for (int el : set)
			System.out.println(el + " ");
		System.out.println();
		
		//2) [추가] 저장된 set의 오름차순 정렬을 해보세요(검색을 통해서 해결 - 스트링 함수 사용)
		
		//2-1)
//		List<Integer> list = new ArrayList(set);
//		Collections.sort(list);
//		list.forEach(System.out::println);
		
		//2-2)
		List<Integer> list = set.stream().sorted().collect(Collectors.toList());
		list.forEach(System.out::println);
		
		
		
		
	}
}
