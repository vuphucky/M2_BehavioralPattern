public class HamburgerMeal extends Meal{
    @Override
    public void prepareIngerdients() {
        System.out.println("getting burger, bun, and french fries");
    }

    @Override
    public void cook() {
        System.out.println("cook burgers on grill and fries in oven");
    }

    @Override
    public void cleanUp() {
        System.out.println("throwing away paper plates");
    }
}
