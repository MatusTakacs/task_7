public interface Person {
    public void getInfo();
}

class Student implements Person {

    public int studentId = 5;
    public String name = "Me";
    public String surname = "Stillme";
    public int age = 23;

    @Override
    public void getInfo() {
        System.out.println("Student ID: " + studentId + ", Name: " + name + ", Surname: " + surname + ", Age: " + age);
    }
}

class Employee implements Person {

    public String name = "Notme";
    public String surname = "Stillnotme";
    public int age = 32;
    public int retirementAge = 73;

    @Override
    public void getInfo() {
        System.out.println("Employee name: " + name + ", Surname: " + surname + ", Age: " + age);
        System.out.println("Employee will work for " + (retirementAge - age) + " years, when retired at " + retirementAge);
    }
}
