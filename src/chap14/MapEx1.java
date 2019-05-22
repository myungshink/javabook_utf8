package chap14;

import java.util.HashMap;
import java.util.Map;

public class MapEx1 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		String[] names = { "홍길동", "김삿갓", "이몽룡", "임꺽정", "김삿갓" };
		int[] nums = { 1234, 4567, 2350, 9870, 2345 };
		for (int i = 0; i < names.length; i++) {
			map.put(names[i], nums[i]);
		}
		System.out.println(map);
		System.out.println("홍길동 번호:" + map.get("홍길동"));
		System.out.println("이몽룡 번호:" + map.get("이몽룡"));
		System.out.println("김삿갓 번호:" + map.get("김삿갓"));
	}
}
