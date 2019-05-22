package chap14;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
public class MapEx2 {
	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<String,Integer>();
		String[] names =	{"홍길동","김삿갓","이몽룡","임꺽정","김삿갓"};
		int[] nums = {1234,4567,2350,9870,2345};
		for(int i=0;i<names.length;i++) {
			map.put(names[i], nums[i]);
		}
		//Map 객체에서 key들만 조회하기
		Set<String> keys = map.keySet();
		for(String key : keys) 
			System.out.println(key + "=" + map.get(key));
		System.out.println("Iterator 이용하여 출력");
		Iterator it = keys.iterator();
		while(it.hasNext())	{
			String a = (String)it.next();
			System.out.println(a+"="+map.get(a));
		}
    }
}
