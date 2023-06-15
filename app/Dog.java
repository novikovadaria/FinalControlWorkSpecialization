// Класс Dog наследуется от класса Animal
public class Dog extends Animal {
	public Dog(String name, String skills) {
		super(name, skills);
	}

	@Override
	public void displayCommands() {
		System.out.println("Список команд для собаки:");
		System.out.println(getSkills());
	}

	@Override
	public void teachNewCommand(String command) {
		String updatedSkills = getSkills() + "," + command;
		setSkills(updatedSkills);
	}
}
