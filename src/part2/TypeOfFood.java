package part2;

enum Course{
    APPETIZER(Food.Appetizer.class),
    MAINCOURSE(Food.MainCourse.class),
    DESSERT(Food.Dessert.class),
    COFFEE(Food.Coffee.class);
    private Food[] values;
    private Course(Class<? extends Food> kind) {
        values = kind.getEnumConstants();
    }
    public Food[] getValues() {
        return values;
    }
}
public class TypeOfFood {
    public static void main(String[] args) {
        Food food = Food.Coffee.BLACK_COFFEE;
        for (Course c : Course.values()) {
            for (Food f : c.getValues()) {
                System.out.println(f);
            }
        }
    }
}

