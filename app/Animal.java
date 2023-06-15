public abstract class Animal {
	private String name;
	private String skills;

	public Animal(String name, String skills) {
		this.name = name;
		this.skills = skills;
	}

	public String getName() {
		return name;
	}

	public String getSkills() {
		return skills;
	}

	public void setSkills(String updatedSkills) {
		this.skills = updatedSkills;
	}

	public abstract void displayCommands();

	public abstract void teachNewCommand(String command);
}
