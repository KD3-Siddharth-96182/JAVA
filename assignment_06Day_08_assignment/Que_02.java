import java.util.*;


class Student {
    private int roll;
    private String name;
    private String city;
    private double marks;

    public Student(int roll, String name, String city, double marks) {
        this.roll = roll;
        this.name = name;
        this.city = city;
        this.marks = marks;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public double getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return roll + " " + name + " " + city + " " + marks;
    }
}

class StudentComparator implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {

        int cityCompare = s2.getCity().compareTo(s1.getCity());
        if (cityCompare != 0)
            return cityCompare;

        int marksCompare = Double.compare(s2.getMarks(), s1.getMarks());
        if (marksCompare != 0)
            return marksCompare;

        return s1.getName().compareTo(s2.getName());
    }
}


public class Que_02 {
    public static void main(String[] args) {

        Student[] arr = {
            new Student(1, "Amit", "Pune", 85),
            new Student(2, "Rahul", "Mumbai", 90),
            new Student(3, "Neha", "Pune", 90),
            new Student(4, "Sneha", "Mumbai", 85),
            new Student(5, "Akash", "Delhi", 90)
        };

        
        Arrays.sort(arr, new StudentComparator());

        for (Student s : arr) {
            System.out.println(s);
        }
    }
}