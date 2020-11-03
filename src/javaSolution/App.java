package javaSolution;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(final String[] args) {
        final Person person0 = new Person("Penny", 8);
        final Person person1 = new Person("Ruby", 3);
        final Person person2 = new Person("Johnny", 6);
        final Person person3 = new Person("Mark", 1);
        final Person person4 = new Person("Larry", 9);
        final Person person5 = new Person("Karen", 20);
        final Person person6 = new Person("Cecelia", 0);

        final List<Person> people = new ArrayList<>();
        people.add(person0);
        people.add(person1);
        people.add(person2);
        people.add(person3);
        people.add(person4);
        people.add(person5);
        people.add(person6);

        final List<Person> sortedPeople = insertionSort(people);
        System.out.println(sortedPeople);
    }

    public static List<Person> insertionSort(final List<Person> list) {
        for (int j = 1; j < list.size(); j++) {
            final Person k = list.get(j);
            int i = j - 1;

            while (i >= 0 && list.get(i).compareTo(k) > 0) {
                list.set(i + 1, list.get(i));
                i--;
            }

            list.set(i + 1, k);
        }

        return list;
    }

}
