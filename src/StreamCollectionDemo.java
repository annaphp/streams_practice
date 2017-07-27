import java.util.Arrays;

public class StreamCollectionDemo {

	public static void main(String[] args) {
		
	 int[] numbers = {1,2,-4,5,80};
	 double[] radii = {3.0,1.0,7.2,5.5}; 
//	 printDoubled(numbers);
	 System.out.println(sumAbVals(numbers));
	 System.out.println(largestEven(numbers));
	 System.out.println(totalCircleArea(radii));
	 System.out.println(countNegatives(numbers));

	}
	
	public static void printDoubled(int[] numbers){
		Arrays.stream(numbers).map(n->n * 2).forEach(System.out::println);
	}
	
	public static int sumAbVals(int[] numbers){
		return Arrays.stream(numbers).reduce(0, (a, b) -> Math.abs(a)+Math.abs(b));
	}

	public static int largestEven(int[] numbers){
		return Arrays.stream(numbers).filter(n -> n % 2 == 0).max().getAsInt();
	}
	
	public static double totalCircleArea(double[] numbers){
		return Arrays.stream(numbers).map(n -> Math.round(Math.PI * n * n)).sum();
	}
	
	public static long countNegatives(int[] numbers){
		return Arrays.stream(numbers).filter(n -> n < 0).count();
	}
}
