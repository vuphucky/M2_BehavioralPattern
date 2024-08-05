public class TacoMeal extends Meal{
    @Override
    public void prepareIngerdients() {
        System.out.println("getting ground beef and shell");
    }

    @Override
    public void cook() {
        System.out.println("cooking ground beef in pan");
    }

    @Override
    public void cleanUp() {
        System.out.println("doing the dishes");
    }

    @Override
    public void eat() {
        System.out.println("the tacos are tasty");
    }
}
