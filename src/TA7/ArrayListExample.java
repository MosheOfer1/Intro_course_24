package TA7;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        Student alice = new Student("Alice", 13435246,24);
        Student bob = new Student("Bob", 13543246,23);
        list.add(alice);
        list.add(bob);


        // The long way, Concrete object
        Comparator<Student> ageComp = new AgeComparator();
        list.sort(ageComp);
        System.out.println(list);


        // Anonymous class
        list.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println(list);


        // Lambda
        list.sort((o1, o2)-> o1.compareTo(o2));
        System.out.println(list);


        // Method reference
        list.sort(Student::compareTo);
        System.out.println(list);
    }
}
