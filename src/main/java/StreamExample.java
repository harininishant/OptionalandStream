import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {

        //Stream<Double> gen = Stream.generate(Math::random);
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5, 6, 7);
        integerStream.forEach(System.out::println);


    }





}
