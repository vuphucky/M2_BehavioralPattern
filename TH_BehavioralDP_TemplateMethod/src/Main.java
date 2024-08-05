// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Meal meal = new HamburgerMeal();
        System.out.println("hamburger meal: ");
        meal.doMeal();
        System.out.println("--------");
        Meal meal1 = new TacoMeal();
        System.out.println("tacos meal: ");
        meal1.doMeal();
    }
}