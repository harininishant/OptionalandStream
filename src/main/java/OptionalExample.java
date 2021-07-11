
import java.util.Optional;

public class OptionalExample {


           public static void main(String[] args) {
            String surname= "abc" ;

          Optional<String> surnameOptional=Optional.of(surname);
             Optional<String > surname2=Optional.ofNullable(surname);
               System.out.println(surnameOptional.get());
            System.out.println(surnameOptional);
              System.out.println(surname2);
        }
    }




