package chap18;

import java.util.function.DoubleBinaryOperator;
import java.util.function.IntBinaryOperator;

public class LambdaEx9 {
	private static Student[] list = { 
			new Student("홍길동", 90, 80, "경영"), 
			new Student("김삿갓", 95, 70, "컴공"),
			new Student("이몽룡", 100, 70, "수학")
			};
	public static void main(String[] args) {
		System.out.print("최대수학값:");
		int max = maxOrMinMath(
				   (a,b)->{
					  if(a>=b) return a;
					  else return b;
		         });
		System.out.println(max);
		System.out.print("최소수학값:");
		System.out.println(maxOrMinMath((a,b)->(a<=b?a:b)));
		System.out.print("최대평균값:");
		System.out.println(maxOrMinAvg((a,b)->(a>=b?a:b)));
		System.out.print("최소평균값:");
		System.out.println(maxOrMinAvg((a,b)->(a<=b?a:b)));
	}
	private static int maxOrMinMath(IntBinaryOperator op) {
		int result = list[0].getMath();
		for(Student s : list) {
			result = op.applyAsInt(result, s.getMath());
		}
		return result;
	}
	private static double maxOrMinAvg(DoubleBinaryOperator op) {
		double result = (list[0].getMath() + list[0].getEng()) / 2.0;
		for(Student s : list) {
			result = op.applyAsDouble(result, (s.getMath()+s.getEng())/2.0);
		}
		return result;
	}
}
