package _07_duck;

public class Duck {
	private String favoriteFood;
	private int numberOfFriends;

	Duck(String favoriteFood, int numberOfFriends) {
	       this.favoriteFood = favoriteFood;
	       this.numberOfFriends = numberOfFriends;
	}
	void quack() {
		System.out.println("QUACK!!!!!!");
	}
	void waddle() {
		System.out.println("Your duck is waddling");
	}
}
