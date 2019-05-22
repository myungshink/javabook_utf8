package chap14;

import java.util.Comparator;
import java.util.TreeSet;
class Phone implements Comparable{
	String name;
	int number;
	Phone(String name, int number) {
		this.name = name;
		this.number = number;
	}
	public String toString() {
		return "(" + name+ "," + number + ")";
	}
	@Override
	public int compareTo(Object o) {
		Phone p = (Phone)o;
		return name.compareTo(p.name);
	}
}
public class SetEx4 {
	public static void main(String[] args) {
		//이름순으로 정렬
		TreeSet<Phone> set = new TreeSet<Phone>();
		set.add(new Phone("홍길동",1234));
		set.add(new Phone("김삿갓",3456));
		set.add(new Phone("이몽룡",5678));
		System.out.println(set);
		//전화번호 오름차순으로 정렬하여 출력하기
		TreeSet<Phone> set2 = new TreeSet<Phone>(new Comparator<Phone>(){
			@Override
			public int compare(Phone o1, Phone o2) {
				return o1.number - o2.number;
			}
		  });
		set2.add(new Phone("홍길동",1234));
		set2.add(new Phone("김삿갓",3456));
		set2.add(new Phone("이몽룡",5678));
		System.out.println(set2);
		//이름의 내림차순으로 정렬하여 출력하기
		TreeSet<Phone> set3 = new TreeSet<Phone>(new NameDesc());
		set3.add(new Phone("홍길동",1234));
		set3.add(new Phone("김삿갓",3456));
		set3.add(new Phone("이몽룡",5678));
		System.out.println(set3);
		//전화번호의 내림차순으로 정렬하여 출력하기
		TreeSet<Phone> set4 =  new TreeSet<Phone>(new NumberDesc());
		set4.add(new Phone("홍길동",1234));
		set4.add(new Phone("김삿갓",3456));
		set4.add(new Phone("이몽룡",5678));
		System.out.println(set4);
	}
}
class NumberDesc implements Comparator<Phone> {
	@Override
	public int compare(Phone o1, Phone o2) {
		return o2.number - o1.number;
	}
}
class NameDesc implements Comparator<Phone> {
	@Override
	public int compare(Phone o1, Phone o2) {
		return o1.compareTo(o2) * (-1);
	}	
}
