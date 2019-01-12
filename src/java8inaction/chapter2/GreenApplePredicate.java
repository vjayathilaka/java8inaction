package java8inaction.chapter2;

public class GreenApplePredicate implements ApplePredicate{

	@Override
	public boolean test(Apple apple) {
		return "Green".equals(apple.getColour());
	}

}
