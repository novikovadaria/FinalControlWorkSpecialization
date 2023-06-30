# Final Exam
## Project Information
You need to organize an accounting system for a nursery where domestic and draught animals live.

### How to Submit Your Project
To submit your project, you need to create a separate public repository (Github, gitlub, or Bitbucket). Carry out your development in this repository and use pull requests for modifications. Your program should launch and run without errors. The program could be used in various systems, so you need to design a class in the form of a constructor.

### Task
1. Using the Linux operating system's terminal command 'cat', create two files: 'Domestic Animals' (populated with dogs, cats, hamsters) and 'Draught Animals' (populated with horses, camels, and donkeys). Then, merge these two files.
2. View the contents of the created file. Rename the file, giving it a new name ('Human's Friends').
3. Create a directory and move the file there.
4. Connect to the additional MySQL repository. Install any package from this repository.
5. Install and remove the deb-package using dpkg. Post the command history from the Ubuntu terminal. Draw a diagram that includes a parent class, domestic animals, and draught animals.
6. For domestic animals, include classes: dogs, cats, hamsters, and for draught animals: horses, camels, and donkeys.
7. In the connected MySQL repository, create a database called "Human's Friends".
8. Create tables with hierarchy from the diagram in the database. Fill low-level tables with animal names, commands they execute, and birth dates.
9. Remove camels from the table since they decided to move them to another nursery for winter. Merge the horse and donkey tables into one table.
10. Create a new table "young animals" that will include all animals older than 1 year but younger than 3 years. In a separate column, calculate the age of animals in the new table with precision to the month.
11. Combine all tables into one while retaining fields indicating previous ownership to old tables.
12. Create a class with method encapsulation and inheritance from the diagram. Write a program simulating the operation of a pet registry. The program should implement the following functionalities:
- Add a new animal.
- Determine the correct animal class.
- See a list of commands the animal executes.
- Train the animal with new commands.
- Implement menu navigation.
13. Create a counter class, which has an add() method, increasing the value of the internal int variable by 1 when you press "Add a new animal". Make it so that you can work with an object of this type in a try-with-resources block.
14. An exception should be thrown if the work with a counter object was not in resourceful try or/and the resource remained open. Count the value in the try resource if all fields are filled when the animal is introduced.


# Итоговая контрольная работа

## Информация о проекте

Необходимо организовать систему учета для питомника в котором живут
домашние и вьючные животные.

### Как сдавать проект

Для сдачи проекта необходимо создать отдельный общедоступный
репозиторий(Github, gitlub, или Bitbucket). Разработку вести в этом
репозитории, использовать пул реквесты на изменения. Программа должна
запускаться и работать, ошибок при выполнении программы быть не должно.
Программа, может использоваться в различных системах, поэтому необходимо
разработать класс в виде конструктора

### Задание

1. Используя команду cat в терминале операционной системы Linux, создать
   два файла Домашние животные (заполнив файл собаками, кошками,
   хомяками) и Вьючные животными заполнив файл Лошадьми, верблюдами и
   ослы), а затем объединить их. Просмотреть содержимое созданного файла.
   Переименовать файл, дав ему новое имя (Друзья человека).
2. Создать директорию, переместить файл туда.
3. Подключить дополнительный репозиторий MySQL. Установить любой пакет
   из этого репозитория.
4. Установить и удалить deb-пакет с помощью dpkg.
5. Выложить историю команд в терминале ubuntu
6. Нарисовать диаграмму, в которой есть класс родительский класс, домашние
   животные и вьючные животные, в составы которых в случае домашних
   животных войдут классы: собаки, кошки, хомяки, а в класс вьючные животные
   войдут: Лошади, верблюды и ослы).
7. В подключенном MySQL репозитории создать базу данных “Друзья
   человека”
8. Создать таблицы с иерархией из диаграммы в БД
9. Заполнить низкоуровневые таблицы именами(животных), командами
   которые они выполняют и датами рождения
10. Удалив из таблицы верблюдов, т.к. верблюдов решили перевезти в другой
    питомник на зимовку. Объединить таблицы лошади, и ослы в одну таблицу.
11. Создать новую таблицу “молодые животные” в которую попадут все
    животные старше 1 года, но младше 3 лет и в отдельном столбце с точностью
    до месяца подсчитать возраст животных в новой таблице
12. Объединить все таблицы в одну, при этом сохраняя поля, указывающие на
    прошлую принадлежность к старым таблицам.
13. Создать класс с Инкапсуляцией методов и наследованием по диаграмме.
14. Написать программу, имитирующую работу реестра домашних животных. <br>
    В программе должен быть реализован следующий функционал: <br>
    14.1 Завести новое животное <br>
    14.2 определять животное в правильный класс <br>
    14.3 увидеть список команд, которое выполняет животное <br>
    14.4 обучить животное новым командам <br>
    14.5 Реализовать навигацию по меню <br>
15. Создайте класс счетчик, у которого есть метод add(), увеличивающий
    значение внутренней int переменной на 1 при нажатии “Завести новое
    животное” Сделайте так, чтобы с объектом такого типа можно было работать в
    блоке try-with-resources. Нужно бросить исключение, если работа с объектом
    типа счетчик была не в ресурсном try и/или ресурс остался открыт. Значение
    считать в ресурсе try, если при заведении животного заполнены все поля.
