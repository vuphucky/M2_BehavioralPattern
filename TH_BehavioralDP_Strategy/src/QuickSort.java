import java.sql.SQLOutput;
import java.util.List;

public class QuickSort implements SortStrategy{
    @Override
    public <T> void sort(List<T> items) {
        System.out.println("quick sort");
    }
}
