package Cars.professions;

abstract public class Person {

    public int getAge() {
        return age;
    }

    public Person(int age) {
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private int age;

    @Override
    public String toString() {
        return "Person{" +
                "Возраст: " + age +
                '}';
    }

}
