import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student1 implements Comparable<Student1> {

    public int age;
    public String name;
    public int weight;

    public Student1() {
    }

    public Student1(int age, String name, int weight) {
        this.age = age;
        this.name = name;
        this.weight = weight;
    }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getWeight() { return weight; }
    public void setWeight(int weight) { this.weight = weight; }

    @Override
    public String toString() {
        return "Student1 [age=" + age + ", name=" + name + ", weight=" + weight + "]";
    }

    @Override
    public int compareTo(Student1 that) {
        if (this.age == that.age) {
            return this.name.compareTo(that.name);
        }
        return Integer.compare(this.age, that.age);
    }
}

class WeightComparator implements Comparator<Student1>{

    @Override
    public int compare(Student1 o1, Student1 o2) {
        return o1.weight - o2.weight;
    }
    
}

public class File9 {
    public static void main(String[] args) {

        List<Student1> studentList = new ArrayList<>();

        studentList.add(new Student1(1, "Anjali", 45));
        studentList.add(new Student1(2, "NoName", 40));

        Collections.sort(studentList);

        Collections.sort(studentList, new Comparator<Student1>() {

            @Override
            public int compare(Student1 o1, Student1 o2) {
               return o1.weight = o2.weight;
            }
        });

        System.out.println(studentList);

        Collections.sort(studentList, new WeightComparator());
    }
}