package chap9;
//[예제 9-2]
public class ComplexerEx2 {
	public static void main(String[] args) {
		Complexer com = new Complexer();
		if(com instanceof Complexer)
			System.out.println("com 객체는 Complexer 객체임");
		if(com instanceof Complexerable)
			System.out.println("com 객체는 Complexerable 객체임");
		if(com instanceof Printerable)
			System.out.println("com 객체는 Printerable 객체임");
		if(com instanceof Scannerable)
			System.out.println("com 객체는 Scannerable 객체임");
		if(com instanceof Faxable)
			System.out.println("com 객체는 Faxable 객체임");
		if(com instanceof Object)
			System.out.println("com 객체는 Object 객체임");
	}
}
