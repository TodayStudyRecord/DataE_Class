package Ch04;

import java.util.HashMap;
import java.util.Map;

public class C06MapMain {

	public static void main(String[] args) {
		
		Map<String,Integer> map = new HashMap();
		
		//추가
		map.put("aaa",1111);
		map.put("bbb",2222);
		map.put("ccc",3333);
		map.put("ddd",4444); // older
		map.put("ddd",5555); // newer
		
		//확인
		for(String key : map.keySet()) //["aaa", "bbb", "ccc", "ddd"]
			System.out.println("KEY : " + key + "VALUE : " + map.get(key));
			
		//삭제
		map.remove("aaaa");
		
		//확인
		System.out.println("Size : " + map.size());
		System.out.println("단건 : " + map.get("bbb"));
		
		
		
		
		
		
	}

}
