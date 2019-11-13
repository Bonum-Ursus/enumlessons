package part1;

enum MyEnum{A, B, C}
public class Test {
    public static void main(String[] args) {
        for (MyEnum e : MyEnum.values()) {
            System.out.println(e + " : " + e.ordinal());
            System.out.println(e.getDeclaringClass().getSimpleName());
            System.out.println(e.name());
            System.out.println("************");
        }
        for (String s : new String[]{"A","B","C"}) {
            System.out.println(Enum.valueOf(MyEnum.class, s));
        }
    }
}
