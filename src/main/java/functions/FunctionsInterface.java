package functions;

import functions.objects.Person;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

public class FunctionsInterface {

    static void predicatedFunction() {
        Predicate<Person> personPredicate = person -> person.getAge() > 25;
        personPredicate = personPredicate.and(person -> person.getAge() < 30);

        System.out.println(personPredicate.test(new Person("son", 231)));
    }

    static void functionFunction() {
        Function<Integer, Double> integerDoubleFunction = x -> new Double(x);
        System.out.println(integerDoubleFunction.apply(4));

        System.out.println(integerDoubleFunction.andThen(x -> x + "abc").apply(5));

        System.out.println(integerDoubleFunction.compose(x -> Math.toIntExact(new Integer(x.toString()).longValue() + 1)).apply(new BigDecimal(5)));

        Function<String, Double> stringDoubleFunction = x -> new Double(x);
        System.out.println(stringDoubleFunction.apply("10"));

        Function<Integer, Person> personIntegerFunction = x -> new Person("a", x);

        System.out.println(personIntegerFunction.apply(20).toString());

    }

    static void supplierFunction() {
        Supplier<Person> personSupplier = () -> new Person("sonSupplier", 30);

        System.out.println(personSupplier.get().toString());
    }

    static void consumerFunction() {
        List<Person> listOfPerson = new ArrayList<>();
        listOfPerson.add(new Person("abc", 27));
        listOfPerson.add(new Person("mno", 26));
        listOfPerson.add(new Person("pqr", 28));
        listOfPerson.add(new Person("xyz", 27));

        Consumer<List<Person>> personConsumer = person -> {
            person.forEach(s -> System.out.println(s.getName() + " " + s.getAge()));
        };
        personConsumer.accept(listOfPerson);

        personConsumer.andThen(personList -> personList.forEach(s -> System.out.println(s.getAge() + 10 + " " + s.getName()))).accept(listOfPerson);
    }


    static void biFunction() {
        BiFunction<Person, Integer, Person> personBiFunction = (a, b)-> new Person(a.getName(), b);

        System.out.println(personBiFunction.apply(new Person("biFunction", 20), 25).toString());
    }

    public static void main(String[] args) {
        predicatedFunction();
        functionFunction();
        supplierFunction();
        consumerFunction();
        biFunction();
    }
}
