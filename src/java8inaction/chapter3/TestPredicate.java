package java8inaction.chapter3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

import java8inaction.chapter2.Apple;

public class TestPredicate {

	public static void main(String[] args) {
		
		List<Apple> apples = Arrays.asList(new Apple("Red", 150), new Apple("Green", 340));
	
		filter(apples, apple -> "Red".equals(apple.getColour()));
		filter(apples, apple -> "Green".equals(apple.getColour())); 
		
		useConsumer(apples, apple -> System.out.println(apple.getColour()));
		
		List<String> appleColours = useFunction(apples, apple -> apple.getColour());
		
		appleColours.forEach(System.out::println);
	}
	
	private static <T> List<T> filter(final List<T> items, final Predicate<T> predicate) {
		
		List<T> filteredT = new ArrayList<>();
		for(T t : items) {
			if(predicate.test(t)) {
				filteredT.add(t);
			}
		}
		return filteredT;
	}
	
	private static <T> void useConsumer(final List<T> items, final Consumer<T> consumer) {
		for(T t : items) {
			consumer.accept(t);
		}
		
	}
	
	private static <T, R> List<R> useFunction(final List<T> items, final Function<T, R> function) {
		List<R> list = new ArrayList<>();
		for(T t : items) {
			list.add(function.apply(t));
		}
		return list;
	}


}