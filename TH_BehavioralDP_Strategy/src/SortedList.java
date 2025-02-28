import java.util.ArrayList;
import java.util.List;
import java.util.SimpleTimeZone;

public class SortedList {
    private SortStrategy strategy;
    private List<String> items = new ArrayList<>();

    public void setSortStrategy(SortStrategy strategy){
        this.strategy = strategy;
    }
    public void add(String name){
        items.add(name);
    }
    public void sort(){
        strategy.sort(items);
    }
}
