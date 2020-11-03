package javaSolution;

public class Person implements Comparable<Person> {

    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(final Person o) {
        if (age > o.getAge()) {
            return 1;
        } else if (age < o.getAge()) {
            return -1;
        }

        return 0;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return name + " (" + age + ")";
    }

}
