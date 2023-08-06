package Abstract;

// cannot be final or static
abstract class GenericRule {
    // cannot be final or static
    abstract public void method1();

}

class SomeRule extends GenericRule {
    @Override
    public void method1() {

    }
}

public class AbstractRules {
    public static void main(String[] args) {
        GenericRule gr = new SomeRule();
    }
}
