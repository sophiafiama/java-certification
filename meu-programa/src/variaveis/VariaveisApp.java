package variaveis;

public class VariaveisApp {
    public class TestClass {
        public static final String CONSTANT = "CONSTANT";

        public String getConstant() {
            return CONSTANT;
        }
    }
    public static void main(String[] args) {
        VariaveisApp app = new VariaveisApp();
        TestClass test = app.new TestClass();

        System.out.println(test.getConstant());

        String name = "John";
        final String NAME_USER = "John User";

        System.out.println(name);
        System.out.println(NAME_USER);
    }
}
