package annotations.test;

import java.lang.reflect.Method;
import java.util.Arrays;

public class Test {
    @TestAnnotation(value = "testAnotation", count = 9)
    public void testAnnotation() {

    }

    public static void main(String[] args) {
        Class<Test> clazz = Test.class;
        Method[] methods = clazz.getDeclaredMethods();

        Arrays.stream(methods).forEach(method -> {

            Arrays.stream(method.getAnnotations()).filter(a -> a.annotationType().equals(TestAnnotation.class)).forEach(a -> {
                TestAnnotation testAnnotation = (TestAnnotation) a;
                System.out.println(testAnnotation.value());
                System.out.println(testAnnotation.count());
            });
        });


    }
}
