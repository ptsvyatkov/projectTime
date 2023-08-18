package annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS) // MyAnno  - will be available in the class when the code is compiled, e.g: when using Reflection
//@Retention(RetentionPolicy.SOURCE)      // - will be available in the source code
//@Retention(RetentionPolicy.SOURCE)      // - will be available at runtime for JVM

@Target(value = {ElementType.METHOD, ElementType.LOCAL_VARIABLE, ElementType.CONSTRUCTOR, ElementType.TYPE })
@interface MyAnno {
    String name(); // name of person who has written a class
    String project(); // for which project
    String date() default "Today"; // on which date
    String version() default "1.0.0"; // for which version
}

//@MyAnno(name="Myself", project = "Test", date = "1999/12/01", version = "1.0.1")
@MyAnno(name="Myself", project = "Test")
public class UserDefinedAnnotations {
    int data;

    public static void main(String[] args) {
        int x = 10;
    }
}
