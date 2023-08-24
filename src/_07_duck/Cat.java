package _07_duck;

public class Cat {
	private String favoriteFood;
	private int numberOfFriends;

	Cat(String favoriteFood, int numberOfFriends) {
	       this.favoriteFood = favoriteFood;
	       this.numberOfFriends = numberOfFriends;
	}
	void meow() {
		System.out.println("MEOWWWWWWW");
	}
	void scratch() {
		System.out.println("Your cat is angry and scratches you.");
	}
}
