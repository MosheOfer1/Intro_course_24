package TA7;

public class Student implements Comparable<Student> {
    private String name;
    private long ID;
    private int age;

    public Student(String name, long ID, int age) {
        this.name = name;
        this.ID = ID;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", ID=" + ID +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.getName().compareTo(o.getName());
    }
}

