// Класс Database для хранения и управления животными
import java.io.*;
import java.util.*;

public class Database {
	private final List<Animal> animals;
	private static final String FILE_PATH = "app/database.txt";

	public Database() {
		animals = new ArrayList<>();
		loadDatabase();
	}

	public void addAnimal(Animal animal) {
		animals.add(animal);
		saveDatabase();
	}

	public void displayAnimalCommands(String name) {
		for (Animal animal : animals) {
			if (animal.getName().equals(name)) {
				animal.displayCommands();
				return;
			}
		}
		System.out.println("Животное с именем " + name + " не найдено.");
	}



	public void teachNewCommand(String name, String command) {
		for (Animal animal : animals) {
			if (animal.getName().equals(name)) {
				String[] commands = command.split(",");
				for (int i = 0; i < commands.length; i++) {
					String trimmedCommand = commands[i].trim();
					commands[i] = trimmedCommand;
				}
				animal.teachNewCommand(command);
				saveDatabase();
				System.out.println("Команда успешно добавлена для животного.");
				return;
			}
		}
		System.out.println("Животное с именем " + name + " не найдено.");
	}


	private void loadDatabase() {
		try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
			String line;
			while ((line = reader.readLine()) != null) {
				String[] data = line.split(",");
				if (data.length >= 3) {
					String className = data[0];
					String name = data[1];
					String skills = String.join(",", Arrays.copyOfRange(data, 2, data.length));

					Animal animal;
					switch (className) {
						case "Dog" -> animal = new Dog(name, skills);
						case "Cat" -> animal = new Cat(name, skills);
						case "Hamster" -> animal = new Hamster(name, skills);
						case "Donkey" -> animal = new Donkey(name, skills);
						case "Horse" -> animal = new Horse(name, skills);
						default -> {
							System.out.println("Неизвестный класс животного: " + className);
							continue;
						}
					}
					animals.add(animal);
				} else {
					System.out.println("Некорректные данные в файле: " + line);
				}
			}
			System.out.println("База данных успешно загружена.");
		} catch (IOException e) {
			System.out.println("Ошибка при чтении базы данных: " + e.getMessage());
		}
	}


	public void displayAllAnimals() {
		try {
			File file = new File(FILE_PATH);
			Scanner fileScanner = new Scanner(file);

			while (fileScanner.hasNextLine()) {
				String animalData = fileScanner.nextLine();
				System.out.println(animalData);
			}

			fileScanner.close();
		} catch (FileNotFoundException e) {
			System.out.println("Файл с данными о животных не найден.");
		}
	}

	private void saveDatabase() {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH))) {
			for (Animal animal : animals) {
				String className = animal.getClass().getSimpleName();
				String name = animal.getName();
				String skills = animal.getSkills().replaceAll(",\\s+", ",");

				String line = className + "," + name + "," + skills;
				writer.write(line);
				writer.newLine();
			}
			System.out.println("База данных успешно сохранена.");
		} catch (IOException e) {
			System.out.println("Ошибка при сохранении базы данных: " + e.getMessage());
		}
	}

}
