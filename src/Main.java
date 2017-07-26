import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		
		Predicate<String> containsA = s -> s.contains("A");
		Predicate<String> containsB = s -> s.contains("B");
		Supplier<Double> randomDouble = () -> Math.random();
		Function<String, String> addDot = s -> s+".";
		
		Function<String, String> reverseString = s -> { 
															StringBuilder sb = new StringBuilder();
															char[] original = s.toCharArray();
			                                                for(int i = original.length-1; i>=0; i--){
			                                                	sb.append(original[i]);
			                                                }
			                                                return sb.toString();
														};
														
	   List<String> names = Arrays.asList("Anna", "Dana", "Rana", "Mona");
	   
	   List<String> asone = Stream.of(Arrays.asList("banana", "carrot"), Arrays.asList("melon","apple"))
			   						.flatMap(vegies -> vegies.stream())
			   						.collect(Collectors.toList());
	 System.out.println(asone);

	}
	
	
	
	public static String apply (Function<String, String> function,  String s){
		return function.apply(s);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	public static void applyTest(Predicate<String> test, String s){
		System.out.println(test.test(s)); // test(string) method is defined in the interface: Predicate.
	}


	public static boolean allTestsPass( String s, Predicate<String> ... predicates){
			for(Predicate<String> test : predicates){
				if( test.test(s) == false ) return false;
			}
			return true;
	}
}
