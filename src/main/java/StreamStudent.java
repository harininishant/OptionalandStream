import io.pragra.mavenlearning2.Student;

import java.util.Arrays;
import java.util.List;

import java.util.Optional;
import java.util.stream.Stream;

public class StreamStudent {
    public static void main(String[] args) {
        List<Student> st= Arrays.asList(
                new Student("harini","java",36),
                new Student("harini","java",36),
                new Student("harini","java",36),
                new Student("kiran","java",26),
                new Student("rutika","java",32),
                new Student("Nishant","QA",34));

//         st.stream().forEach(System.out::println);// simply print the list of students
//        System.out.println(st.stream().filter(s->s.getCourse().equals("java")).count());
//        System.out.println("age less than 30="+st.stream().filter(s->s.getAge()<30).count());
//       st.stream().filter(s -> s.getCourse().equals("java")).forEach(System.out::println);
//
//st.stream().map(s->s.getCourse().concat("!")).forEach(System.out::println);
        System.out.println(st.stream().allMatch(s -> s.getName().contains("a")));// boolean alone
        System.out.println(st.stream().anyMatch(s -> s.getAge()>30));// boolean
        st.stream().distinct().forEach(System.out::println);
        System.out.println(st.stream().distinct().count());// removes duplicate value
        Optional<Student> StudentOptional = st.stream().findAny();
        StudentOptional.ifPresent(System.out::println);// its an optional
        Optional<Student> S= st.stream().findFirst();
        S.ifPresent(System.out::println);
        System.out.println(st.stream().peek(s -> System.out.println(s)).count());
        //st.stream().limit(5).forEach(System.out::println);

    }


}
