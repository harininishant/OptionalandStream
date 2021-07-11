package io.pragra.mavenlearning2;

import java.util.Locale;
import java.util.Optional;
import java.util.function.Function;

public class App {
    private String name="abc";

    public static void main(String[] args) {
        App app = new App();
        // System.out.println(app.getName().toUpperCase());// this will retunr nullpointer exception
        Optional<String> nameoptional = app.getName();
//        nameoptional.filter(s->s.startsWith("h")).ifPresent(s-> System.out.println(s.toUpperCase(Locale.ROOT)));
//        if (nameoptional.isPresent()) {
//            System.out.println(nameoptional.get().toUpperCase()); }
//        nameoptional.ifPresent(s -> System.out.println(s.toUpperCase(Locale.ROOT)));// second approach using lambda
//       nameoptional.map(String::toUpperCase).ifPresent(System.out::println);// map is a transformation method
        //(public<U> Optional<U> map(Function<? super T, ? extends U> mapper))
//flatMap(Student::getName).orElse("dummy student").substring(0,5);
//       System.out.println(StudentName);
//       Student s=new Student("harini",null);
//
//        String studentcourse =Optional.of(s).flatMap(Student::getCourse).orElse("dummy student").toUpperCase(Locale.ROOT);
//        System.out.println(studentcourse);
//
//        System.out.println(nameoptional.orElseGet(App::getDefault));
        //System.out.println(nameoptional.orElseThrow(RuntimeException::new));
        //System.out.println(nameoptional.orElseThrow(()->new RuntimeException("value not present")));// excepton with custom value

    }
    /*
    public String getName(){ // this will retunr nullpointer exception
    return name;
    }
     */

    public Optional<String> getName() { // we use Optional to take care of exception where null comes
       // return name == null ? Optional.empty() : Optional.of(name);
        return Optional.ofNullable(name);// the method has the same as above return.

    }

    private static String getDefault(){
        return "Java Student";
    }

}
