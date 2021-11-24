public class Main {
    public static void main(String[] args) {
        Employees[] employees = new Employees[5];
        employees[0] = new Employees("Ivan Ivanov", "Doctor", "ivan123@mail.ru", "89126429654", 30000, 25);
        employees[1] = new Employees("Gleb Pavlov", "Plumber", "glebbear@mail.ru", "89058709123", 32000, 42);
        employees[2] = new Employees("Aleksey Savinov", "Engineer", "savva@gmail.ru", "8090984101", 37000, 29);
        employees[3] = new Employees("Anna Petrova", "Manager", "annsweet@mail.ru", "895078545609", 29000, 31);
        employees[4] = new Employees("Karl Gessen", "Surgeon", "carlthegreat@gmail.ru", "89126969456", 45000, 47);

        System.out.println("Полный список сотрудников:");
        for (Employees persons : employees) {
            persons.printInfo();
        }

        System.out.println();

        int olderThan = 40;
        System.out.println("Сотрудники в возрасте "+ olderThan +" лет (включительно) и старше:");
        for (Employees persons : employees) {
            if (persons.age >= olderThan) {
                persons.printInfo();
            }
        }
    }
}
