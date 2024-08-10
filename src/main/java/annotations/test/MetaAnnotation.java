package annotations.test;

import java.lang.annotation.*;

@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface MetaAnnotation {
    TestAnnotation annotation();
}
