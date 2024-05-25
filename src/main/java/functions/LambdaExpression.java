package functions;

import functions.objects.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class LambdaExpression {

    @FunctionalInterface
    interface Drawable {
        void draw();
    }

    static void simpleLambda() {
        int width = 10;
        Drawable withLambda = () -> System.out.println("Drawing " + width);
        withLambda.draw();
    }

    @FunctionalInterface
    interface SayAble {
        String say();
    }

    static void sayAbleLambda() {
        SayAble sayAble = () -> "Say able...";
        System.out.println(sayAble.say());
    }

    @FunctionalInterface
    interface SingleParameter {
        String print(String a);
    }

    static void singleParameter() {
        SingleParameter singleParameter = a -> a.toUpperCase();
        System.out.println(singleParameter.print("single parameter..."));

        SingleParameter singleParameterReferenceMethod = String::toLowerCase;
        System.out.println(singleParameterReferenceMethod.print("SINGLE PARAMETER REFERENCE METHOD"));
    }

    @FunctionalInterface
    interface MultipleParameter {
        int add(int a, int b, int c);
    }

    static void multipleParameter() {
        MultipleParameter parameters = (a, b, c) -> a + b + c;
        System.out.println("multipleParameter: " + parameters.add(1, 2, 3));
    }

    static void lambdaComparator() {
        List<Person> listOfPerson = new ArrayList<Person>();
        listOfPerson.add(new Person("abc", 27));
        listOfPerson.add(new Person("mno", 26));
        listOfPerson.add(new Person("pqr", 28));
        listOfPerson.add(new Person("xyz", 27));

        Comparator<Person> personComparator = Comparator.comparingInt(Person::getAge);

        Collections.sort(listOfPerson, personComparator);

        listOfPerson.stream().forEach(person -> System.out.println(person.getName() + " " + person.getAge()));

        Collections.sort(listOfPerson, Collections.reverseOrder(personComparator));

        listOfPerson.stream().forEach(person -> System.out.println(person.getName() + " - " + person.getAge()));

    }

    public static void main(String[] args) {
        simpleLambda();
        sayAbleLambda();
        singleParameter();
        multipleParameter();
        lambdaComparator();
    }
}
