package _07_duck;

public class CatRunner {
	public static void main(String[] args) {
		Duck daffy = new Duck("donuts", 5);
		daffy.quack();
		daffy.waddle();
		Cat kitty = new Cat("crackers", 76555457);
		kitty.meow();
		kitty.scratch();
	}
}
