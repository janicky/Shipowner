import java.util.List;

public interface Collection<T> {
    boolean add(T element);
    boolean delete(T element);
    List<T> getAll();
    T getShip(int index);
}
