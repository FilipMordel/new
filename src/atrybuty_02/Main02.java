package atrybuty_02;

public class Main02 {
    public static void main(String[] args) {
        AccessModifier testAttribute = new AccessModifier();
        testAttribute.publicAttribute = "public";
        testAttribute.protectedAttribute = "protected";

        System.out.println(testAttribute.publicAttribute);
        System.out.println(testAttribute.protectedAttribute);



    }
}

