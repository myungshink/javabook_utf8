package chap14;
//[예제 14-4]
import java.util.HashSet;
import java.util.Set;

public class SetEx1 {
	public static void main(String[] args) {
		Object[] arr ={"홍길동",1,"1","김삿갓","이몽룡","홍길동","성춘향","향단이","홍길동","김삿갓"};
		Set<Object> set1 = new HashSet<Object>();
		Set<Object> set2 = new HashSet<Object>();
		Set<Object> set3 = new HashSet<Object>();
		for(int i=0;i < arr.length;i++) {
			if(!set1.add(arr[i])) {
				if(!set2.add(arr[i])) {
					set3.add(arr[i]);
				}
			}
		}
		System.out.println(set1);
		System.out.println(set2);
		System.out.println(set3);
	}
}
