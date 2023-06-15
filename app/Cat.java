public class Cat extends Animal {
	public Cat(String name, String skills) {
		super(name, skills);
	}

	@Override
	public void displayCommands() {
		System.out.println("Команды для кошки " + getName() + ": " + getSkills());
	}

	@Override
	public void teachNewCommand(String command) {
		String updatedSkills = getSkills() + "," + command;
		setSkills(updatedSkills);
		System.out.println("Кошка " + getName() + " научилась новой команде: " + command);
	}
}

