import java.util.Arrays;

public class StreamCollectionDemo {

	public static void main(String[] args) {
		
	 int[] numbers = {1,2,-4,5};
	 printDoubled(numbers);
	 System.out.println(sumAbVals(numbers));

	}
	
	public static void printDoubled(int[] numbers){
		Arrays.stream(numbers).map(n->n * 2).forEach(System.out::println);
	}
	
	public static int sumAbVals(int[] numbers){
		return Arrays.stream(numbers).reduce(0, (a, b) -> Math.abs(a)+Math.abs(b));
	}

}
