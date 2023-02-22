
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {

    private static Predicate<Integer> num1 = new Predicate<Integer>() {
        @Override
        public boolean test(Integer integer) {
            if (integer < 0) {
                return false;
            }
            return true;
        }
    };
    private static Predicate<Integer> num2 = i -> i > 0;

    private static Consumer <String> name1 = new Consumer<String>() {
        @Override
        public void accept(String s) {
            System.out.println("Hello, " + s + "!");
        }
    };
    private static Consumer<String> name2 = s -> System.out.println("Hello, " + s + "!");

    private static Function<Double, Long> number1 = new Function<Double, Long>() {
        @Override
        public Long apply(Double aDouble) {
            return Math.round(aDouble);
        }
        };


    private static Function<Double, Long> number2 = Math::round;

    private static Supplier<Integer> math = new Supplier<Integer>() {
        @Override
        public Integer get() {
            return (int) (Math.random()*100);
        }
    };
    private static Supplier<Integer> math1 = () -> (int) (Math.random()*100);


    public static void main(String[] args) {
        System.out.println(num1.test(100));
        System.out.println(num2.test(-67));

        name1.accept("Ivan");
        name1.accept("Maria");

        System.out.println(number1.apply(9.908877));
        System.out.println(number2.apply(77.98));

        System.out.println(math.get());
        System.out.println(math1.get());
    }
}


