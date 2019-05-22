package chap14;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapEx4 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		String[] names = { "홍길동", "김삿갓", "이몽룡", "임꺽정", "김삿갓" };
		int[] nums = { 1234, 4567, 2350, 9870, 2345 };
		for (int i = 0; i < names.length; i++) {
			map.put(names[i], nums[i]);
		}
		// Map 객체는 (키,객체)쌍으로 이루어진 객체들의 모임.
		// (키,객체)쌍인 객체 조회하기
		Set<Map.Entry<String, Integer>> entry = map.entrySet();
		for (Map.Entry<String, Integer> m : entry) {
			System.out.println(m.getKey() + "=" + m.getValue());
			System.out.println(m);
		}
	}
}
