package java8inaction.chapter2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestBehaviourParameterization {

	public static void main(String[] args) {
		
		List<Apple> apples = Arrays.asList(new Apple("Red", 160), new Apple("Green", 159));
		
		List<Apple> readApples = getFilteredApple(apples, new ApplePredicate() {			
			@Override
			public boolean test(Apple apple) {
				return "Red".equals(apple.getColour());
			}
		});
		
		List<Apple> greenApple = getFilteredApple(apples, apple -> "Green".equals(apple.getColour()));

	}
	
	private static List<Apple> getFilteredApple(List<Apple> apples, ApplePredicate predicate) {
		List<Apple> filteredApple = new ArrayList<>();
		for(Apple apple : apples) {
			if(predicate.test(apple)) {
				filteredApple.add(apple);
			}
		}
		return filteredApple;
	}
	
	private static List<Apple> printGreenApple(List<Apple> apples) {
		List<Apple> greenApple = new ArrayList<>();
		for(Apple apple : apples) {
			if("Green".equals(apple.getColour())) {
				greenApple.add(apple);
			}
		}
		return greenApple;
	}

}
