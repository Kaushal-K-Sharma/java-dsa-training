import java.util.*;

class Student{
    //id name marks
    int id;
    String name;
    int marks;

    Student(int id, String name, int marks){
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public String toString(){
        return id + " " + name + " " + marks;
        
    }
}
// // mark sort
// class MarkComp implements Comparator<Student>{ // comparator =  a way to sort
//     @Override
//     public int compare(Student s1, Student s2){
//         return s1.marks - s2.marks;
//     }
// }
// // id sort
// class IdComp implements Comparator<Student>{ // comparator =  a way to sort
//     @Override
//     public int compare(Student s1, Student s2){
//         return s1.id - s2.id;
//     }
// }


public class comparator{
    public static void main(String[] args){
        List<Student> student = new ArrayList<>();
        student.add(new Student(1,"Rohan",87));
        student.add(new Student(3,"Ram",66));
        student.add(new Student(10,"Tyagi",78));
        student.add(new Student(19,"Ravan",99));

        //Collections.sort(student, new IdComp());
        Collections.sort(student,(a1,a2)->(a1.marks - a2.marks));
        //Collections.sort(student, (a1, a2) -> a1.name.compareTo(a2.name)); // use compareTo function for string data type

        System.out.println(student);
        //student.forEach(System.out::println);
        // for (Student item : student) {
        //     System.out.println(item);
}

}





