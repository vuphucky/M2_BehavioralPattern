public abstract class Meal {
    public final void doMeal(){
        prepareIngerdients();
        cook();
        eat();
        cleanUp();
    }
    public abstract void prepareIngerdients();
    public abstract void cook();
    public void eat(){
        System.out.println("mm, that good");
    }
    public abstract void cleanUp();
}
