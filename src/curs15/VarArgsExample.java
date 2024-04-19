package curs15;

public class VarArgsExample {

	public static void main(String[] args) {
		
		printCeva(12,"A", "B");
		printCeva(4, "A", "B", "C");
		printCeva(7);
		
		
		printCevaGenerics(12, true, "ceva");
		printCevaGenerics("Test", 'x', false, 300.6);
		
	}
	
	/*public static void printCeva(String a, String b) {
		System.out.println(a);
		System.out.println(b);
	}*/
	//JavascriptExecutor executeScript (string jscode, WebElement...list
	
	public static void printCeva(int number, String...values) {
		for(String element : values) {
			System.out.println(element);
		}
	}
	
	public static <T> void printCevaGenerics(T...values) {
		for (T element : values) {
			System.out.println(element);
		}
	}

}
