package Course60;

public class UseClass {
	public static void main(String[] args) {
		Animal dog = new Dog();
		Animal cat = new Cat();

		//ぽりもーふぃずむ(多様性、多態性)
		dog.nakigoe();
		cat.nakigoe();
	}
}