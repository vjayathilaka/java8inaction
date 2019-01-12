package java8inaction.chapter2;

public class RedApplePredicate implements ApplePredicate{

	@Override
	public boolean test(Apple apple) {
		return "Red".equals(apple.getColour());
	}

}
