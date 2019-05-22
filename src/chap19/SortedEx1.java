package chap19;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortedEx1 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("홍길동","김삿갓","이몽룡","임꺽정");
		System.out.println("기본 정렬");
		list.stream().sorted().forEach(System.out::println);
		System.out.println("기본의 역순 정렬");
		list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
	}
}
