public class Employees {
    public String fullName;
    public String position;
    public String email;
    public String phoneNumber;
    public int salary;
    public int age;

    protected Employees(String fullName, String position, String email, String phoneNumber, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }


    protected void printInfo() {
        System.out.println("ФИО: " + fullName + ", должность: " + position + ", email: " + email + ", телефон: " + phoneNumber
                + ", з/п: " + salary + ", возраст: " + age);
    }
}
